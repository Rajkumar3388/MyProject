package com.edubridge.app1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.app1.dao.AdminDao;
import com.edubridge.app1.model.Admin;



@Service
public class AdminService {
 @Autowired
	private AdminDao dao;
	public Admin saveAdmin(Admin a) {
		return dao.saveAdmin(a);
	}
	public List<Admin>getAdmin(){
		return dao.getAdmins();
	}
	public Admin getAdmin(Integer adminId) {
		return dao.getAdmin(adminId);
	}
	public void updateAdmin(Admin l) {
		dao.updateAdmin(l);
	}
	public void deleteAdmin(Integer adminId) {
		dao.deleteAdmin(adminId);
	}
}
