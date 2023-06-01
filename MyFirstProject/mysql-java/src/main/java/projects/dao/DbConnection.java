package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import projects.exception.DbException;

public class DbConnection {

	private static String HOST = "localhost";
	private static String PASSWORD = "projects";
	private static int PORT = 3306;
	private static String SCHEMA = "projects";
	private static String USER = "projects";

	public static Connection getConnection() {
		String url = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s&useSSL=false", HOST, PORT, SCHEMA, USER,
				PASSWORD);

		System.out.println("Connection url =" + url);
		
		//sql query

		try {
			Connection conn = DriverManager.getConnection(url);
			System.out.println("Succesfull connection to Db!");
			return conn;
			
			//insert query
			//Statement statement = access.createStatement();
			//ResultsSet list = statement.executeQuery(query);
			
			//While(list.next()) {
				
			//}
			
			
			} catch (SQLException e) {
				throw new DbException(e);
				}
	}
}