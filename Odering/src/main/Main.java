package main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// Ordenar los números de la lista
		List<Integer> numbers = List.of(1,4,6,8,9,2,4,6,7,8,10,1,2,3);
		
		List<Integer> result = numbers.stream()
				.sorted()
				.collect(Collectors.toList());
		
		System.out.println(result);
		
		List<Integer> resultDesc = numbers.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		
		System.out.println(resultDesc);
		
		System.out.println("-----------------------");
		
		//Mostrar en consola los tres títulos más vendidos
		//Oredenar por copias
		List<Book> books = new ArrayList<>();
		
		books.add(new Book("El seños de los anillos", 150));
		books.add(new Book("Don Quijote de la Mancha", 500));
		books.add(new Book("Historia de dos Ciudades", 200));
		books.add(new Book("El Hobbit", 100));
		books.add(new Book("El Principito", 140));
		
		
		Comparator<Book> comparatorCopies = Comparator.comparing( book -> book.getCopies() );
		
		books.stream()
			.sorted(comparatorCopies)
			.forEach(book ->  System.out.println(book.getTitle()));
		
		System.out.println("-----------------------");
		
		books.stream()
			.sorted(comparatorCopies.reversed())
			.forEach(book ->  System.out.println(book.getTitle()));
		
		System.out.println("-----------------------");
		
		books.stream()
			.sorted(comparatorCopies.reversed())
			.limit(3)
			.forEach(book ->  System.out.println(book.getTitle()));
		
		
		System.out.println("-----------------------");
		
		Comparator<Book> comparatorTitles = Comparator.comparing( book -> book.getTitle() );
		
		books.stream()
			.sorted(comparatorTitles.reversed())
			.forEach(book ->  System.out.println(book.getTitle()));
		
		System.out.println("-----------------------");
		
		Comparator<Book> comparator;
		
		if(books.stream().count() > 3) {
			comparator = Comparator.comparing( book -> book.getCopies() );
		}else {
			comparator = Comparator.comparing( book -> book.getTitle() );
		}
		
		books.stream()
			.sorted(comparator.reversed())
			.forEach(book ->  System.out.println(book.getTitle()));
	}

}
