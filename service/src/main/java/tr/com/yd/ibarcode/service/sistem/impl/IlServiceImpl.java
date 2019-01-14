package tr.com.yd.ibarcode.service.sistem.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tr.com.yd.ibarcode.dao.sistem.IlDao;
import tr.com.yd.ibarcode.domain.sistem.Il;
import tr.com.yd.ibarcode.service.base.impl.BaseServiceImpl;
import tr.com.yd.ibarcode.service.sistem.IlService;

@Service
@Transactional
public class IlServiceImpl extends BaseServiceImpl<Il> implements IlService{

	@Autowired
	private IlDao ilDao;

	@Override
	public List<Il> getAllIl() {
		return ilDao.getAllIl();
	}

	@Override
	public Il insert(Il il) {
		return ilDao.insert(il);
	}

	@Override
	public Il update(Il il) {
		return ilDao.update(il);
	}

	@Override
	public void delete(Il il) {
		ilDao.delete(il);
	}

	@Override
	public Il findById(Long id) {
		return ilDao.findById(id);
	}
	
}
