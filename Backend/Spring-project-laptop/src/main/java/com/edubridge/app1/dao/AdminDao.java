package com.edubridge.app1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edubridge.app1.model.Admin;
import com.edubridge.app1.repo.AdminRespository;


@Repository
public class AdminDao {

	@Autowired
	private AdminRespository repo;
	public Admin saveAdmin(Admin a) {
		return repo.save(a);
		
	}
	public List<Admin>getAdmins(){
		return repo.findAll();
	}
	public Admin getAdmin(Integer AdminId) {
		return repo.findById(AdminId).get();
		
	}
	public void updateAdmin(Admin a) {
		repo.save(a);
	}
	public void deleteAdmin(Integer AdminId) {
		repo.deleteById(AdminId);
	}
}
