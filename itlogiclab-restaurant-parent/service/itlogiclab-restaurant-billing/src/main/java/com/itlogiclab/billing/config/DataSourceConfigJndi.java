package com.itlogiclab.billing.config;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.itlogiclab.billing.utils.BillingConstants;

@Configuration
@PropertySource("classpath:database-application2.properties")
@ConfigurationProperties(prefix = "database")
public class DataSourceConfigJndi{
	
	@Autowired
	private Environment env;

	private String jndiName;

	private String auth;

	private String type; 

	private String url;

	private String username;

	private String password;

	private String defaultAutoCommit;	

	private String defaultReadOnly;	

	private String driverClassName;	

	private String maxActive;	

	private String maxIdle;	

	private String minIdle;

	private String initialSize;

	private String maxWait;	


	private String testOnBorrow;

	private String testOnConnect;

	private String testOnReturn;

	private String testWhileIdle;

	private String validationQuery;

	private String validationQueryTimeout;

	private String validatorClassName;


	private String timeBetweenEvictionRunsMillis;	

	private String minEvictableIdleTimeMillis	;

	private String removeAbandoned;	

	private String removeAbandonedTimeout;

	private String logAbandoned;

	/**
	 * @return the name
	 */
	public String getJndiName() {
		return Objects.isNull(env.getProperty(BillingConstants.ENV_JNDI_NAME)) ? jndiName : env.getProperty(BillingConstants.ENV_JNDI_NAME);
	}


	/**
	 * @return the auth
	 */
	public String getAuth() {
		return Objects.isNull(env.getProperty(BillingConstants.ENV_AUTH)) ? auth : env.getProperty(BillingConstants.ENV_AUTH);
	}



	/**
	 * @return the type
	 */
	public String getType() {
		return Objects.isNull(env.getProperty(BillingConstants.ENV_TYPE)) ? type : env.getProperty(BillingConstants.ENV_TYPE);
	}



	/**
	 * @return the url
	 */
	public String getUrl() {
		return Objects.isNull(env.getProperty(BillingConstants.ENV_URL)) ? url : env.getProperty(BillingConstants.ENV_URL);
	}



	/**
	 * @return the username
	 */
	public String getUsername() {
		return Objects.isNull(env.getProperty(BillingConstants.ENV_USERNAME)) ? username : env.getProperty(BillingConstants.ENV_USERNAME);
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return Objects.isNull(env.getProperty(BillingConstants.ENV_PASSWORD)) ? password : env.getProperty(BillingConstants.ENV_PASSWORD);
	}


	/**
	 * @return the defaultAutoCommit
	 */
	public String getDefaultAutoCommit() {
		return Objects.isNull(env.getProperty(BillingConstants.ENV_AUTOCOMMIT)) ? defaultAutoCommit : env.getProperty(BillingConstants.ENV_AUTOCOMMIT);
	}


	/**
	 * @return the defaultReadOnly
	 */
	public String getDefaultReadOnly() {
		return Objects.isNull(env.getProperty(BillingConstants.ENV_READONLY)) ? defaultReadOnly : env.getProperty(BillingConstants.ENV_READONLY);
	}


	/**
	 * @return the driverClassName
	 */
	public String getDriverClassName() {
		return Objects.isNull(env.getProperty(BillingConstants.ENV_DRIVER_CLASSNAME)) ? driverClassName : env.getProperty(BillingConstants.ENV_DRIVER_CLASSNAME);
	}



	/**
	 * @return the maxActive
	 */
	public String getMaxActive() {
		return Objects.isNull(env.getProperty(BillingConstants.ENV_MAX_ACTIVE)) ? maxActive : env.getProperty(BillingConstants.ENV_MAX_ACTIVE);
	}


	/**
	 * @return the maxIdle
	 */
	public String getMaxIdle() {
		return Objects.isNull(env.getProperty(BillingConstants.ENV_MAX_IDLE)) ? maxIdle : env.getProperty(BillingConstants.ENV_MAX_IDLE);
	}


	/**
	 * @return the minIdle
	 */
	public String getMinIdle() {
		return Objects.isNull(env.getProperty(BillingConstants.ENV_MIN_IDLE)) ? minIdle : env.getProperty(BillingConstants.ENV_MIN_IDLE);
	}


	/**
	 * @return the initialSize
	 */
	public String getInitialSize() {
		return Objects.isNull(env.getProperty(BillingConstants.ENV_INITIAL_SIZE)) ? initialSize : env.getProperty(BillingConstants.ENV_INITIAL_SIZE);
	}


	/**
	 * @return the maxWait
	 */
	public String getMaxWait() {
		return Objects.isNull(env.getProperty(BillingConstants.ENV_MAX_WAIT)) ? maxWait : env.getProperty(BillingConstants.ENV_MAX_WAIT);
	}

