package edu.grupoesfera.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class TijeraTest {

	private Figura tijera = Figura.TIJERA;
	
	@Test
	public void deberiaGanarTijeraEnTijeraVsPapel() {
		Figura papel = Figura.PAPEL;
		assertEquals(tijera, tijera.contra(papel));
	}

	@Test
	public void deberiaGanarPiedraEnTijeraVsPiedra(){
		Figura piedra = Figura.PIEDRA;
		assertEquals(piedra,tijera.contra(piedra));
	}
	
	@Test
	public void deberiaEmpatarEnTijeraVsTijera(){
		assertNull(tijera.contra(tijera));
	}
}
