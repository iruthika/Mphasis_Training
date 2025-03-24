package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.entity.Admin;
import com.test.repo.AdminRepository;
@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    // Add a new admin
    public Admin addAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    // Get admin by ID
    public Admin getAdmin(int id) {
        return adminRepository.findById(id).orElse(null);
    }

    // Authenticate admin by email and password
    public Admin authenticateAdmin(String email, String password) {
        return adminRepository.findByEmailAndPassword(email, password).orElse(null);
    }

    // Update admin details
    public Admin updateAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    // Delete an admin by ID
    public void deleteAdmin(int id) {
        adminRepository.deleteById(id);
    }
}