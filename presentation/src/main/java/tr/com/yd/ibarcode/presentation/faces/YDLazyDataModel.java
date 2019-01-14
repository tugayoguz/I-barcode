//package tr.com.yd.ibarcode.presentation.faces;
//
//import java.lang.reflect.ParameterizedType;
//import java.util.List;
//import java.util.Map;
//
//import javax.annotation.PostConstruct;
//
//import org.primefaces.model.LazyDataModel;
//import org.primefaces.model.SortOrder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//
//import tr.com.yd.ibarcode.dao.base.BaseDao;
//import tr.com.yd.ibarcode.domain.base.BaseEntity;
//import tr.com.yd.ibarcode.domain.malzeme.Malzeme;
//import tr.com.yd.ibarcode.service.base.BaseService;
//import tr.com.yd.ibarcode.service.malzeme.MalzemeService;
//
//@Component
//@Scope("prototype")
//public class YDLazyDataModel<T extends BaseEntity> extends LazyDataModel<T>{
//
//
//	@Autowired
//	private MalzemeService lazyDataService;
//
//	@SuppressWarnings("unchecked")
//	@Override
//	public List<T> load(int first, int pageSize, String sortField, SortOrder sortOrder, Map<String, Object> filters) {
//		
//		//setRowCount(10);
//		return (List<T>) this.lazyDataService.lazyLoad(first, pageSize, sortField, SortOrder.ASCENDING.equals(sortOrder), filters, Malzeme.class);
//	}
//	
//	/*public void add(T baseEntity){
//		list.add(baseEntity);
//	}*/
//
//}
