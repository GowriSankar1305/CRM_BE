package com.gowrisankar.crm.authservice.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class AuditEntity {

	@Column(name = "created_by", updatable = false)
	private Long createdBy;
	@Column(name = "modified_by")
	private Long modifiedBy;
	@Column(name = "created_date_time", updatable = false)
	private LocalDateTime createdDateTime;
	@Column(name = "modified_date_time")
	private LocalDateTime modifiedDateTime;
}
