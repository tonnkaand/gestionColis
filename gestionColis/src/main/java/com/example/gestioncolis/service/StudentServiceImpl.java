/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gestioncolis.service;

import com.example.gestioncolis.dao.DatabaseConfig;
import com.example.gestioncolis.entities.Student;

import java.sql.SQLException;


public class StudentServiceImpl implements StudentService{
      
    private DatabaseConfig studentDAO=new DatabaseConfig();

    public StudentServiceImpl() throws SQLException {
    }

    @Override
    public void create(Student student) {
        this.studentDAO.create(student);
    }
    
    @Override
    public void update(Student student){
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
