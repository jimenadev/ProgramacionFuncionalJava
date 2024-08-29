package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Referencia a métodos de instancia de forma arbitraria
		
		// Imprimir en consola el nombre de todos los usuario
		
		List<User> users = new ArrayList<>();
		
		users.add(new User("Rafael", 29));
		users.add(new User("Eduardo", 25));
		users.add(new User("Uriel", 20));
		users.add(new User("Luis", 15));
		users.add(new User("Marines", 10));
		
		users.stream()
			.map( user -> user.getUsername() )
			.forEach(System.out::println);
		
		System.out.println("-----------------------");
		
		//referencia
		users.stream()
			.map( User::getUsername )
			.forEach(System.out::println);
		
	}

}
