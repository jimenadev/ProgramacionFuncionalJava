package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class main {

	public static void main(String[] args) {
		// Obtener el título del segundo y el tercer libro más vendido
		
		List<Book> books = new ArrayList<>();
		
		books.add(new Book("El seños de los anillos", 150));
		books.add(new Book("Don Quijote de la Mancha", 500));
		books.add(new Book("Historia de dos Ciudades", 200));
		books.add(new Book("El Hobbit", 100));
		books.add(new Book("El Principito", 140));
		
		
		Comparator<Book> comparatorCopies = Comparator.comparing( book -> book.getCopies() );
		
		books.stream()
			.sorted(comparatorCopies.reversed())
			.limit(3)
			.skip(1)
			.forEach(book ->  System.out.println(book.getTitle()));

	}

}
