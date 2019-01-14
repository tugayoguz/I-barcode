package tr.com.yd.ibarcode.service.stok;

import java.util.List;

import tr.com.yd.ibarcode.domain.malzeme.Malzeme;
import tr.com.yd.ibarcode.domain.stok.Envanter;
import tr.com.yd.ibarcode.service.base.BaseService;

public interface EnvanterService extends BaseService<Envanter>{

	List<Envanter> getAllEnvanter();

	Envanter insert(Envanter envanter);

	Envanter update(Envanter envanter);

	void delete(Envanter envanter);
	
	Envanter findByBarcode(String barcode);
}
