package edu.ort.t2.parcial2;

/*
"barcelona"	"real madrid" "sevillafc" "atletico" "villareal"
 "Gan" "Emp"	"Per" "GFa"	"GCon"
	10		4		1		50		10	
	7		6		2		45		20
	5		5		5		25		30	
	8		4		3		28		20	
	3		5		7		15		40	
 */

import java.util.ArrayList;

public class TPosiciones {

	private String[] equipos;	// nombres de equipos
	private String[] puntajes;	// tipos de puntajes
	private int[][] resultados;	// resultados del campeonato 
	ArrayList<Equipo> datos;	// arreglo de equipos
	
	public TPosiciones() {
		this.cargarData();
	}
	// b) carga el array de equipos, tipos de puntajes y puntajes
	public void cargarData() {
		equipos = new String[5];
		puntajes = new String[5];
		//equipos
		equipos[0] = "barcelona";
		equipos[1] = "real madrid";
		equipos[2] = "sevillafc";
		equipos[3] = "atletico";
		equipos[4] = "villareal";
		
		//puntajes
		puntajes[0] = "Gana";
		puntajes[1] = "Empa";
		puntajes[2] = "Perd";
		puntajes[3] = "GFav";
		puntajes[4] = "Gcon";
		
		//resultados
		resultados = new int[][] {{10,4,1,50,10},
								  {7,6,2,45,20},
								  {5,5,5,25,30},
								  {8,4,3,28,20},
								  {3,5,7,15,48}};
								  
								/*  for(int x=0; x < resultados.length; x++) {
									  for(int y=0; y < resultados[x].length; y++) {
										  System.out.print(" " + resultados[x][y] + " ");
									  }
									  System.out.println("\n");
								  }*/
	}
	// c)carga el arraylist con los equipos y sus datos(puntaje, goles a favor y en contra) 
	public void procesarInfo(int cantidad) {
		datos = new ArrayList<Equipo>(cantidad);
		for (int i=0; i < equipos.length; i++) {
			Equipo p;
			try {
				p = new Equipo(equipos[i]);
				for (int j=0; j < resultados[i].length; j++) {
					p.setPuntos(this.calcularPuntos(resultados[i]));
					p.setGoles_favor(resultados[i][3]);
					p.setGoles_contra(resultados[i][4]);
				}
				datos.add(p);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	private int calcularPuntos(int[] resultados) {
		int puntos = 0;
		
		puntos += resultados[0] * 3; // Ganados
		
		puntos += resultados[1];// Empatados
		
		return puntos;
	}
	// d) busque de un equipo enviado por par�metro el resultado de todos los puntajes del campeonato 
	// y lo retorne en un string con el nombre del equipo y los puntos por Gana,Empa, Perd,Gfav y GCon. 
	public String procesarDatosEquipo(String equipo) {
		String r = "";
		int posEquipo = posicionEquipo(equipo);
		
		if (posEquipo != -1) {
			r = "Resultados de " + equipos[posEquipo] + 
					": Gan: " + resultados[posEquipo][0] + 
					" Emp: " + resultados[posEquipo][1] + 
					" Perd: " + resultados[posEquipo][2] + 
					" GolFav: " + resultados[posEquipo][3] + 
					" GolCon: " + resultados[posEquipo][4];
		}

		return r;
	}
	
	public int posicionEquipo(String equipo){
	int posEquipo = -1;
		
		for(int i = 0; i < equipos.length; i++){
			if(equipos[i].equals(equipo)){
				posEquipo = i;
			}
		}
		return posEquipo;
	}
	//e) busque para un equipo su puntaje de (Gan,Emp,Per GFav y GCon) enviado por par�metro y lo retorne en un string.	
	public String procesarEquipo(String equipo, String puntaje) {
		String r = "";
		int posEquipo = -1;
		int pospuntaje= -1; 		
		
		// Completar
		
		return r;
	}
	//f) devuelva el nombre del equipo campe�n
	public String procesarGanador() {
		String r = "";
		int max = 0;
		for (int i = 0; i < datos.size(); i++) {
			int puntaje = datos.get(i).getPuntos();
			if (max < puntaje) {
				max = puntaje;
				r = datos.get(i).getNombre();
			}
		}

		return r;
	}
	// muestra toda las tablas de datos
	public void verTodo() {
		System.out.print("\t\t");
		for (int i = 0; i < puntajes.length; i++)
			System.out.print(puntajes[i]+"\t\t");
		System.out.println();
		for (int i = 0; i < equipos.length; i++) {
			System.out.print(equipos[i] + "\t");
		for (int j = 0; j < resultados.length; j++)
				System.out.print(resultados[i][j] + "\t\t");
			System.out.println();
		}
	}
}
