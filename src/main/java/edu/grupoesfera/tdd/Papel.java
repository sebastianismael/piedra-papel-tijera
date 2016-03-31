package edu.grupoesfera.tdd;

public class Papel implements Figura{

	public Figura contra(Piedra piedra) {
		return this;
	}

	public Figura contra(Tijera tijera) {
		return tijera;
	}

	public Figura contra(Papel papel) {
		return null;
	}

	public Figura contra(Figura figura) {
		return figura.contra(this);
	}
}
