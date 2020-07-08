package com.cg.ems.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.cg.ems.model.User;
import com.cg.ems.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
