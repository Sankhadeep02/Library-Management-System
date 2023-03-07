package com.xfactor.openlibrary.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xfactor.openlibrary.domain.Admin;
import com.xfactor.openlibrary.repositories.AdminRepository;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("admin")
public class AdminController {
    
    private AdminRepository adminRepository;

    public AdminController(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @PostMapping("/save")
    public Admin saveAdmin(@RequestBody Admin admin) {
        if (admin.getId() == null) {
            Admin admin2 = adminRepository.save(admin);
            return admin2;
        }
        return null;
    }
}
