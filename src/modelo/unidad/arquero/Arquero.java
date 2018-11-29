package modelo.unidad.arquero;

import modelo.ataque.AtacandoEnPosicionFueraDelAlcanceError;
import modelo.ataque.Ataque;
import modelo.jugador.Jugador;
import modelo.unidad.Posicionable;
import modelo.unidad.Unidad;

public class Arquero extends Unidad {

	private int alcance = 3;
	
	public Arquero() {
		this.vida = 75;
		this.costo = 75;
		this.ataque = new Ataque(10,15, this.alcance);
	}

	public Arquero(Jugador jugadorDado) {
		this.vida = 75;
		this.costo = 75;
		this.ataque = new Ataque(10,15, this.alcance);
		this.propietario = jugadorDado;
	}
	
	public Arquero (int fila, int columna) {
		
		super (fila, columna);
		this.vida = 75;
		this.costo = 75;
		this.ataque = new Ataque(10,15, this.alcance);
	}
	



	



}
