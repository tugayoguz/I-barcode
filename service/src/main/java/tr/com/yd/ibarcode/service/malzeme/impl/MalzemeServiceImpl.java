package tr.com.yd.ibarcode.service.malzeme.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tr.com.yd.ibarcode.dao.malzeme.MalzemeDao;
import tr.com.yd.ibarcode.domain.malzeme.Malzeme;
import tr.com.yd.ibarcode.service.base.impl.BaseServiceImpl;
import tr.com.yd.ibarcode.service.malzeme.MalzemeService;

@Service("malzemeService")
@Transactional
public class MalzemeServiceImpl extends BaseServiceImpl<Malzeme> implements MalzemeService{

	
	@Autowired
	private MalzemeDao malzemeDao;

	@Override
	public List<Malzeme> getAllMalzeme() {
		return malzemeDao.getAllMalzeme();
	}

	@Override
	public Malzeme insert(Malzeme malzeme) {
		return malzemeDao.insert(malzeme);
	}

	@Override
	public Malzeme update(Malzeme malzeme) {
		return malzemeDao.update(malzeme);
	}

	@Override
	public void delete(Malzeme malzeme) {
		malzemeDao.delete(malzeme);
	}


}
