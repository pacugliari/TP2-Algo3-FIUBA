package modelo.edificio;

import modelo.unidad.Unidad;
import modelo.unidad.aldeano.Aldeano;
import modelo.unidad.armaDeAsedio.ArmaDeAsedio;
import modelo.unidad.arquero.Arquero;
import modelo.unidad.espadachin.Espadachin;

public class EstadoEdificioDisponible implements EstadoEdificio {

	
	@Override
	public Unidad crearArquero() {
		Unidad arquero = new Arquero();
		return arquero;
	}

	@Override
	public EstadoEdificio avanzarTurno(Edificio edificio) {
		return this;
	}

	@Override
	public EstadoEdificio reparar(Edificio edificio) {
		int turnosEnReparacion = ((edificio.getVidaFull()-edificio.getVida())/edificio.getVelocidadDeReparacion());
		if(turnosEnReparacion < 1) {
			turnosEnReparacion = 1;
		}
		return (new EstadoEdificioOcupado(turnosEnReparacion));
		
	}

	@Override
	public Unidad crearAldeano() {
		Unidad aldeano = new Aldeano();
		return aldeano;
	}

	@Override
	public int getTurnosOcupado() {
		return 0;
	}

	@Override
	public Unidad crearArmaAsedio() {
		Unidad armaDeAsedio = new ArmaDeAsedio();
		return armaDeAsedio;
	}

	@Override
	public Unidad crearEspadachin() {
		Unidad espadachin = new Espadachin();
		return espadachin;
	}
	
	

}
