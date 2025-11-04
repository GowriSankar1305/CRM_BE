package com.gowrisankar.crm.authservice.service.impl;

import java.util.function.Function;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.gowrisankar.crm.authservice.dto.CrmUserDto;
import com.gowrisankar.crm.authservice.dto.SuccessResponseDto;
import com.gowrisankar.crm.authservice.entity.CrmUserEntity;
import com.gowrisankar.crm.authservice.enums.UserStatusEnum;
import com.gowrisankar.crm.authservice.exception.InternalSystemException;
import com.gowrisankar.crm.authservice.repository.UserRepository;
import com.gowrisankar.crm.authservice.repository.UserRoleRepository;
import com.gowrisankar.crm.authservice.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	private final UserRepository userRepository;
	private final UserRoleRepository userRoleRepository;
	private final PasswordEncoder passwordEncoder;
	
	public UserServiceImpl(UserRepository userRepository, 
						   PasswordEncoder passwordEncoder,
						   UserRoleRepository userRoleRepository) {
		this.userRepository = userRepository;
		this.passwordEncoder = passwordEncoder;
		this.userRoleRepository = userRoleRepository;
	}

	@Override
	public SuccessResponseDto registerUser(CrmUserDto userDto) {
		CrmUserEntity savedEntity = this.userRepository.save(this.toEntity().apply(userDto));
		if(savedEntity.getUserId() == null)	{
			throw new InternalSystemException("Failed to register user");
		}
		return new SuccessResponseDto("User registered successfully");
	}

	@Override
	public CrmUserDto getUserByEmail(String emailId) {
		return this.toDto().apply(
				this.userRepository.findByEmailId(emailId));
	}

	@Override
	public CrmUserDto getUserById(Long userId) {
		return this.toDto().apply(
				this.userRepository.findById(userId).orElse(null));
	}

	@Override
	public Function<CrmUserDto, CrmUserEntity> toEntity() {
		return dto -> {
			CrmUserEntity entity = new CrmUserEntity();
			entity.setEmailId(dto.getEmailId());
			entity.setFirstName(dto.getFirstName());
			entity.setLastName(dto.getLastName());
			entity.setMobileNo(dto.getMobileNo());
			entity.setDateOfBirth(dto.getDateOfBirth());
			entity.setPassword(this.passwordEncoder.encode(dto.getPassword()));
			entity.setUserName(dto.getUserName());
			entity.setUserStatus(UserStatusEnum.valueOf(dto.getUserStatus()));
			if(!CollectionUtils.isEmpty(dto.getRoles()))	{
				entity.setRoles(this.userRoleRepository.findByRoleNames(dto.getRoles()));	
			}
			return entity;
		};
	}

	@Override
	public Function<CrmUserEntity, CrmUserDto> toDto() {
		return entity -> {
			CrmUserDto dto = new CrmUserDto();
			dto.setUserId(entity.getUserId().toString());
			dto.setEmailId(entity.getEmailId());
			dto.setFirstName(entity.getFirstName());
			dto.setLastName(entity.getLastName());
			dto.setMobileNo(entity.getMobileNo());
			dto.setDateOfBirth(entity.getDateOfBirth());
			return dto;
		};
	}

}
