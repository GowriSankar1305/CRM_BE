package com.gowrisankar.crm.taskservice.dto;

import lombok.Data;

@Data
public class TaskDto {

	private Long taskId;
	private String taskOwner;
	private String subject;
	private String dueDate;
	private Long relatedEntityId;
	private String relatedEntityType;
	private String status;
	private String priority;
	private String description;
}
