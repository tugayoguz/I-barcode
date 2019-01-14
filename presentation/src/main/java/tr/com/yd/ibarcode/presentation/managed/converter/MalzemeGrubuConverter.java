package tr.com.yd.ibarcode.presentation.managed.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tr.com.yd.ibarcode.domain.malzeme.MalzemeGrubu;
import tr.com.yd.ibarcode.service.malzeme.MalzemeGrubuService;

@Service
public class MalzemeGrubuConverter implements Converter {

	@Autowired
	private MalzemeGrubuService malzemeGrubuService;

	@Override
	public Object getAsObject(FacesContext facesContext, UIComponent uIComponent, String value) {
		System.out.println(value);
		if (value == null || "Seçiniz".equals(value) || value.trim().equalsIgnoreCase("")) {
			return null;
		}
		return malzemeGrubuService.findById(new Long(value));
	}

	@Override
	public String getAsString(FacesContext facesContext, UIComponent uIComponent, Object value) {
		if (value == null || value.getClass() == java.lang.String.class) {
			return null;
		}
		return "" +((MalzemeGrubu)value).getId();

	}

	public MalzemeGrubuService getMalzemeGrubuService() {
		return malzemeGrubuService;
	}

	public void setMalzemeGrubuService(MalzemeGrubuService malzemeGrubuService) {
		this.malzemeGrubuService = malzemeGrubuService;
	}
	
	

}
