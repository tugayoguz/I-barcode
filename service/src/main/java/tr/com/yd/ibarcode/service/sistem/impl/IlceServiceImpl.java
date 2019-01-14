package tr.com.yd.ibarcode.service.sistem.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tr.com.yd.ibarcode.dao.sistem.IlceDao;
import tr.com.yd.ibarcode.domain.sistem.Il;
import tr.com.yd.ibarcode.domain.sistem.Ilce;
import tr.com.yd.ibarcode.service.base.impl.BaseServiceImpl;
import tr.com.yd.ibarcode.service.sistem.IlceService;

@Service
@Transactional
public class IlceServiceImpl extends BaseServiceImpl<Ilce> implements IlceService{

	@Autowired
	private IlceDao ilceDao;

	@Override
	public List<Ilce> getAllIlce() {
		return ilceDao.getAllIlce();
	}
	
	@Override
	public List<Ilce> getIlceByIl(Il il) {
		return ilceDao.getIlceByIl(il);
	}

	@Override
	public Ilce insert(Ilce ilce) {
		return ilceDao.insert(ilce);
	}

	@Override
	public Ilce update(Ilce ilce) {
		return ilceDao.update(ilce);
	}

	@Override
	public void delete(Ilce ilce) {
		ilceDao.delete(ilce);
	}

	@Override
	public Ilce findById(Long id) {
		return ilceDao.findyById(id);
	}
}