	/**
	 * @return the testOnBorrow
	 */
	public String getTestOnBorrow() {
		return Objects.isNull(env.getProperty(BillingConstants.ENV_TEST_ON_BORROW)) ? testOnBorrow : env.getProperty(BillingConstants.ENV_TEST_ON_BORROW);
	}


	/**
	 * @return the testOnConnect
	 */
	public String getTestOnConnect() {
		return Objects.isNull(env.getProperty(BillingConstants.ENV_TEST_ON_CONNECT)) ? testOnConnect : env.getProperty(BillingConstants.ENV_TEST_ON_CONNECT);
	}



	/**
	 * @return the testOnReturn
	 */
	public String getTestOnReturn() {
		return Objects.isNull(env.getProperty(BillingConstants.ENV_TEST_ON_RETURN)) ? testOnReturn : env.getProperty(BillingConstants.ENV_TEST_ON_RETURN);
	}



	/**
	 * @return the testWhileIdle
	 */
	public String getTestWhileIdle() {
		return Objects.isNull(env.getProperty(BillingConstants.ENV_WHILE_IDLE)) ? testWhileIdle : env.getProperty(BillingConstants.ENV_WHILE_IDLE);
	}



	/**
	 * @return the validationQuery
	 */
	public String getValidationQuery() {
		return Objects.isNull(env.getProperty(BillingConstants.ENV_VALIDATION_QUERY)) ? validationQuery : env.getProperty(BillingConstants.ENV_VALIDATION_QUERY);
	}


	/**
	 * @return the validationQueryTimeout
	 */
	public String getValidationQueryTimeout() {
		return Objects.isNull(env.getProperty(BillingConstants.ENV_VALIDATION_QUERY_TIMEOUT)) ? validationQueryTimeout : env.getProperty(BillingConstants.ENV_VALIDATION_QUERY_TIMEOUT);
	}



	/**
	 * @return the validatorClassName
	 */
	public String getValidatorClassName() {
		return Objects.isNull(env.getProperty(BillingConstants.ENV_VALIDATIOR_CLASS_NAME)) ? validatorClassName : env.getProperty(BillingConstants.ENV_VALIDATIOR_CLASS_NAME);
	}


	/**
	 * @return the timeBetweenEvictionRunsMillis
	 */
	public String getTimeBetweenEvictionRunsMillis() {
		return Objects.isNull(env.getProperty(BillingConstants.ENV_TIME_BETWEEN_EVICTION_RUNS_MILLIS)) ? timeBetweenEvictionRunsMillis : env.getProperty(BillingConstants.TIME_BETWEEN_EVICTION_RUNS_MILLIS);
	}


	/**
	 * @return the minEvictableIdleTimeMillis
	 */
	public String getMinEvictableIdleTimeMillis() {
		return Objects.isNull(env.getProperty(BillingConstants.ENV_MIN_EVICTABLE_IDLE_TIME_MILLIS)) ? minEvictableIdleTimeMillis : env.getProperty(BillingConstants.ENV_MIN_EVICTABLE_IDLE_TIME_MILLIS);
	}



	/**
	 * @return the removeAbandoned
	 */
	public String getRemoveAbandoned() {
		return Objects.isNull(env.getProperty(BillingConstants.ENV_REMOVE_ABANDON)) ? removeAbandoned : env.getProperty(BillingConstants.ENV_REMOVE_ABANDON);
	}


	/**
	 * @return the removeAbandonedTimeout
	 */
	public String getRemoveAbandonedTimeout() {
		return Objects.isNull(env.getProperty(BillingConstants.ENV_REMOVE_ABANDON_TIMEOUT)) ? removeAbandonedTimeout : env.getProperty(BillingConstants.ENV_REMOVE_ABANDON_TIMEOUT);
	}


	/**
	 * @return the logAbandoned
	 */
	public String getLogAbandoned() {
		return Objects.isNull(env.getProperty(BillingConstants.ENV_LOG_ABANDON)) ? logAbandoned : env.getProperty(BillingConstants.ENV_LOG_ABANDON);
	}

	
	

	/**
	 * @param env the env to set
	 */
	public void setEnv(Environment env) {
		this.env = env;
	}


	/**
	 * @param jndiName the jndiName to set
	 */
	public void setJndiName(String jndiName) {
		this.jndiName = jndiName;
	}


