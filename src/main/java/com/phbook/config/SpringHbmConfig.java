package com.phbook.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@EnableTransactionManagement
@EnableWebMvc
@ComponentScan(basePackages = {"com.phbook"})
@Configuration
public class SpringHbmConfig implements WebMvcConfigurer {

	
	@Bean
	  public InternalResourceViewResolver getViewResolve() {
		  InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		  resolver.setSuffix(".jsp");
		  resolver.setPrefix("/view/");
	return resolver;	  
	  }
	
	
		
	 @Bean
		public DriverManagerDataSource getDS() {
			DriverManagerDataSource ds = new DriverManagerDataSource();
			ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
			ds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			ds.setUsername("xe");
			ds.setPassword("xe");
			return ds;
		}
		
	     @Bean
	     public LocalSessionFactoryBean getsf() {
	    	 LocalSessionFactoryBean sf = new LocalSessionFactoryBean();
	    	 sf.setDataSource(getDS());
	    	 Properties prop = new Properties();
	    	 prop.put("hibernate.dialect", "org.hibernate.dialect.OracleDialect");
	    	 prop.put("hibernate.hbm2ddl.auto", "update");
	    	 prop.put("hibernate.show_sql", "true");
	    	 sf.setHibernateProperties(prop);
	    	 sf.setPackagesToScan("com.phbook.entity");
	    	 return sf;
	     }
	     
	     @Bean
	     public HibernateTemplate getTemplate() {
	    	 HibernateTemplate template = new HibernateTemplate();
	    	 template.setSessionFactory(getsf().getObject());
	    	 return template;
	     }
	     
	     @Bean
	     public HibernateTransactionManager getTxManager() {
	    	 HibernateTransactionManager tx = new HibernateTransactionManager();
	    	 tx.setSessionFactory(getsf().getObject());
	    	 return tx;
	     }
		
	}

