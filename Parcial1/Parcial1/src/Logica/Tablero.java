package Logica;

public class Tablero {

	public int casillas = 64;
	

	public int getCasillas() {
		return casillas;
	}

	public void setCasillas(int casillas) {
		this.casillas = casillas;
	}

	public Tablero(int casillas) {
		super();
		this.casillas = casillas;
	}
	
}
