package Logica;

public class Torre extends Pieza{
public Boolean jugando;
	
	public int pasos;
	
	public String direccion;
	
	public String direccionCaptura;
	
	public int posicionInicial;

	public Boolean getJugando() {
		return jugando;
	}

	public void setJugando(Boolean jugando) {
		this.jugando = jugando;
	}

	public int getPasos() {
		return pasos;
	}

	public void setPasos(int pasos) {
		this.pasos = pasos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getDireccionCaptura() {
		return direccionCaptura;
	}

	public void setDireccionCaptura(String direccionCaptura) {
		this.direccionCaptura = direccionCaptura;
	}

	public int getPosicionInicial() {
		return posicionInicial;
	}

	public void setPosicionInicial(int posicionInicial) {
		this.posicionInicial = posicionInicial;
	}

	public Torre(Boolean jugando, int pasos, String direccion, String direccionCaptura, int posicionInicial) {
		super();
		this.jugando = jugando;
		this.pasos = pasos;
		this.direccion = direccion;
		this.direccionCaptura = direccionCaptura;
		this.posicionInicial = posicionInicial;
	}
	
}
