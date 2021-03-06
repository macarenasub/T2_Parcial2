package edu.ort.t2.parcial2;

public class Equipo {


    private String nombre;
    private int puntos;		 // puntos obtenidos al final delcampeonato
    private int goles_favor; // cantidad de goles a favor al final delcampeonato
    private int goles_contra;// cantidad de goles en contra al final delcampeonato
    
    // a) debe validar que el nombre no sea null o vacio
    public Equipo(String nombre) throws Exception   {
    	if(nombre == null || nombre == "") {
    		throw new Exception("El nombre es invalido.");
    	}
    	setNombre(nombre);
    }
    public void setNombre(String nombre){
    	this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public int getPuntos() {
        return puntos;
    }
    public int getGolesAFavor() {
        return goles_favor;
    }
    public int getGolesEnContra() {
        return goles_contra;
    }

	public void setPuntos(int resultado) {
		puntos += resultado;
	}
    public void setGoles_favor(int goles_favor) {
  		this.goles_favor = goles_favor;
  	}
  	public void setGoles_contra(int goles_contra) {
  		this.goles_contra = goles_contra;
  	}
	@Override
	public String toString() {
		return "Equipo=" + nombre + ",\t puntos=" + puntos + ",\t goles a favor" + goles_favor + ",\t goles en contra=" + goles_contra + "]";
	}
}
