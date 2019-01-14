package tr.com.yd.ibarcode.service.sistem.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tr.com.yd.ibarcode.dao.sistem.BedenGrupDao;
import tr.com.yd.ibarcode.domain.sistem.BedenGrup;
import tr.com.yd.ibarcode.service.base.impl.BaseServiceImpl;
import tr.com.yd.ibarcode.service.sistem.BedenGrupService;

@Service
@Transactional
public class BedenGrupServiceImpl extends BaseServiceImpl<BedenGrup> implements BedenGrupService{

	@Autowired
	private BedenGrupDao bedenGrupDao;
	
	@Override
	public List<BedenGrup> getAllBedenGrup() {
		return bedenGrupDao.getAllBedenGrup();
	}

	@Override
	public BedenGrup insert(BedenGrup bedenGrup) {
		return bedenGrupDao.insert(bedenGrup);
	}

	@Override
	public BedenGrup update(BedenGrup bedenGrup) {
		return bedenGrupDao.update(bedenGrup);
	}

	@Override
	public void delete(BedenGrup bedenGrup) {
		bedenGrupDao.delete(bedenGrup);
	}

	@Override
	public BedenGrup findById(Long id) {
		return bedenGrupDao.findById(id);
	}

}
