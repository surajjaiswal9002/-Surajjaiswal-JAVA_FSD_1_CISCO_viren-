package com.api.sportyShoes_p3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int u_id;
	
	@Column(name = "user_name")
	private String u_Name;
	
	@Column(name = "password")
	private int u_password;
	
	@Column(name = "email")
	private String u_email;
	
	@Column(name = "mobileNo")
	private int u_mobileNo;
	
	@Column(name = "product_id")
	private int u_pid;

	public int getU_pid() {
		return u_pid;
	}

	public void setU_pid(int u_pid) {
		this.u_pid = u_pid;
	}

	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public String getU_Name() {
		return u_Name;
	}

	public void setU_Name(String u_Name) {
		this.u_Name = u_Name;
	}

	public int getU_password() {
		return u_password;
	}

	public void setU_password(int u_password) {
		this.u_password = u_password;
	}

	public String getU_email() {
		return u_email;
	}

	public void setU_email(String u_email) {
		this.u_email = u_email;
	}

	public int getU_mobileNo() {
		return u_mobileNo;
	}

	public void setU_mobileNo(int u_mobileNo) {
		this.u_mobileNo = u_mobileNo;
	}

}
