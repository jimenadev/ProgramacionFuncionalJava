package main;

public class main {

	public static void main(String[] args) {
		//El compilador infiere el tipo de los parámetros
		//Podemos modificar el nombre de los parámetros
		//Siempre que tengamos un sólo parámetro podemos omitir el uso de paréntesis
		//Siempre que se ejecuté una única sentencia podemos omitir el uso de llaves
		
		ISaludar saludar = nombre -> System.out.println("Hola Mundo "+ nombre);
		saludar.Saluda("Codi");

	}

}
