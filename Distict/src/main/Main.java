package main;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Imprimir en consola todos los nombres únicos de la lista
		
		List<String> names = List.of("Codi 1", "Codi 2", "Codi 1", "Codi 3");
		
		names.stream()
				.distinct()
				.forEach(elemento -> System.out.println(elemento));

	}

}
