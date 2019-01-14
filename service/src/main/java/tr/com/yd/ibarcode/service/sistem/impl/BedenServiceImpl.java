package tr.com.yd.ibarcode.service.sistem.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tr.com.yd.ibarcode.dao.sistem.BedenDao;
import tr.com.yd.ibarcode.domain.sistem.Beden;
import tr.com.yd.ibarcode.domain.sistem.BedenGrup;
import tr.com.yd.ibarcode.service.base.impl.BaseServiceImpl;
import tr.com.yd.ibarcode.service.sistem.BedenService;

@Service
@Transactional
public class BedenServiceImpl extends BaseServiceImpl<Beden> implements BedenService{

	@Autowired
	private BedenDao bedenDao;

	@Override
	public List<Beden> getAllBeden() {
		return bedenDao.getAllBeden();
	}
	
	@Override
	public List<Beden> getBedenByBedenGrupId(BedenGrup bedenGrup) {
		return bedenDao.getBedenByBedenGrupId(bedenGrup);
	}

	@Override
	public Beden insert(Beden beden) {
		return bedenDao.insert(beden);
	}

	@Override
	public Beden update(Beden beden) {
		return bedenDao.update(beden);
	}

	@Override
	public void delete(Beden beden) {
		bedenDao.delete(beden);
	}

	@Override
	public Beden findById(Long id) {
		return bedenDao.findById(id);
	}

	
}
