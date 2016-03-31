package edu.grupoesfera.tdd;

public interface Figura {
	
	final static Figura TIJERA = new Tijera();
	
	final static Figura PIEDRA = new Piedra();
	
	final static Figura PAPEL = new Papel();
	
	public Figura contra(Tijera tijera);

	public Figura contra(Papel papel);
	
	public Figura contra(Piedra piedra);
	
	public Figura contra(Figura figura);
}
