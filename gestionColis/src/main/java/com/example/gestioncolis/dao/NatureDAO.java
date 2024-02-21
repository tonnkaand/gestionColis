
package com.example.gestioncolis.dao;

import com.example.gestioncolis.entities.Nature;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NatureDAO {
    private final Connection connection;

    public NatureDAO() throws SQLException {
        this.connection = DatabaseConfig.getConnection();
    }

    public void create(Nature nature) throws SQLException {
        String query = "INSERT INTO nature (type) VALUES (?)";
        try (PreparedStatement statement = connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, nature.getType());
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            if (rs.next()) {
                nature.setIdNature(rs.getInt(1));
            }
        }
    }

    public void update(Nature nature) throws SQLException {
        String query = "UPDATE nature SET type = ? WHERE id_nature = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, nature.getType());
            statement.setInt(2, nature.getIdNature());
            statement.executeUpdate();
        }
    }

    public void delete(int id) throws SQLException {
        String query = "DELETE FROM nature WHERE id_nature = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            statement.executeUpdate();
        }
    }

    public Nature getById(int id) throws SQLException {
        String query = "SELECT * FROM nature WHERE id_nature = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return extractNatureFromResultSet(resultSet);
            }
        }
        return null;
    }

    public List<Nature> getAll() throws SQLException {
        List<Nature> natureList = new ArrayList<>();
        String query = "SELECT * FROM nature";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Nature nature = extractNatureFromResultSet(resultSet);
                natureList.add(nature);
            }
        }
        return natureList;
    }

    private Nature extractNatureFromResultSet(ResultSet resultSet) throws SQLException {
        Nature nature = new Nature(resultSet.getInt("id_nature"), resultSet.getString("type"));
        return nature;
    }
}
