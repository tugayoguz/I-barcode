package tr.com.yd.ibarcode.presentation.managed.bean.login;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;

import tr.com.yd.ibarcode.domain.kullanici.Kullanici;
import tr.com.yd.ibarcode.presentation.managed.session.SessionUser;
import tr.com.yd.ibarcode.service.kullanici.KullaniciService;
import tr.com.yd.ibarcode.service.util.SecurityUtil;

@ManagedBean(name="loginManagedBean")
@ViewScoped
public class LoginManagedBean {

	@ManagedProperty("#{sessionUser}")
	private SessionUser sessionUser;
	
	@ManagedProperty("#{kullaniciService}")
	private KullaniciService kullaniciService;
	
	@ManagedProperty("#{securityUtil}")
	private SecurityUtil securityUtil;

	private String username;
	private String password;
	

	public String doLogin() {

		Kullanici kullanici = kullaniciService.getKullaniciByKullaniciAdi(username);
		if (kullanici == null) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Hata!", "Kullanýcý bulunamadý"));
			return null;
		}

		// Check Password
		String encryptedPassword = securityUtil.encrypt(password);
		if (kullanici.getSifre().equals(encryptedPassword)) {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Hoþ Geldiniz!", kullanici.getKullaniciKodu()));
			sessionUser.setKullanici(kullanici);
			return "/page/template/index?faces-redirect=true";//return "index?faces-redirect=true"
		} else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Hata!", "Þifre Yanlýþ"));
		}

		return null;
	}

	public String doLogout(){
		//getSessionUser().setKullanici(null);
		return "/login?faces-redirect=true";
	}

	// GETTER & SETTER

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public SessionUser getSessionUser() {
		return sessionUser;
	}

	public void setSessionUser(SessionUser sessionUser) {
		this.sessionUser = sessionUser;
	}

	public KullaniciService getKullaniciService() {
		return kullaniciService;
	}

	public void setKullaniciService(KullaniciService kullaniciService) {
		this.kullaniciService = kullaniciService;
	}

	public SecurityUtil getSecurityUtil() {
		return securityUtil;
	}

	public void setSecurityUtil(SecurityUtil securityUtil) {
		this.securityUtil = securityUtil;
	}
	
	
	
}
