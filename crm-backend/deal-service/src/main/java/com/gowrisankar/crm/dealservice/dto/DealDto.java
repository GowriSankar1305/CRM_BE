package com.gowrisankar.crm.dealservice.dto;

import lombok.Data;

@Data
public class DealDto {

	private Long dealId;
	private String dealAmount;
	private String accountName;
	private String closingDate;
	private String dealPipeline;
	private String dealStage;
	private String dealType;
	private String nextStep;
	private String probability;
	private String dealSource;
	private String contactName;
	private String campaignSource;
	private String description;
}
