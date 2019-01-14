package tr.com.yd.ibarcode.service.kullanici.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tr.com.yd.ibarcode.dao.kullanici.KullaniciDao;
import tr.com.yd.ibarcode.domain.kullanici.Kullanici;
import tr.com.yd.ibarcode.service.base.impl.BaseServiceImpl;
import tr.com.yd.ibarcode.service.kullanici.KullaniciService;


@Service("kullaniciService")
@Transactional
public class KullaniciServiceImpl extends BaseServiceImpl<Kullanici> implements KullaniciService{

	@Autowired
	private KullaniciDao kullaniciDao;

	@Override
	public Kullanici getKullaniciByKullaniciAdi(String kullaniciKodu) {
		return kullaniciDao.getUserByUserName(kullaniciKodu);
	}

	@Override
	public Kullanici insert(Kullanici kullanici) {
		return kullaniciDao.insert(kullanici);
	}

	@Override
	public Kullanici update(Kullanici kullanici) {
		return kullaniciDao.update(kullanici);
	}

	@Override
	public void delete(Kullanici kullanici) {
		kullaniciDao.delete(kullanici);
	}

	@Override
	public Kullanici findById(Long id) {
		return kullaniciDao.findById(id);
	}

	
	

}
