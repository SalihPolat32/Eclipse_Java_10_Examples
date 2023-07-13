package com.bilgeadam.lesson029;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SerializationTest {

	public static void main(String[] args) {

		Movie movie = new Movie("Seven", "Drama", LocalDate.of(1995, 05, 05));
		Movie movie3 = new Movie("Pulp Fiction", "Drama", LocalDate.of(1993, 05, 05));
		
		List<Movie> movieList = new ArrayList<>(List.of(movie, movie3));
		
		// serializationList(movieList);
		
		List<Movie> yeniListe = derializationList();
		
		if (yeniListe.isEmpty()) {
			System.out.println("Deserialization İşlemi Başarısız!!!");
		} else {
			System.out.println("Deserialization İşlemi Başarılı");
			yeniListe.forEach(System.out::println);
		}

		// serialization(movie);
		
//		Optional<Movie> movie2 = deserialization();
//		
//		if (movie2.isEmpty()) {
//			System.out.println("Deserialization İşlemi Başarısız!!!");
//		} else {
//			System.out.println("Deserialization İşlemi Başarılı");
//			System.out.println(movie2.get());
//		}
	}

	public static void serializationList(List<Movie> movieList) {

		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("C:/Users/pc\\Desktop/Java10- WorkSpace/Dosya/Deneme.txt"))) {
			
			for (Movie movie : movieList) {
				oos.writeObject(movie);
			}
			System.out.println("Serialization İşlemi Başarılı");
			
			
		} catch (Exception e) {

			System.out.println("Serialization İşlemi Başarısız!!!");
			e.printStackTrace();
			
		}
	}
	
	public static List<Movie> derializationList() {
		
		List<Movie> movieList = new ArrayList<>();

		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("C:/Users/pc\\Desktop/Java10- WorkSpace/Dosya/Deneme.txt"))) {
			
			Movie movie = null;
			
			while ((movie = (Movie) ois.readObject()) != null) {
				
				movieList = (List<Movie>) ois.readObject();
				
			}
			
		} catch (Exception e) {

			e.printStackTrace();
			
		}
		return movieList;
	}

	public static void serialization(Movie movie) {

		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("C:/Users/pc\\Desktop/Java10- WorkSpace/Dosya/Deneme.txt"))) {

			oos.writeObject(movie);
			System.out.println("Serileştirme İşlemi Başarılı");

		} catch (FileNotFoundException e) {

			System.out.println("Serileştirme İşlemi Başarısız!!!");
			e.printStackTrace();

		} catch (IOException e) {

			System.out.println("Serileştirme İşlemi Başarısız!!!");
			e.printStackTrace();

		}
	}

	public static Optional<Movie> deserialization() {

		Movie movie = null;

		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("C:/Users/pc\\Desktop/Java10- WorkSpace/Dosya/Deneme.txt"))) {

			movie = (Movie) ois.readObject();

		} catch (ClassNotFoundException e) {

			e.printStackTrace();

		} catch (FileNotFoundException e) {

			e.printStackTrace();

		} catch (IOException e) {

			e.printStackTrace();

		}
		return Optional.ofNullable(movie);
	}
}