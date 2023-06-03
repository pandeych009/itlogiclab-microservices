package com.itlogiclab.billing.modal;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BillDataSource {

	@Value("#{environment.KUBE_USER_NAME}")
	private String userName;
	
	@Value("#{environment.KUBE_PASSWORD}")
	private String password; 
	
	@Value("#{environment.KUBE_DATABASE}")
	private String database;
	

	@Bean
	public String getEnvVariables() {
		StringBuilder builder = new StringBuilder("Environment Variables : ");
		builder.append("\tUSER_NAME: "+userName);
		builder.append("\tPASSWORD: "+password);
		builder.append("\tDATABASE: "+database);
		return builder.toString();
	}
	
}
