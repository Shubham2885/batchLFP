package batchlft86.dbconncetion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

enum DBConnectionDriver {
	MYSQL_DRIVER("com.mysql.cj.jdbc.Driver"),
	ORACLE_DRIVER("com.mysql.cj.jdbc.Driver");
	
	private String constant;
	
	DBConnectionDriver(final String constant) {
		this.constant = constant;
	}
	
	public String getDriver() {
		return constant;
	}
}

enum DBUri {
	MYSQL_JDBC_URL("jdbc:mysql://localhost:3306/");

	private String constant;
	
	DBUri(final String constant) {
		this.constant = constant;
	}
	
	public String getUri() {
		return constant;
	}
}

enum DBNames {
	BATCH_LFP("batch_lfp");

	private String constant;
	
	DBNames(final String constant) {
		this.constant = constant;
	}
	
	public String getName() {
		return constant;
	}
}

public class DBConnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// 1st load driver
		
		Class.forName(DBConnectionDriver.MYSQL_DRIVER.getDriver());
		System.out.println("Dirver is Loaded");
		
		// 2nd connect db
		final String username = "root";
		final String password = "mysql";
		final String url = new StringBuilder().append(DBUri.MYSQL_JDBC_URL.getUri()).append(DBNames.BATCH_LFP.getName()).toString();
		System.out.println(url);
		Connection connection = DriverManager.getConnection(url, username, password);
		
		System.out.println("Connection Successful");
		
		final String query = "select * from student";
		
		// 3rd Create statement
		Statement statement = connection.createStatement();
		
		// 4th get result 
		ResultSet resultSet = statement.executeQuery(query);
		
		while(resultSet.next()) {
			
			System.out.println("Roll No = "+resultSet.getInt(1));
			System.out.println("Frist Name = "+resultSet.getString("fname"));
			System.out.println("Last Name = "+resultSet.getString("lname"));
			System.out.println("Mobile No = "+resultSet.getString(4));
			System.out.println("Address Id = "+resultSet.getInt("add_id"));
			System.out.println("----------------------------------------------");
			
		}
		
		// 5th close all connection
		resultSet.close();
		statement.close();
		connection.close();
	}
}
