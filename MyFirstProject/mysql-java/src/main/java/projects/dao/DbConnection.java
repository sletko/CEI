package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import projects.exception.DbException;

public class DbConnection {

	private static String Host = "localhost";
	private static String PASSWORD = "projects";
	private static int PORT = 3306;
	private static String SCHEMA = "projects";
	private static String USER = "projects";

	public static Connection gitconnection() {
		String url = String.format ("jdbc:mysql://%s:%d:%s?user=%s&password=%s&useSSL=false", Host, PORT, SCHEMA, USER, PASSWORD);
		
		System.out.println("Connection url =" + url);
		
		try {
			Connection conn = DriverManager.getConnection(url);
			System.out.println("Succesfull connection to Db!");
			return conn;
		} catch (SQLException e) {
			throw new DbException(e);
		}
	}

}
