package com.bilgeadam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/java10NorthwindD";
		String username = "postgres";
		String password = "123456789";

		Connection connection = null;

		try {
			
			// Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Bağlantı Başarılı");

		} catch (SQLException e) {

			System.out.println("Bağlantı Başarısız!!!");
			e.printStackTrace();
			
		}
	}
}