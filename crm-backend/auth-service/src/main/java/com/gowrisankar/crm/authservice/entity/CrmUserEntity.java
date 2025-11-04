package com.gowrisankar.crm.authservice.entity;

import java.util.List;

import com.gowrisankar.crm.authservice.constants.AppConstants;
import com.gowrisankar.crm.authservice.enums.UserStatusEnum;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_crm_user", schema = AppConstants.DB_SCHEMA)
public class CrmUserEntity extends AuditEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_seq")
	@SequenceGenerator(name = "user_seq", sequenceName = "seq_crm_user",
	allocationSize = 1,schema = "crm",initialValue = 1000)
	@Column(name = "user_id")
	private Long userId;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "email_id", unique = true)
	private String emailId;
	@Column(name = "mobile_no", unique = true)
	private String mobileNo;
	@Column(name = "date_of_birth")
	private String dateOfBirth;
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private AddressEntity address;
	@OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "image_id")
	private UserImageEntity image;
	@Column(name = "user_name", unique = true)
	private String userName;
	@Column(name = "password",nullable = false)
	private String password;
	@Column(name = "user_status",nullable = false)
	private UserStatusEnum userStatus;
	@JoinTable(name = "tbl_user_role", 
			schema = AppConstants.DB_SCHEMA,
			joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "userId"),
			inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "roleId"))
	private List<UserRoleEntity> roles;
	
}
