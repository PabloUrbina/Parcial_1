package Logica;


public class CalculoCasillas {
	
	public String pieza;
	
	public int pasos;
	
	public int posicion;

	public String getPieza() {
		return pieza;
	}

	public void setPieza(String pieza) {
		this.pieza = pieza;
	}

	public int getPasos() {
		return pasos;
	}

	public void setPasos(int pasos) {
		this.pasos = pasos;
	}

	public int getPosicion() {
		return posicion;
	}

	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public CalculoCasillas(String pieza, int pasos, int posicion) {
		super();
		this.pieza = pieza;
		this.pasos = pasos;
		this.posicion = posicion;
	}
	
	
}
