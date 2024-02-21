/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.gestioncolis.dao;

import com.example.gestioncolis.entities.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class StudentDAO {
    private Connection connection;

    public StudentDAO() throws SQLException {
            String url = "jdbc:mysql://localhost:3306/gestiondescolis";
            String user = "root";
            String pass = "";
        connection = DriverManager.getConnection(url,user,pass);
        /*try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(url,user,pass);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }*/
            
    }
    
    public void create(Student student){
        try {
            PreparedStatement ps = connection.prepareStatement("INSERT INTO student(firstname,lastname,phonenumber,course) VALUES(?,?,?,?)");
            ps.setString(1, student.getFirstname());
            ps.setString(2, student.getLastname());
            ps.setString(3, student.getPhonenumber());
            ps.setString(4, student.getCourses());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
