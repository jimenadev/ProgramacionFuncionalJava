package main;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Obtener el nombre de un usuario que tenga una edad igual a 25
		
		List<User> users = new ArrayList<>();
		
		users.add(new User("Rafael", 25));
		users.add(new User("Daniel", 25));
		users.add(new User("Tania", 25));
		users.add(new User("Luisa", 24));
		users.add(new User("Raul", 21));
		
		User userDefault = new User("Sin nombre", 30);
		
		User user = users.stream()
			.filter( u -> u.getAge() == 30)
			//.findAny()
			.findFirst()
			//.get();
			.orElse(userDefault);
		System.out.println(user.getUsername());

	}

}
