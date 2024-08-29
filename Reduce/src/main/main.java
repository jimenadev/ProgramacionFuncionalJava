package main;

import java.util.stream.Stream;

public class main {

	public static void main(String[] args) {
		//Obtener la suma de todos los elementos
		
		int result = Stream.of(1,2,3,4,5,6,7,8,9,10)
						.reduce( 0 , ( acumulador, elemento ) -> acumulador + elemento);
		
		System.out.println(result);
		

		String  resultLenguajes = Stream.of("Java", "C", "Python", "Ruby")
										.reduce("" ,( acumulador, lenguaje ) -> acumulador.isEmpty() ? lenguaje : acumulador + "|" + lenguaje);
										
			
		
		System.out.println(resultLenguajes);

	}

}
