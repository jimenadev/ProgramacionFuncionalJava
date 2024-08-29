package main;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Referencia a métodos de instancia
		
		// Imprimir en consola el cubo de los elementos en la lista
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		Calculadora calculadora = new Calculadora();
		list.stream()
			.map(calculadora::toCube)
			.forEach(System.out::println);

	}

}
