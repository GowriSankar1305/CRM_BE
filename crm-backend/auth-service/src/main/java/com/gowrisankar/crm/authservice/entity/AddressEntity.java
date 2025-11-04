package com.gowrisankar.crm.authservice.entity;

import com.gowrisankar.crm.authservice.constants.AppConstants;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_address", schema = AppConstants.DB_SCHEMA)
public class AddressEntity extends AuditEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "addrs_seq_gen")
	@SequenceGenerator(name = "addrs_seq_gen",initialValue = 1000,
	schema = AppConstants.DB_SCHEMA,sequenceName = "seq_address",allocationSize = 1)
	private Long addressId;
	@Column(name = "street")
	private String street;
	@Column(name = "city")
	private String city;
	@Column(name = "state")
	private String state;
	@Column(name = "zip_code")
	private String zipCode;
	@Column(name = "country")
	private String country;
	
}
