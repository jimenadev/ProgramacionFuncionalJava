package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
		List<User> users = new ArrayList<>();
		
		users.add(new User("Rafael", 25));
		users.add(new User("Daniel", 20));
		users.add(new User("Tania", 15));
		users.add(new User("Luisa", 24));
		users.add(new User("Raul", 21));
		
		//Proceso
		//Métodos que retornan nuevo stream, trabajan con la colección mediante una estructura de proceso
		Stream<User> stream = users.stream();
		//Filter -> Abstracción -> Nuevo Stream
		System.out.println(stream.filter(user -> user.getAge() > 18 ));
		
		
		
		//Iteración interna
		//Métodos que retornan un valor en concreto, trabajan con la colección mediante una iteración interna
		System.out.println(stream.filter(user -> user.getAge() > 18 ).count());
		
		

	}

}
