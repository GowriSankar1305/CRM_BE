package com.gowrisankar.crm.leadservice.dto;

import lombok.Data;

@Data
public class LeadDto {
	private Long leadId;
	private String salutation;
	private String firstName;
	private String lastName;
	private String emailId;
	private String fax;
	private String title;
	private String phoneNo;
	private String mobileNo;
	private String companyName;
	private String website;
	private String leadSource;
	private String leadStatus;
	private String industry;
	private Integer noOfEmployees;
	private String annualRevenue;
	private String rating;
	private String skypeId;
	private String secondaryEmail;
	private String twitterId;
	private String description;
}
