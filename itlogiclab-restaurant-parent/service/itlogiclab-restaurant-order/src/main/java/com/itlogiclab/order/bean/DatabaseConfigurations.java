package com.itlogiclab.order.bean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//This class is used to create to check env variable set from the deployment configuration

@Configuration
public class DatabaseConfigurations {
	
	
	@Value("#{environment.KUBE_USER_NAME}")
	private String userName;
	
	@Value("#{environment.KUBE_PASSWORD}")
	private String password;
	
	@Value("#{environment.KUBE_DATABASE}")
	private String database; 
	
	@Bean
	public List<String> getEnvVariable(){
		List<String> list = new ArrayList<String>();
		list.add(database);
		list.add(userName);
		list.add(password);
		return list;
	}

}
