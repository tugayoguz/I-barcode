package tr.com.yd.ibarcode.service.stok.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tr.com.yd.ibarcode.dao.stok.EnvanterDao;
import tr.com.yd.ibarcode.domain.stok.Envanter;
import tr.com.yd.ibarcode.service.base.impl.BaseServiceImpl;
import tr.com.yd.ibarcode.service.stok.EnvanterService;

@Service
@Transactional
public class EnvanterServiceImpl extends BaseServiceImpl<Envanter> implements EnvanterService{
	
	@Autowired
	private EnvanterDao envanterDao;

	@Override
	public List<Envanter> getAllEnvanter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Envanter insert(Envanter envanter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Envanter update(Envanter envanter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Envanter envanter) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Envanter findByBarcode(String barcode) {
		// TODO Auto-generated method stub
		return null;
	}

}
