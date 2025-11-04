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
@Table(name = "tbl_user_image", schema = AppConstants.DB_SCHEMA)
public class UserImageEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_image_seq")
	@SequenceGenerator(name = "user_image_seq", sequenceName = "seq_user_image"
	,allocationSize = 1,initialValue = 100,schema = AppConstants.DB_SCHEMA)
	private Long imageId;
	@Column(name = "original_image_name")
	private String originalImageName;
	@Column(name = "image_name")
	private String imageName;
	@Column(name = "image_type")
	private String imageType;
	@Column(name = "image_url")
	private String imageUrl;
	@Column(name = "image_size")
	private String imageSize;
}
