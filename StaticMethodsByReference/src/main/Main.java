package main;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Referencia a métodos estáticos
		
		// Imprimir en consola el cubo de los elementos en la lista
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		list.stream()
			.map( valor -> Main.toCube(valor))
			.forEach(valor -> System.out.println(valor));
		
		System.out.println("-----------------------");
		
		//por referencia
		list.stream()
			.map( Main::toCube)
			.forEach(System.out::println);
		
		

	}
	
	public static int toCube(int numero) {
		return numero * numero * numero;
	}

}
