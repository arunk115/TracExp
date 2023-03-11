package com.func.core.module.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

import com.func.core.module.enums.Status;

@Entity(name = "USER")
@Getter
@Setter
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID",columnDefinition = "TINYINT")
	private Integer id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "PASSWORD")
	private String password;
	
	@Column(name = "STATUS",columnDefinition = "ENUM('Active','Inactive','Deleted')")
	@Enumerated(EnumType.STRING)
	private Status status;
	
	@Column(name = "CREATED_ON")
	private Date createdOn;
	
	@Column(name = "MODIFIED_ON")
	private Date modifiedOn;
	
	@Column(name = "CREATED_BY",columnDefinition = "TINYINT")
	private Integer createdBy;
	
	@Column(name = "MODIFIED_BY",columnDefinition = "TINYINT")
	private Integer modifiedBy;
	

}
