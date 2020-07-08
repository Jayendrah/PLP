package com.cg.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.ems.model.User;


@Repository
public interface UserRepository extends JpaRepository<User, String>{
	User findByuserName(String userName);
}
