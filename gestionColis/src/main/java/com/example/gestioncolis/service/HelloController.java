package com.example.gestioncolis.service;

import com.example.gestioncolis.entities.Student;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import com.example.gestioncolis.service.StudentService;
import com.example.gestioncolis.service.StudentServiceImpl;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private TextField tfirstname;
    @FXML
    private TextField tlastname;
    @FXML
    private TextField tcourse;
    @FXML
    private TextField tphone;
    @FXML
    private Label success;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        success.setVisible(false);
    }

    @FXML
    protected void bouttonClick() throws SQLException {
        Student student=new Student(tfirstname.getText(), tlastname.getText(), tphone.getText(), tcourse.getText());
        StudentService studentService=new StudentServiceImpl();
        studentService.create(student);

        success.setVisible(true);
    }


}