package project;

import java.sql.Connection;

import projects.dao.DbConnection;

public class Project {

	public static void main(String[] args) {
		Connection conn = DbConnection.gitconnection();

	}

}
