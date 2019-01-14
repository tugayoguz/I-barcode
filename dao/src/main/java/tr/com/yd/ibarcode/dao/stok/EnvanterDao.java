package tr.com.yd.ibarcode.dao.stok;

import java.util.List;

import tr.com.yd.ibarcode.dao.base.BaseDao;
import tr.com.yd.ibarcode.domain.stok.Envanter;

public interface EnvanterDao extends BaseDao<Envanter>{

	List<Envanter> getAllEnvanter();

	Envanter findById(Long id);
	
	Envanter findByBarcode(String barcode);
}
