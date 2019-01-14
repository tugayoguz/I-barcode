package tr.com.yd.ibarcode.service.util;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.springframework.stereotype.Service;

@Service("securityUtil")
public class SecurityUtil {
	public String encrypt(String str) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			InputStream stream = new ByteArrayInputStream(str.getBytes(StandardCharsets.UTF_8));
			DigestInputStream inputStream = new DigestInputStream(stream, md);
			while (inputStream.read() != -1);
			byte[] hash = md.digest();
			return hexToString(hash);
		} catch (NoSuchAlgorithmException e) {
			System.err.println("NoSuchAlgorithmException");
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			System.err.println("UnsupportedEncodingException");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	private String hexToString(byte[] bytes) {
		StringBuilder hexString = new StringBuilder();

		for (byte aByte : bytes) {
			String hex = Integer.toHexString(0xFF & aByte);
			if (hex.length() == 1) {
				hexString.append('0');
			}
			hexString.append(hex);
		}

		return hexString.toString();
	}
	
	public static void main(String[] args) {
		SecurityUtil util = new SecurityUtil();
		System.out.println(util.encrypt("123456"));
	}

}
