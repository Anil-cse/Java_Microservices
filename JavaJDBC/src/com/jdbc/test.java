package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/college";
		String username = "postgres";
		String password = "root";
		
		
		try {
			Connection con = DriverManager.getConnection(url, username, password);
			System.out.println("connecting to postgres sql");
			
			con.close();

		} catch (SQLException e) {
			System.out.println("error connecting to postgres sql");
			e.printStackTrace();
		}
		

	}

}
