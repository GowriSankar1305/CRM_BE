package com.gowrisankar.crm.authservice.dto;

import java.util.List;

import lombok.Data;

@Data
public class CrmUserDto {

	private String userId;
	private String firstName;
	private String lastName;
	private String emailId;
	private String mobileNo;
	private String dateOfBirth;
	private AddressDto addressDto;
	private String password;
	private String userName;
	private String userStatus;
	private List<String> roles;
}
