package tr.com.yd.ibarcode.presentation.managed.session;

import java.util.Locale;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import tr.com.yd.ibarcode.domain.kullanici.Kullanici;
import tr.com.yd.ibarcode.presentation.managed.bean.application.ApplicationBean;
import tr.com.yd.ibarcode.service.kullanici.KullaniciService;


@ManagedBean(name="sessionUser")
@SessionScoped
public class SessionUser {

	@ManagedProperty("#{applicationBean}")
	private ApplicationBean applicationBean;

	@ManagedProperty("#{kullaniciService}")
	private KullaniciService kullaniciService;

	private String theme = "bootstrap";

	private Locale locale;

	private Kullanici kullanici;

	@PostConstruct
	public void init() {
		setTheme(getApplicationBean().getDefaultTheme()); // TODO: if kullanici theme is null
		//kullanici = kullaniciService.getKullaniciByKullaniciAdi("12345678910"); //TODO: burasý statik olmayacak!
		        //birim = getBirimService().getBirimById(8105L); //TODO: burasý statik olmayacak!
	}

	public ApplicationBean getApplicationBean() {
		return applicationBean;
	}

	public void setApplicationBean(ApplicationBean applicationBean) {
		this.applicationBean = applicationBean;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public Locale getLocale() {
		if (locale == null) {
			locale = new Locale("tr_TR");
		}
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	public Kullanici getKullanici() {
		return kullanici;
	}

	public void setKullanici(Kullanici kullanici) {
		this.kullanici = kullanici;
	}

	public KullaniciService getKullaniciService() {
		return kullaniciService;
	}

	public void setKullaniciService(KullaniciService kullaniciService) {
		this.kullaniciService = kullaniciService;
	}
	
}
