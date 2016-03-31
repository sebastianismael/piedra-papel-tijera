package edu.grupoesfera.tdd;

public class Tijera implements Figura{

	public Figura contra(Papel papel) {
		return this;
	}

	public Figura contra(Piedra piedra) {
		return piedra;
	}

	public Figura contra(Tijera tijera) {
		return null;
	}

	public Figura contra(Figura figura){
		return figura.contra(this);
	}
	
}
