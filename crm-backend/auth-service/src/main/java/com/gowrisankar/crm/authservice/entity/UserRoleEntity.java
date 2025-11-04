package com.gowrisankar.crm.authservice.entity;

import com.gowrisankar.crm.authservice.constants.AppConstants;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_role", schema = AppConstants.DB_SCHEMA)
public class UserRoleEntity extends AuditEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_role_seq")
	@SequenceGenerator(name = "user_role_seq", sequenceName = "seq_user_role",
	allocationSize = 1, schema = AppConstants.DB_SCHEMA, initialValue = 1000)
	@Column(name = "user_role_id")
	private Long userRoleId;
	@Column(name = "role_name", unique = true)
	private String roleName;
	@Column(name = "role_description")
	private String roleDescription;
	
}
