//package tr.com.yd.ibarcode.presentation.boot;
//
//import org.apache.commons.dbcp.BasicDataSource;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Configurable;
//import org.springframework.beans.factory.config.CustomScopeConfigurer;
//import org.springframework.boot.context.embedded.ServletListenerRegistrationBean;
//import org.springframework.boot.context.embedded.ServletRegistrationBean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.orm.hibernate5.HibernateTransactionManager;
//import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//import java.util.Properties;
//
//import javax.faces.webapp.FacesServlet;
//import javax.servlet.DispatcherType;
//import javax.servlet.ServletContext;
//import javax.sql.DataSource;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.context.ServletContextAware;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//import com.sun.faces.config.ConfigureListener;
//
//import tr.com.yd.ibarcode.presentation.managed.filter.AuthenticationFilter;
//import tr.com.yd.ibarcode.presentation.scope.ViewScope;
//
//@ComponentScan(basePackages="tr.com.yd.ibarcode.")
//@EnableTransactionManagement
//@Configurable
//public class SpringConfig implements ServletContextAware {
//
//
//	@Bean
//	public DataSource getDataSource(){
//		BasicDataSource basicDataSource = new BasicDataSource();
//		basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
//		basicDataSource.setUrl("jdbc:mysql://localhost:3306/ibarcode");//jdbc:mysql://localhost:3306/spring_hibernate_dev?createDatabaseIfNotExist=true
//		basicDataSource.setPassword("root");
//		basicDataSource.setPassword("root");
//		return basicDataSource;
//	}
//
//	@Bean
//	public LocalSessionFactoryBean getSessionFactory(){
//		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
//		sessionFactory.setDataSource(getDataSource());
//		sessionFactory.setPackagesToScan(new String[] {"tr.com.yd.ibarcode.domain"});
//		sessionFactory.setHibernateProperties(hibernateProperties());
//		return sessionFactory;
//	}
//
//	//	@Bean
//	//	public EmbeddedServletContainerCustomizer containerCustomizer() {
//	//		return (container -> {
//	//			container.setPort(8012);
//	//		});
//	//	}
//
//	@Bean
//	public ServletRegistrationBean facesServletRegistration() {
//		ServletRegistrationBean registration = new ServletRegistrationBean(
//				new FacesServlet(), "*.xhtml");
//		registration.setLoadOnStartup(1);
//		return registration;
//	}
//
//	@Bean
//	public ViewResolver getViewResolver() {
//		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//		resolver.setPrefix("/login/");
//		resolver.setSuffix(".xhtml");
//		return resolver;
//	}
//
//	@Bean
//	public ServletListenerRegistrationBean<ConfigureListener> jsfConfigureListener() {
//		return new ServletListenerRegistrationBean<ConfigureListener>(
//				new ConfigureListener());
//	}
//
//	@Bean
//	public CustomScopeConfigurer viewScope(){
//		CustomScopeConfigurer configurer = new CustomScopeConfigurer();
//		configurer.addScope("view", new ViewScope());
//		return configurer;
//	}
//
//	@Bean
//	@Autowired
//	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
//
//		HibernateTransactionManager txManager
//		= new HibernateTransactionManager();
//		txManager.setSessionFactory(sessionFactory);
//
//		return txManager;
//	}
//
//	@Override
//	public void setServletContext(ServletContext servletContext) {
//		servletContext.setInitParameter("com.sun.faces.forceLoadConfiguration", Boolean.TRUE.toString());
//		servletContext.addFilter("test",AuthenticationFilter.class);
//	}
//
//	private final Properties hibernateProperties() {
//		final Properties hibernateProperties = new Properties();
//		hibernateProperties.setProperty("hibernate.hbm2ddl.auto","none");
//		hibernateProperties.setProperty("hibernate.dialect","org.hibernate.dialect.MySQL5Dialect");
//		hibernateProperties.setProperty("hibernate.show_sql","true");
//
//		return hibernateProperties;
//	}
//
//
//}
