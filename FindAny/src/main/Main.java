package main;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		// Conocer si un alumno posee por lo menos una calificación no aprobatoria
		// La calificación mínima es 6
		
		List<Integer> calificaciones = List.of(10, 10, 9, 5, 6, 7, 8, 9, 10);
		
		/*boolean result =  calificaciones.stream()
										.filter( calificacion -> calificacion < 6 )
										.count() > 0;*/
		
		boolean result =  calificaciones.stream()
										.anyMatch( calificacion -> calificacion < 6);
										
										
		System.out.println(result);

	}

}
