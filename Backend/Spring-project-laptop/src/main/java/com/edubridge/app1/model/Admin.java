package com.edubridge.app1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Admin_Details")
public class Admin {
	@Id
	@GeneratedValue
	private Integer adminId;
	private String adminPassWord;
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminPassWord=" + adminPassWord + "]";
	}
	public Integer getAdminId() {
		return adminId;
	}
	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}
	public String getAdminPassWord() {
		return adminPassWord;
	}
	public void setAdminPassWord(String adminPassWord) {
		this.adminPassWord = adminPassWord;
	}
	public Admin(Integer adminId, String adminPassWord) {
		super();
		this.adminId = adminId;
		this.adminPassWord = adminPassWord;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
