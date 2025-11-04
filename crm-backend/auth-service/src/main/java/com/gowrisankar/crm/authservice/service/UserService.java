package com.gowrisankar.crm.authservice.service;

import com.gowrisankar.crm.authservice.dto.CrmUserDto;
import com.gowrisankar.crm.authservice.dto.SuccessResponseDto;
import com.gowrisankar.crm.authservice.entity.CrmUserEntity;

public interface UserService extends ModelMapperService<CrmUserDto,CrmUserEntity> {
	SuccessResponseDto registerUser(CrmUserDto userDto);
	CrmUserDto getUserByEmail(String emailId);
	CrmUserDto getUserById(Long userId);
}
