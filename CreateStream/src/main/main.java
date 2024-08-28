package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class main {

	public static void main(String[] args) {
		//Colección
		List<User> users = new ArrayList<>();
		Stream<User> stream = users.stream(); //Abstracción
		
		
		//Stream
		Stream<User>  filter = stream.filter( user -> user.getAge() > 18 );
		
		
		//Arreglo
		int[] numbers = { 1,2,3,4,5 };
		Stream.of(numbers);
		
		
		//Secuencia
		Stream names = Stream.of("Codi 1", "Codi 2", "Codi 3");
		
		
	}

}
