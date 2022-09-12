package com.hnt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnt.AdminRepository;
import com.hnt.entity.Admin;

@Service
public class AdminService {
	@Autowired
	AdminRepository adminRepo;
	
	public Admin save(Admin admin) {
		adminRepo.save(admin);
		return admin;
	}
	
	public Iterable<Admin> getAdmins(){
		return adminRepo.findAll();
	}
	
	public void delete(int adminId) {
		adminRepo.deleteById(adminId);
	}
	

}
