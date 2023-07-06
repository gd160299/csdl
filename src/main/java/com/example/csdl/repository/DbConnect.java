package com.example.csdl.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
public class DbConnect {
//	private Connection connection;
//
//	public void connect(String url, String username, String password) {
//		try {
//			connection = DriverManager.getConnection(url, username, password);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public void disconnect() {
//		try {
//			if (connection != null && !connection.isClosed()) {
//				connection.close();
//			}
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	public Connection getConnection() {
//		return connection;
//	}

	private final DataSource dataSource;

	@Autowired
	public DbConnect(DataSource dataSource) {
		this.dataSource = dataSource;
	}
}
