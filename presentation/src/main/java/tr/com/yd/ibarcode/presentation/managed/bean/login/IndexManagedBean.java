package tr.com.yd.ibarcode.presentation.managed.bean.login;

import org.primefaces.event.DashboardReorderEvent;
import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import tr.com.yd.ibarcode.domain.stok.Envanter;
import tr.com.yd.ibarcode.service.stok.EnvanterService;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

@Component
@Scope("view")
public class IndexManagedBean {
	
	@Autowired
	private EnvanterService envanterService;

	private String barcode;
	
	private List<Envanter> envanterList;

    @PostConstruct
    public void init() {
    	
    }

    public void findBarcode(){
    	envanterList.add(envanterService.findByBarcode(getBarcode()));
    }
    

    // GETTER AND SETTER
	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public List<Envanter> getEnvanterList() {
		return envanterList;
	}

	public void setEnvanterList(List<Envanter> envanterList) {
		this.envanterList = envanterList;
	}

}