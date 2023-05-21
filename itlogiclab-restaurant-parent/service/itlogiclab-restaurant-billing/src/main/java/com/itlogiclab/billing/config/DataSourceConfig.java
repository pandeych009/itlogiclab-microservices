package com.itlogiclab.billing.config;

import org.springframework.beans.factory.annotation.Value;

//@Configuration
//@ConfigurationProperties(prefix = "database")
//@PropertySource("classpath:database-application.yaml")
@Deprecated()
public class DataSourceConfig {

	//"This class is not used in the project anymore. kept it intentionally"
	
	@Value("${{database.name}")
	private String jndiName;

	@Value("${{database.auth}")
	private String auth;

	@Value("${{database.type}")
	private String type; 

	@Value("${{database.url}")
	private String url;

	@Value("${{database.username}")
	private String username;

	@Value("${{database.password}")
	private String password;

	@Value("${{database.defaultAutoCommit}")
	private boolean defaultAutoCommit;	

	@Value("${{database.defaultReadOnly}")
	private boolean defaultReadOnly;	

	@Value("${{database.driverClassName}")
	private String driverClassName;	

	@Value("${{database.maxActive}")
	private String maxActive;	

	@Value("${{database.maxIdle}")
	private String maxIdle;	

	@Value("${{database.minIdle}")
	private String minIdle;

	@Value("${{database.initialSize}")
	private String initialSize;

	@Value("${{database.maxWait}")
	private String maxWait;	


	@Value("${{database.testOnBorrow}")
	private boolean testOnBorrow;

	@Value("${{database.testOnConnect}")
	private boolean testOnConnect;

	@Value("${{database.testOnReturn}")
	private boolean testOnReturn;

	@Value("${{database.testWhileIdle}")
	private boolean testWhileIdle;

	@Value("${{database.validationQuery}")
	private String validationQuery;

	@Value("${{database.validationQueryTimeout}")	
	private String validationQueryTimeout;

	@Value("${{database.validatorClassName}")
	private String validatorClassName;


	@Value("${{database.timeBetweenEvictionRunsMillis:0.8}")
	private String timeBetweenEvictionRunsMillis;	

	@Value("${{database.minEvictableIdleTimeMillis: 50000}")
	private String minEvictableIdleTimeMillis	;

	@Value("${{database.removeAbandoned: 50000}")
	private boolean removeAbandoned;	

	@Value("${{database.removeAbandonedTimeout: 60}")
	private String removeAbandonedTimeout;


	@Value("${{database.logAbandoned: false}")
	private boolean logAbandoned;

	/**
	 * @return the name
	 */
	public String getJndiName() {
		return jndiName;
	}

	/**
	 * @param name the name to set
	 */
	public void setJndiName(String name) {
		this.jndiName = name;
	}

	/**
	 * @return the auth
	 */
	public String getAuth() {
		return auth;
	}

	/**
	 * @param auth the auth to set
	 */
	public void setAuth(String auth) {
		this.auth = auth;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		this.url = url;
	}

	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the defaultAutoCommit
	 */
	public boolean isDefaultAutoCommit() {
		return defaultAutoCommit;
	}

	/**
	 * @param defaultAutoCommit the defaultAutoCommit to set
	 */
	public void setDefaultAutoCommit(boolean defaultAutoCommit) {
		this.defaultAutoCommit = defaultAutoCommit;
	}

	/**
	 * @return the defaultReadOnly
	 */
	public boolean isDefaultReadOnly() {
		return defaultReadOnly;
	}

	/**
	 * @param defaultReadOnly the defaultReadOnly to set
	 */
	public void setDefaultReadOnly(boolean defaultReadOnly) {
		this.defaultReadOnly = defaultReadOnly;
	}

	/**
	 * @return the driverClassName
	 */
	public String getDriverClassName() {
		return driverClassName;
	}

	/**
	 * @param driverClassName the driverClassName to set
	 */
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	/**
	 * @return the maxActive
	 * //The maximum number of active connections that can be allocated from this pool at the same time. The default value is 100
	 */
	public String getMaxActive() {
		return maxActive;
	}

	/**
	 * @param maxActive the maxActive to set
	 */
	public void setMaxActive(String maxActive) {
		this.maxActive = maxActive;
	}

	/**
	 * @return the maxIdle
	 * //The maximum number of connections that should be kept in the pool at all times. 
	//Default value is maxActive:100 Idle connections are checked periodically (if enabled) and connections that been idle for longer than minEvictableIdleTimeMillis will be released. (also see testWhileIdle)
	 */
	public String getMaxIdle() {
		return maxIdle;
	}

