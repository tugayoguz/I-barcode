package tr.com.yd.ibarcode.presentation.managed.bean.application;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;


@ManagedBean(name="applicationBean")
@ApplicationScoped
public class ApplicationBean {

	private String defaultTheme;

    @PostConstruct
    public void init() {
        setDefaultTheme("bootstrap");
    }

    // GETTER AND SETTER
    public String getDefaultTheme() {
        return this.defaultTheme;
    }

    public String setDefaultTheme(String defaultTheme) {
        return this.defaultTheme = defaultTheme;
    }
}
