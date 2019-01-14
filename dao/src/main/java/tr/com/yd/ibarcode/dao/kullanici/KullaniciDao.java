package tr.com.yd.ibarcode.dao.kullanici;

import tr.com.yd.ibarcode.dao.base.BaseDao;
import tr.com.yd.ibarcode.domain.kullanici.Kullanici;

public interface KullaniciDao extends BaseDao<Kullanici>{

	Kullanici getUserByUserName(String kullaniciKodu);
	
	Kullanici findById(Long id);
}