	/**
	 * @param maxIdle the maxIdle to set
	 */
	public void setMaxIdle(String maxIdle) {
		this.maxIdle = maxIdle;
	}

	/**
	 * @return the minIdle
	 * //The minimum number of established connections that should be kept in the pool at all times. The connection pool can shrink below this number if validation queries fail. Default value is derived from initialSize:10 (also see testWhileIdle)
	 */
	public String getMinIdle() {
		return minIdle;
	}

	/**
	 * @param minIdle the minIdle to set
	 */
	public void setMinIdle(String minIdle) {
		this.minIdle = minIdle;
	}

	/**
	 * @return the initialSize
	 * //The initial number of connections that are created when the pool is started. Default value is 10
	 */
	public String getInitialSize() {
		return initialSize;
	}

	/**
	 * @param initialSize the initialSize to set
	 */
	public void setInitialSize(String initialSize) {
		this.initialSize = initialSize;
	}

	/**
	 * @return the maxWait
	 * //The maximum number of milliseconds that the pool will wait (when there are no available connections) for a connection to be returned before throwing an exception. Default value is 30000 (30 seconds)
	 */
	public String getMaxWait() {
		return maxWait;
	}

	/**
	 * @param maxWait the maxWait to set
	 */
	public void setMaxWait(String maxWait) {
		this.maxWait = maxWait;
	}

	/**
	 * @return the testOnBorrow
	 * //The indication of whether objects will be validated before being borrowed from the pool. If the object fails to validate, 
	//it will be dropped from the pool, and we will attempt to borrow another. In order to have a more efficient validation, see validationInterval. Default value is false
	 */
	public boolean isTestOnBorrow() {
		return testOnBorrow;
	}

	/**
	 * @param testOnBorrow the testOnBorrow to set
	 */
	public void setTestOnBorrow(boolean testOnBorrow) {
		this.testOnBorrow = testOnBorrow;
	}

	/**
	 * @return the testOnConnect
	 */
	public boolean isTestOnConnect() {
		return testOnConnect;
	}

	/**
	 * @param testOnConnect the testOnConnect to set
	 */
	public void setTestOnConnect(boolean testOnConnect) {
		this.testOnConnect = testOnConnect;
	}

	/**
	 * @return the testOnReturn
	 */
	public boolean isTestOnReturn() {
		return testOnReturn;
	}

	/**
	 * @param testOnReturn the testOnReturn to set
	 */
	public void setTestOnReturn(boolean testOnReturn) {
		this.testOnReturn = testOnReturn;
	}

	/**
	 * @return the testWhileIdle
	 */
	public boolean isTestWhileIdle() {
		return testWhileIdle;
	}

	/**
	 * @param testWhileIdle the testWhileIdle to set
	 */
	public void setTestWhileIdle(boolean testWhileIdle) {
		this.testWhileIdle = testWhileIdle;
	}

	/**
	 * @return the validationQuery
	 */
	public String getValidationQuery() {
		return validationQuery;
	}

	/**
	 * @param validationQuery the validationQuery to set
	 */
	public void setValidationQuery(String validationQuery) {
		this.validationQuery = validationQuery;
	}

	/**
	 * @return the validationQueryTimeout
	 */
	public String getValidationQueryTimeout() {
		return validationQueryTimeout;
	}

	/**
	 * @param validationQueryTimeout the validationQueryTimeout to set
	 */
	public void setValidationQueryTimeout(String validationQueryTimeout) {
		this.validationQueryTimeout = validationQueryTimeout;
	}

	/**
	 * @return the validatorClassName
	 */
	public String getValidatorClassName() {
		return validatorClassName;
	}

	/**
	 * @param validatorClassName the validatorClassName to set
	 */
	public void setValidatorClassName(String validatorClassName) {
		this.validatorClassName = validatorClassName;
	}

	/**
	 * @return the timeBetweenEvictionRunsMillis
	 */
	public String getTimeBetweenEvictionRunsMillis() {
		return timeBetweenEvictionRunsMillis;
	}

	/**
	 * @param timeBetweenEvictionRunsMillis the timeBetweenEvictionRunsMillis to set
	 */
	public void setTimeBetweenEvictionRunsMillis(String timeBetweenEvictionRunsMillis) {
		this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
	}

	/**
	 * @return the minEvictableIdleTimeMillis
	 */
	public String getMinEvictableIdleTimeMillis() {
		return minEvictableIdleTimeMillis;
	}

	/**
	 * @param minEvictableIdleTimeMillis the minEvictableIdleTimeMillis to set
	 */
	public void setMinEvictableIdleTimeMillis(String minEvictableIdleTimeMillis) {
		this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
	}


