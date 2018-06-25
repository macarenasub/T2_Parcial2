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
			try {
				System.out.println("Ingrese el nombre del equipo: ");
				nombre = input.next("\\D+");
				ok = true;
			} catch (NoSuchElementException e) {
				System.out.println("Error ingresar caracteres entre A-Z.");
				input.nextLine();
			}
		} while (!ok);
		
		System.out.println(rd.procesarDatosEquipo(nombre));

		System.out.println(rd.procesarEquipo(nombre, "Gan"));
		
		System.out.println(rd.procesarEquipo("real madrid", "Gan"));
		
		System.out.println("El ganador del campeonato fue: " + rd.procesarGanador());

		input.close();

	}
}
