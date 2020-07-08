package com.cg.ems.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.JoinColumn;

@Entity
@Table(name =  "User_Master", uniqueConstraints = @UniqueConstraint(columnNames = "username"))
@SequenceGenerator(schema="hr",name="user_sequence", initialValue=100000, allocationSize=1)
public class User {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.SEQUENCE, generator="user_sequence")
	@Column(name = "userid")
	private Long userId ;
	
	@Column(name = "username")
	private String userName ;
	
	@Column(name = "userpassword")
	private String userPassword ;
	@Column(name = "usertype")
	private String userType ;
	
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
			name = "userrole",
			joinColumns = @JoinColumn(
		            name = "userid", referencedColumnName = "UserId"),
			inverseJoinColumns = @JoinColumn(
				            name = "roleid", referencedColumnName = "id"))
	
	private Collection<Role> roles;
	
	public User() {
		
	}
	
	
	public User(String userName, String userPassword, String userType, Collection<Role> roles) {
		super();
		this.userName = userName;
		this.userPassword = userPassword;
		this.userType = userType;
		this.roles = roles;
	}


	


	


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	public String getUserType() {
		return userType;
	}


	public void setUserType(String userType) {
		this.userType = userType;
	}


	public Collection<Role> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

}