	/**
	 * @return the removeAbandoned
	 */
	public boolean isRemoveAbandoned() {
		return removeAbandoned;
	}

	/**
	 * @param removeAbandoned the removeAbandoned to set
	 */
	public void setRemoveAbandoned(boolean removeAbandoned) {
		this.removeAbandoned = removeAbandoned;
	}

	/**
	 * @return the removeAbandonedTimeout
	 */
	public String getRemoveAbandonedTimeout() {
		return removeAbandonedTimeout;
	}

	/**
	 * @param removeAbandonedTimeout the removeAbandonedTimeout to set
	 */
	public void setRemoveAbandonedTimeout(String removeAbandonedTimeout) {
		this.removeAbandonedTimeout = removeAbandonedTimeout;
	}

	/**
	 * @return the logAbandoned
	 */
	public boolean isLogAbandoned() {
		return logAbandoned;
	}

	/**
	 * @param logAbandoned the logAbandoned to set
	 */
	public void setLogAbandoned(boolean logAbandoned) {
		this.logAbandoned = logAbandoned;
	}



	/*
	 * @Value("${{database.testOnConnect}")
	//The indication of whether objects will be validated when a connection is first created. If an object fails to validate, it will be throw SQLException. Default value is false
	private boolean testOnConnect;
	//The indication of whether objects will be validated before being returned to the pool. The default value is false.
	private boolean testOnReturn;
	//The indication of whether objects will be validated by the idle object evictor (if any). If an object fails to validate, 
	//it will be dropped from the pool. The default value is false and this property has to be set in order for the pool cleaner/test thread is to run (also see timeBetweenEvictionRunsMillis)
	private boolean testWhileIdle;
	//The SQL query that will be used to validate connections from this pool before returning them to the caller. If specified, this query does not have to return any data, it just can't throw a SQLException. The default value is null. If not specified, connections will be validation by the isValid() method. Example values are SELECT 1(mysql), select 1 from dual(oracle), SELECT 1(MS Sql Server)
	private String validationQuery;
	//The timeout in seconds before a connection validation queries fail. This works by calling java.sql.Statement.setQueryTimeout(seconds) on the statement that executes the validationQuery. 
	//The pool itself doesn't timeout the query, it is still up to the JDBC driver to enforce query timeouts. A value less than or equal to zero will disable this feature. The default value is -1.
	private String validationQueryTimeout;

	//(String) The name of a class which implements the org.apache.tomcat.jdbc.pool.Validator interface and provides a no-arg constructor (may be implicit). 
	//If specified, the class will be used to create a Validator instance which is then used instead of any validation query to validate connections. The default value is null. An example value is com.mycompany.project.SimpleValidator.
	private String validatorClassName;


	//(int) The number of milliseconds to sleep between runs of the idle connection validation/cleaner thread. This value should not be set under 1 second. It dictates how often we check for idle, abandoned connections, and how often we validate idle connections. The default value is 5000 (5 seconds).
	private String timeBetweenEvictionRunsMillis;	



	//(int) The minimum amount of time an object may sit idle in the pool before it is eligible for eviction. The default value is 60000 (60 seconds).
	private String minEvictableIdleTimeMillis	;


	//(boolean) Property not used. Access can be achieved by calling unwrap on the pooled connection. see javax.sql.DataSource interface, or call getConnection through reflection or cast the object as javax.sql.PooledConnection
	private boolean accessToUnderlyingConnectionAllowed	;


	//(boolean) Flag to remove abandoned connections if they exceed the removeAbandonedTimeout. 
	//If set to true a connection is considered abandoned and eligible for removal if it has been in use longer than the removeAbandonedTimeout Setting this to true can recover db connections 
	//from applications that fail to close a connection. See also logAbandoned The default value is false.
	private boolean removeAbandoned;	


	//(int) Timeout in seconds before an abandoned(in use) connection can be removed. The default value is 60 (60 seconds). The value should be set to the longest running query your applications might have.
	private String removeAbandonedTimeout;


	//(boolean) Flag to log stack traces for application code which abandoned a Connection. Logging of abandoned Connections adds overhead for every Connection borrow because a stack trace has to be generated. The default value is false.
	private boolean logAbandoned;

	//(String) The connection properties that will be sent to our JDBC driver when establishing new connections. Format of the string must be [propertyName=property;]* NOTE - The "user" and "password" properties will be passed explicitly, so they do not need to be included here. The default value is null.
	private String connectionProperties	;
	 * 
	 */


}

