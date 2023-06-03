package com.itlogiclab.order;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ItLogiclabsOrderApplication{
	private static Logger logger = LogManager.getLogger(ItLogiclabsOrderApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ItLogiclabsOrderApplication.class, args);
		logger.debug("#####################################################################");
		logger.debug("ItLogiclabsOrderApplication: Context loaded; application ready for use");
	}

	
}
