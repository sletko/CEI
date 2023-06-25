package project;

import java.sql.Connection;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import projects.dao.DbConnection;
import projects.exception.DbException;  //Week 8 

public class Project_App {

/*	//Week 8 DB connection
  @SuppressWarnings("unused")
	public static void main(String[] args) {
		Connection conn = DbConnection.getConnection();

	}
*/
	// @formatter:off
	private List<String> operations = List.of("1) Add a project");
	// @formatter:on
	
	private Scanner scanner = new Scanner (System.in);
	
	new ProjectApp().processUserSelection();
	
	private void processUserSelections() {
		boolean done = false;
		
		while (!done) {
			try {
				int selection = getUserSelection();
				
			}
			catch (Exception e) {
				System.out.println("\nError: " + e + " Try again.");
			}
		}
	}
	
	private int getUserSelection() {
		printOperations();
		
		Integer input = getIntInput("Enter a menu selection");
		return Objects.isNull(input) ? -1 : input;
	}

	private void printOperations() {
		operations.forEach(line -> System.out.println(" " + line));
		
	}
	
	private Integer getIntInput(String prompt) {
		String input = getStringInput(prompt);
		
		if(Objects.isNull(input)) {
			return null;
		}
		
		try {
			return Integer.valueOf(input);
		}
		catch(NumberFormatException e) {
			throw new DbException(input + " is not a valid number");
			
		}
	}
	
	private String getStringInput(String prompt) {
		System.out.print(prompt + "; ");
		String input = scanner.nextLine();
		
		return input.isBlank() ? null : input.trim();
		
	}

}
