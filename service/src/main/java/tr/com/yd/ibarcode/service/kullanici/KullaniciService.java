package tr.com.yd.ibarcode.service.kullanici;

import tr.com.yd.ibarcode.domain.kullanici.Kullanici;
import tr.com.yd.ibarcode.service.base.BaseService;

public interface KullaniciService extends BaseService<Kullanici>{

	Kullanici getKullaniciByKullaniciAdi(String kullaniciKodu);
	
	Kullanici insert(Kullanici kullanici);

	Kullanici update(Kullanici kullanici);

	void delete(Kullanici kullanici);
	
	Kullanici findById(Long id);
}
