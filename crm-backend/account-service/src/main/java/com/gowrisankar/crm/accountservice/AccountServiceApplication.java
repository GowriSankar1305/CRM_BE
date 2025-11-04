package com.gowrisankar.crm.accountservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;

@EnableDiscoveryClient
@SpringBootApplication
public class AccountServiceApplication {

	private static final Logger logger = LoggerFactory.getLogger(AccountServiceApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(AccountServiceApplication.class, args);
	}
	
	@EventListener
	public void listen(ContextRefreshedEvent ctx)	{
		logger.info("------------ {} Started -----------", ctx.getApplicationContext().getApplicationName()); 
	}
}
