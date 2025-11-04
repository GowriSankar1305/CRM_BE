package com.gowrisankar.crm.contactservice.dto;

import lombok.Data;

@Data
public class ContactDto {

	private Long contactId;
	private String contactOwner;
	private String leadSource;
	private String salutation;
	private String firstName;
	private String lastName;
	private String accountName;
	private String title;
	private String email;
	private String department;
	private String phoneNo;
	private String homePhoneNo;
	private String otherPhoneNo;
	private String fax;
	private String mobileNo;
	private String dateOfBirth;
	private String assistantName;
	private String assistantPhone;
	private String skypeId;
	private String secondaryEmail;
	private String twitterId;
	private String description;
}
