package tr.com.yd.ibarcode.presentation.managed.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.springframework.beans.factory.annotation.Autowired;

import tr.com.yd.ibarcode.domain.sistem.Beden;
import tr.com.yd.ibarcode.service.sistem.BedenService;

public class BedenConverter implements Converter {

	@Autowired
	private BedenService bedenService;

	@Override
	public Object getAsObject(FacesContext facesContext, UIComponent uIComponent, String value) {
		System.out.println(value);
		if (value == null || "Seçiniz".equals(value) || value.trim().equalsIgnoreCase("")) {
			return null;
		}
		return bedenService.findById(new Long(value));
	}

	@Override
	public String getAsString(FacesContext facesContext, UIComponent uIComponent, Object value) {
		if (value == null || value.getClass() == java.lang.String.class) {
			return null;
		}
		return "" +((Beden)value).getId();

	}

	public BedenService getBedenService() {
		return bedenService;
	}

	public void setBedenService(BedenService bedenService) {
		this.bedenService = bedenService;
	}

}
