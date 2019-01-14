package tr.com.yd.ibarcode.presentation.managed.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;

import org.springframework.beans.factory.annotation.Autowired;

import tr.com.yd.ibarcode.domain.sistem.BedenGrup;
import tr.com.yd.ibarcode.service.sistem.BedenGrupService;

public class BedenGrupConverter implements Converter {

	@Autowired
	private BedenGrupService bedenGrupService;

	@Override
	public Object getAsObject(FacesContext facesContext, UIComponent uIComponent, String value) {
		System.out.println(value);
		if (value == null || "Seçiniz".equals(value) || value.trim().equalsIgnoreCase("")) {
			return null;
		}
		return bedenGrupService.findById(new Long(value));
	}

	@Override
	public String getAsString(FacesContext facesContext, UIComponent uIComponent, Object value) {
		if (value == null || value.getClass() == java.lang.String.class) {
			return null;
		}
		return "" +((BedenGrup)value).getId();

	}

	public BedenGrupService getBedenGrupService() {
		return bedenGrupService;
	}

	public void setBedenGrupService(BedenGrupService bedenGrupService) {
		this.bedenGrupService = bedenGrupService;
	}



}

