package com.bilgeadam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sound.midi.Soundbank;

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
			
			String sql = "INSERT INTO categories (category_name) VALUES ('Eclipse'), ('Eclipse2')";
			String sql2 = "CREATE TABLE IF NOT EXISTS public.ogrenci\r\n"
					+ "(\r\n"
					+ "    id integer NOT NULL DEFAULT nextval('ogrenci_id_seq'::regclass),\r\n"
					+ "    isim character varying(50) COLLATE pg_catalog.\"default\" NOT NULL,\r\n"
					+ "    yas smallint,\r\n"
					+ "    kayit_tarihi date DEFAULT CURRENT_DATE,\r\n"
					+ "    CONSTRAINT ogrenci_pkey PRIMARY KEY (id)\r\n"
					+ ")";
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			int count = preparedStatement.executeUpdate();
			
			System.out.println(count);
			
		} catch (SQLException e) {

			System.out.println("Bağlantı Başarısız!!!");
			e.printStackTrace();
			
		} finally {
			
			try {
				
				connection.close();
				
			} catch (SQLException e) {
				
				e.printStackTrace();
				
			}
		}
	}
}