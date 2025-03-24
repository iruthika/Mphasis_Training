package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.test.entity.Admin;
import com.test.service.AdminService;

@RestController
@RequestMapping("/api/admins")
public class AdminController {

    @Autowired
    private AdminService adminService;

    // Add a new admin
    @PostMapping
    public ResponseEntity<Admin> addAdmin(@RequestBody Admin admin) {
        Admin savedAdmin = adminService.addAdmin(admin);
        return ResponseEntity.ok(savedAdmin);
    }

    // Authenticate admin by email and password
    @PostMapping("/login")
    public ResponseEntity<Admin> authenticateAdmin(@RequestParam String email, @RequestParam String password) {
        Admin authenticatedAdmin = adminService.authenticateAdmin(email, password);
        if (authenticatedAdmin != null) {
            return ResponseEntity.ok(authenticatedAdmin);
        }
        return ResponseEntity.status(401).build();
    }

    // Get admin by ID
    @GetMapping("/{id}")
    public ResponseEntity<Admin> getAdmin(@PathVariable int id) {
        Admin admin = adminService.getAdmin(id);
        if (admin != null) {
            return ResponseEntity.ok(admin);
        }
        return ResponseEntity.notFound().build();
    }
}
