package modelo.vacio;

import modelo.edificio.Edificio;
import modelo.jugador.PosicionDesocupadaError;
import modelo.mapa.Posicion;
import modelo.unidad.Posicionable;
import modelo.unidad.Unidad;

public class Vacio extends Posicionable{

	public Vacio(int i, int j) {
		super(i, j);
	}
	
	public Vacio (Posicion posicion) {
		super (posicion);
	}
	
	public Vacio() {
		
	}
	
	public boolean estaEnRangoDePosicion (Posicion posicion, int alcanceEnFila, int alcanceEnColumna) {
		
		return false;
	}
	
	public void desplazarHasta (Posicion hasta) {
		
		throw new PosicionDesocupadaError ();
	}
	
	public void recibirPosicionable () {
		
	}
	
	public void recibirDanio (int danio) {
		throw new PosicionDesocupadaError ();
	}
	
	public void recibirDanioDe (Posicionable posicionable) {
		throw new PosicionDesocupadaError ();
	}
	
	public void recibirDanioDe (Unidad unidad) {
		throw new PosicionDesocupadaError ();
	}
	
	public void recibirDanioDe (Edificio edificio) {
		throw new PosicionDesocupadaError ();
	}
	
	public void atacar (Posicionable posicionable) {
		throw new PosicionDesocupadaError ();
	}
	
	public void atacar (Unidad unidad) {
		throw new PosicionDesocupadaError ();
	}
	
	public void atacar (Edificio edificio) {
		throw new PosicionDesocupadaError ();
	}

}
