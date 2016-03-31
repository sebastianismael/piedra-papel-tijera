package edu.grupoesfera.tdd;

public class Piedra implements Figura{

	public Figura contra(Tijera tijera) {
		return this;
	}

	public Figura contra(Papel papel) {
		return papel;
	}

	public Figura contra(Piedra piedra) {
		return null;
	}
	
	public Figura contra(Figura figura){
		return figura.contra(this);
	}
	
	@Override
	public boolean equals(Object otraPiedra) {
		return otraPiedra instanceof Piedra;
	}
}
