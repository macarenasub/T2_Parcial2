package edu.ort.t2.parcial2;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Parcial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		TPosiciones rd = new TPosiciones();
		rd.procesarInfo(5);
		rd.verTodo();

		System.out.println("Resultado final campeonato");
		
		

		String nombre = "";
		boolean ok = false;
		do {
			System.out.println("Ingrese el nombre del equipo: ");
			nombre = input.next();
		} while (!ok);

		// Completar System.out.println("\nResultados de "+nombre ... );
		System.out.println("Partidos del real madrid " + rd.procesarEquipo("real madrid", "Gana"));
		// Completar System.out.println("El ganador del campeonato fue:" ... );

		input.close();

	}
}

