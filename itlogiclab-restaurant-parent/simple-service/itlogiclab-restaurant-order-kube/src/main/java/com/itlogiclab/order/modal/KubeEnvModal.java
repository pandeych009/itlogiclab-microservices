package com.itlogiclab.order.modal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KubeEnvModal {

	@Value("#{environment.KUBE_USER_NAME}")
	private String userName;
	
	@Value("#{environment.KUBE_PASSWORD}")
	private String password; 
	
	@Value("#{environment.KUBE_DATABASE}")
	private String database;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}
	
	@Bean
	public String getEnvVariables() {
		StringBuilder builder = new StringBuilder("Environment Variables : ");
		builder.append("\tUSER_NAME: "+userName);
		builder.append("\tPASSWORD: "+password);
		builder.append("\tDATABASE: "+database);
		return builder.toString();
	}
	
}
