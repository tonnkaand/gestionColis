package com.example.gestioncolis.service;

import com.example.gestioncolis.entities.Admin;

import java.util.List;

public interface AdminService {
    public void create(Admin admin);
    public void update(Admin admin);
    public void delete(int id);
    public Admin getById(int id);
    public List<Admin> getAll();
}
