package project;

import java.sql.Connection;

import projects.dao.DbConnection;

public class Project {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Connection conn = DbConnection.getConnection();

	}

}
