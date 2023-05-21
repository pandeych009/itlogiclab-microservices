package com.itlogiclab.billing.config;

import java.sql.SQLException;

import javax.naming.NamingException;
import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.apache.catalina.Context;
import org.apache.catalina.startup.Tomcat;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.tomcat.util.descriptor.web.ContextResource;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.embedded.tomcat.TomcatWebServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;    

import com.itlogiclab.billing.entity.BillEntity;
import com.itlogiclab.billing.utils.BillingConstants;

@Configuration
@EnableJpaRepositories(basePackages = "com.itlogiclab.billing.repos")
@EnableTransactionManagement
public class TomcatFactoryConfig {
	private static Logger logger = LogManager.getLogger(TomcatFactoryConfig.class); 

	@Bean
	public DataSourceConfigJndi getDataSourceConfig() {
		return new DataSourceConfigJndi();
	}
	
	@Bean
	public TomcatServletWebServerFactory getTomcatFactory() {
		TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory() {
			@Override
			public TomcatWebServer getTomcatWebServer(Tomcat tomcat) {
				tomcat.enableNaming();
				return super.getTomcatWebServer(tomcat);
			}
			
			@Override
	        protected void postProcessContext(Context context) {
				
				DataSourceConfigJndi jndiProps = getDataSourceConfig();
				logger.debug("DataSource Props: "+jndiProps);
				
				ContextResource resource = new ContextResource();
	            resource.setName(getDataSourceConfig().getJndiName());
	            resource.setType(DataSource.class.getName());
	            
	            resource.setProperty(BillingConstants.FACTORY, "org.apache.tomcat.jdbc.pool.DataSourceFactory");
	            
	            resource.setProperty(BillingConstants.DRIVER_CLASS_NAME, jndiProps.getDriverClassName());
	           

	            resource.setProperty(BillingConstants.URL, jndiProps.getUrl());
	            resource.setProperty(BillingConstants.USERNAME, jndiProps.getUsername());
	            resource.setProperty(BillingConstants.PASSWORD, jndiProps.getPassword());
	            
	            resource.setProperty(BillingConstants.INITIAL_SIZE, jndiProps.getInitialSize());
	            resource.setProperty(BillingConstants.MAX_ACTIVE, jndiProps.getMaxActive());
	            resource.setProperty(BillingConstants.MAX_IDLE, jndiProps.getMaxIdle());
	            resource.setProperty(BillingConstants.MAX_WAIT, jndiProps.getMaxWait());
	            resource.setProperty(BillingConstants.MIN_EVICTABLE_IDLE_TIME_MILLIS, jndiProps.getMinEvictableIdleTimeMillis());
	            resource.setProperty(BillingConstants.MIN_IDLE, jndiProps.getMinIdle());
	            
	            resource.setProperty(BillingConstants.REMOVE_ABANDONED_TIME_OUT, jndiProps.getRemoveAbandonedTimeout());
	            resource.setProperty(BillingConstants.TIME_BETWEEN_EVICTION_RUNS_MILLIS, jndiProps.getTimeBetweenEvictionRunsMillis());
	            resource.setProperty(BillingConstants.VALIDATION_QUERY, jndiProps.getValidationQuery());
	            resource.setProperty(BillingConstants.VALIDATION_QUERY_TIMEOUT, jndiProps.getValidationQueryTimeout());
	            
	            resource.setProperty(BillingConstants.DEFAULT_AUTO_COMMIT, String.valueOf(jndiProps.getDefaultAutoCommit()));
	            resource.setProperty(BillingConstants.DEFAULT_READ_ONLY, String.valueOf(jndiProps.getDefaultReadOnly()));
	            resource.setProperty(BillingConstants.LOG_ABANDONED, String.valueOf(jndiProps.getLogAbandoned()));
	            resource.setProperty(BillingConstants.TEST_ON_BORROW, String.valueOf(jndiProps.getTestOnBorrow()));
	            resource.setProperty(BillingConstants.TEST_ON_CONNECT, String.valueOf(jndiProps.getTestOnConnect()));
	            resource.setProperty(BillingConstants.TEST_ON_RETURN, String.valueOf(jndiProps.getTestOnReturn()));
	            resource.setProperty(BillingConstants.REMOVE_ABANDONED, String.valueOf(jndiProps.getRemoveAbandoned()));
	            
	            
	            
	            context.getNamingResources().addResource(resource);  
	        }
	    };
	    return tomcat;
	}
	
	@Bean(destroyMethod = "")
	public DataSource jndiDataSource() throws IllegalArgumentException, NamingException {
		JndiObjectFactoryBean bean = new JndiObjectFactoryBean();
		bean.setJndiName(BillingConstants.JAVA_COMP_ENV + getDataSourceConfig().getJndiName());
		bean.setProxyInterface(DataSource.class);
		bean.setLookupOnStartup(false);
		bean.afterPropertiesSet();
		return (DataSource) bean.getObject();
	}
	
	@Bean
	public EntityManagerFactory entityManagerFactory() throws SQLException, IllegalArgumentException, NamingException {
		
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		vendorAdapter.setDatabase(Database.MYSQL);
		vendorAdapter.setShowSql(true);
		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		factory.setJpaVendorAdapter(vendorAdapter);
		factory.setPackagesToScan(new String[]{BillEntity.class.getPackage().getName()});

		factory.setDataSource(jndiDataSource());
		factory.afterPropertiesSet();
		return factory.getObject();
	}
	
	@Bean
	public PlatformTransactionManager transactionManager()throws SQLException, IllegalArgumentException, NamingException {
		JpaTransactionManager txManager = new JpaTransactionManager();
		txManager.setEntityManagerFactory(entityManagerFactory());
		return txManager;
	}
	
	
}

//https://www.scaler.com/topics/spring-boot/spring-boot-auto-configuration/
