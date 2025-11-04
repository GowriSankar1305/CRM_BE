package com.gowrisankar.crm.authservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gowrisankar.crm.authservice.entity.CrmUserEntity;

public interface UserRepository extends JpaRepository<CrmUserEntity, Long> {
	
	CrmUserEntity findByEmailId(String emailId);

}
