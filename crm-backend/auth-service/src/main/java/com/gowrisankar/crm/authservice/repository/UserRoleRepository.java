package com.gowrisankar.crm.authservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gowrisankar.crm.authservice.entity.UserRoleEntity;

public interface UserRoleRepository extends JpaRepository<UserRoleEntity, Long> {

	@Query("SELECT ur FROM UserRoleEntity ur WHERE ur.roleName IN :roleNames")
	List<UserRoleEntity> findByRoleNames(List<String> roleNames);
}
