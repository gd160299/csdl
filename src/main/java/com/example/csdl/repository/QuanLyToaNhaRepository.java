package com.example.csdl.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class QuanLyToaNhaRepository {
//	private final DbConnect dbConnector;
//
//	@Autowired
//	public QuanLyToaNhaRepository(DbConnect dbConnector) {
//		this.dbConnector = dbConnector;
//	}

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public QuanLyToaNhaRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

//	public void insertData(YourData data) {
//		Connection connection = dbConnector.getConnection();
//		try {
//			String sql = "INSERT INTO your_table (column1, column2) VALUES (?, ?)";
//			PreparedStatement statement = connection.prepareStatement(sql);
//			statement.setString(1, data.getColumn1());
//			statement.setInt(2, data.getColumn2());
//			statement.executeUpdate();
//			statement.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public void updateData(YourData data) {
//		Connection connection = dbConnector.getConnection();
//		try {
//			String sql = "UPDATE your_table SET column1 = ?, column2 = ? WHERE id = ?";
//			PreparedStatement statement = connection.prepareStatement(sql);
//			statement.setString(1, data.getColumn1());
//			statement.setInt(2, data.getColumn2());
//			statement.setInt(3, data.getId());
//			statement.executeUpdate();
//			statement.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public void deleteData(int id) {
//		Connection connection = dbConnector.getConnection();
//		try {
//			String sql = "DELETE FROM your_table WHERE id = ?";
//			PreparedStatement statement = connection.prepareStatement(sql);
//			statement.setInt(1, id);
//			statement.executeUpdate();
//			statement.close();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
}
