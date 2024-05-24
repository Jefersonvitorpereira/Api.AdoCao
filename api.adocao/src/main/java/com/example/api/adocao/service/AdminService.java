package com.example.api.adocao.service;

import com.example.api.adocao.model.Admin;
import com.example.api.adocao.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public boolean validateLogin(String username, String password) {
        Admin admin = adminRepository.findByUsername(username);
        if (admin != null && admin.getPassword().equals(password)) {
            return true;
        } else {
            return false;
        }
    }
}