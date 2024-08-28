package main;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		//Obtener el cuadrado de todos los números en la lista
		
		List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> result = numeros.stream()
										.map( numero -> numero * numero )
										.collect(Collectors.toList());
		
		System.out.println(numeros);
		System.out.println(result);
		
	}

}
