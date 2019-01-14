package tr.com.yd.ibarcode.service.malzeme.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tr.com.yd.ibarcode.dao.malzeme.MalzemeGrubuDao;
import tr.com.yd.ibarcode.domain.malzeme.MalzemeGrubu;
import tr.com.yd.ibarcode.service.base.impl.BaseServiceImpl;
import tr.com.yd.ibarcode.service.malzeme.MalzemeGrubuService;

@Service("malzemeGrubuService")
@Transactional
public class MalzemeGrubuServiceImpl extends BaseServiceImpl<MalzemeGrubu> implements MalzemeGrubuService{

	@Autowired
	private MalzemeGrubuDao malzemeGrubuDao;
	
	
	@Override
	public List<MalzemeGrubu> getAllMazemeGrubu() {
		// TODO Auto-generated method stub
		return malzemeGrubuDao.getAllMalzemeGrubu();
	}


	@Override
	public MalzemeGrubu insert(MalzemeGrubu malzemeGrubu) {
		return malzemeGrubuDao.insert(malzemeGrubu);
	}


	@Override
	public MalzemeGrubu update(MalzemeGrubu malzemeGrubu) {
		return malzemeGrubuDao.update(malzemeGrubu);
	}


	@Override
	public void delete(MalzemeGrubu malzemeGrubu) {
		malzemeGrubuDao.delete(malzemeGrubu);
	}


	@Override
	public MalzemeGrubu findById(Long id) {
		return malzemeGrubuDao.findById(id);
	}

	
}
