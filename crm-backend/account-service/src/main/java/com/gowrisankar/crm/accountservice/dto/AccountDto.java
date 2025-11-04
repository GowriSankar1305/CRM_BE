package com.gowrisankar.crm.accountservice.dto;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class AccountDto {

	private Long accountId;
	private String accountOwner;
	private String rating;
	private String accountName;
	private String phone;
	private String accountSite;
	private String fax;
	private String website;
	private String accountNumber;
	private String tickerSymbol;
	private String accountType;
	private String ownership;
	private String industry;
	private Integer noOfEmployees;
	private BigDecimal annualRevenue;
	private String sicCode;
	private String description;
	
}