	/**
	 * @param auth the auth to set
	 */
	public void setAuth(String auth) {
		this.auth = auth;
	}


	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}


	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}


	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @param defaultAutoCommit the defaultAutoCommit to set
	 */
	public void setDefaultAutoCommit(String defaultAutoCommit) {
		this.defaultAutoCommit = defaultAutoCommit;
	}


	/**
	 * @param defaultReadOnly the defaultReadOnly to set
	 */
	public void setDefaultReadOnly(String defaultReadOnly) {
		this.defaultReadOnly = defaultReadOnly;
	}


	/**
	 * @param driverClassName the driverClassName to set
	 */
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}


	/**
	 * @param maxActive the maxActive to set
	 */
	public void setMaxActive(String maxActive) {
		this.maxActive = maxActive;
	}


	/**
	 * @param maxIdle the maxIdle to set
	 */
	public void setMaxIdle(String maxIdle) {
		this.maxIdle = maxIdle;
	}


	/**
	 * @param minIdle the minIdle to set
	 */
	public void setMinIdle(String minIdle) {
		this.minIdle = minIdle;
	}


	/**
	 * @param initialSize the initialSize to set
	 */
	public void setInitialSize(String initialSize) {
		this.initialSize = initialSize;
	}


	/**
	 * @param maxWait the maxWait to set
	 */
	public void setMaxWait(String maxWait) {
		this.maxWait = maxWait;
	}


	/**
	 * @param testOnBorrow the testOnBorrow to set
	 */
	public void setTestOnBorrow(String testOnBorrow) {
		this.testOnBorrow = testOnBorrow;
	}


	/**
	 * @param testOnConnect the testOnConnect to set
	 */
	public void setTestOnConnect(String testOnConnect) {
		this.testOnConnect = testOnConnect;
	}


	/**
	 * @param testOnReturn the testOnReturn to set
	 */
	public void setTestOnReturn(String testOnReturn) {
		this.testOnReturn = testOnReturn;
	}


	/**
	 * @param testWhileIdle the testWhileIdle to set
	 */
	public void setTestWhileIdle(String testWhileIdle) {
		this.testWhileIdle = testWhileIdle;
	}


	/**
	 * @param validationQuery the validationQuery to set
	 */
	public void setValidationQuery(String validationQuery) {
		this.validationQuery = validationQuery;
	}


	/**
	 * @param validationQueryTimeout the validationQueryTimeout to set
	 */
	public void setValidationQueryTimeout(String validationQueryTimeout) {
		this.validationQueryTimeout = validationQueryTimeout;
	}


	/**
	 * @param validatorClassName the validatorClassName to set
	 */
	public void setValidatorClassName(String validatorClassName) {
		this.validatorClassName = validatorClassName;
	}


	/**
	 * @param timeBetweenEvictionRunsMillis the timeBetweenEvictionRunsMillis to set
	 */
	public void setTimeBetweenEvictionRunsMillis(String timeBetweenEvictionRunsMillis) {
		this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
	}


	/**
	 * @param minEvictableIdleTimeMillis the minEvictableIdleTimeMillis to set
	 */
	public void setMinEvictableIdleTimeMillis(String minEvictableIdleTimeMillis) {
		this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
	}


	/**
	 * @param removeAbandoned the removeAbandoned to set
	 */
	public void setRemoveAbandoned(String removeAbandoned) {
		this.removeAbandoned = removeAbandoned;
	}


	/**
	 * @param removeAbandonedTimeout the removeAbandonedTimeout to set
	 */
	public void setRemoveAbandonedTimeout(String removeAbandonedTimeout) {
		this.removeAbandonedTimeout = removeAbandonedTimeout;
	}


	/**
	 * @param logAbandoned the logAbandoned to set
	 */
	public void setLogAbandoned(String logAbandoned) {
		this.logAbandoned = logAbandoned;
	}


	@Override
	public String toString() {
		return "DataSourceConfigJndi [jndiName=" + jndiName + ", auth=" + auth + ", type=" + type + ", url=" + url
				+ ", username=" + username + ", password=" + password + ", defaultAutoCommit=" + defaultAutoCommit
				+ ", defaultReadOnly=" + defaultReadOnly + ", driverClassName=" + driverClassName + ", maxActive="
				+ maxActive + ", maxIdle=" + maxIdle + ", minIdle=" + minIdle + ", initialSize=" + initialSize
				+ ", maxWait=" + maxWait + ", testOnBorrow=" + testOnBorrow + ", testOnConnect=" + testOnConnect
				+ ", testOnReturn=" + testOnReturn + ", testWhileIdle=" + testWhileIdle + ", validationQuery="
				+ validationQuery + ", validationQueryTimeout=" + validationQueryTimeout + ", validatorClassName="
				+ validatorClassName + ", timeBetweenEvictionRunsMillis=" + timeBetweenEvictionRunsMillis
				+ ", minEvictableIdleTimeMillis=" + minEvictableIdleTimeMillis + ", removeAbandoned=" + removeAbandoned
				+ ", removeAbandonedTimeout=" + removeAbandonedTimeout + ", logAbandoned=" + logAbandoned + "]";
	}

}
