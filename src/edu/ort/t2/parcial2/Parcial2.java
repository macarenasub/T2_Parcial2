package edu.ort.t2.parcial2;

import java.util.Scanner;

public class Parcial2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		TPosiciones rd = new TPosiciones();
		
		rd.procesarInfo(5);
		
		System.out.println("Resultado final campeonato: ");
		
		rd.verTodo();

		String nombre = "";
		boolean ok = false;
		do {
			ok = true;
			System.out.print("Ingrese el nombre del equipo: ");
			nombre = input.nextLine();
			if (!nombre.matches("\\D+")) {
				System.out.println("Error ingresar caracteres entre A-Z.");
				ok = false;
			}

		} while (!ok);

		System.out.println(rd.procesarDatosEquipo(nombre));

		//System.out.println(rd.procesarEquipo(nombre, "Gan"));

		System.out.println(rd.procesarEquipo("real madrid", "Gan"));

		System.out.println("El ganador del campeonato fue: " + rd.procesarGanador());

		input.close();

	}
}
