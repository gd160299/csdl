package com.example.csdl.Repository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfig  {
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

//	private final DataSource dataSource;
//
//	@Autowired
//	public DbConnect(DataSource dataSource) {
//		this.dataSource = dataSource;
//	}

	@Value("${spring.datasource.url}")
	private String url;

	@Value("${spring.datasource.username}")
	private String username;

	@Value("${spring.datasource.password}")
	private String password;

	@Value("${spring.datasource.driver-class-name}")
	private String driverClassName;

	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		dataSource.setDriverClassName(driverClassName);
		return dataSource;
	}
}
