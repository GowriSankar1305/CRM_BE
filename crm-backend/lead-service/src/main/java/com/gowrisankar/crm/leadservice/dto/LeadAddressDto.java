package com.gowrisankar.crm.leadservice.dto;

import lombok.Data;

@Data
public class LeadAddressDto {
	private Long addressId;
	private String street;
	private String state;
	private String city;
	private String country;
	private String zipCode;
}
