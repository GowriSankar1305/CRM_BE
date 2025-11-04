package com.gowrisankar.crm.contactservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ContactServiceApplciation {

	public static void main(String[] args) {
		SpringApplication.run(ContactServiceApplciation.class, args);
	}

}
