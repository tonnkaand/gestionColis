package com.example.gestioncolis.dao;

import com.example.gestioncolis.entities.Admin;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdminDAO {
    private final Connection connection;

    public AdminDAO() throws SQLException {
        this.connection = DatabaseConfig.getConnection();
    }

    public void create(Admin admin) throws SQLException {
        String query = "INSERT INTO admin (id, login, password) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, admin.getId());
            statement.setString(2, admin.getLogin());
            statement.setString(3, admin.getPassword());
            statement.executeUpdate();
        }
    }

    public void update(Admin admin) throws SQLException {
        String query = "UPDATE admin SET login = ?, password = ? WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, admin.getLogin());
            statement.setString(2, admin.getPassword());
            statement.setInt(3, admin.getId());
            statement.executeUpdate();
        }
    }

    public void delete(int id) throws SQLException {
        String query = "DELETE FROM admin WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }

    public Admin getById(int id) throws SQLException {
        String query = "SELECT * FROM admin WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return extractAdminFromResultSet(resultSet);
            }
        }
        return null;
    }

    public List<Admin> getAll() throws SQLException {
        List<Admin> adminList = new ArrayList<>();
        String query = "SELECT * FROM admin";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Admin admin = extractAdminFromResultSet(resultSet);
                adminList.add(admin);
            }
        }
        return adminList;
    }

    private Admin extractAdminFromResultSet(ResultSet resultSet) throws SQLException {
        Admin admin = new Admin(resultSet.getInt("id"), resultSet.getString("login"), resultSet.getString("password"));
        return admin;
    }
}
