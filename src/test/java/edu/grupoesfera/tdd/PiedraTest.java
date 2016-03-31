package edu.grupoesfera.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class PiedraTest {

	private Figura piedra = Figura.PIEDRA;
	
	@Test
	public void deberiaGanarPiedraEnPiedraVsTijera() {
		Figura tijera = Figura.TIJERA;
		assertEquals(piedra, piedra.contra(tijera));
	}
	
	@Test
	public void deberiaGanarPapelEnPiedraVsPapel(){
		Figura papel = Figura.PAPEL;
		assertEquals(papel, piedra.contra(papel));
	}

	@Test
	public void deberiaEmpatarEnPiedraVsPiedra(){
		assertNull(piedra.contra(piedra));
	}
	
	@Test
	public void deberiaGanarPiedraEnPiedraVsTijeraConOtraPiedra(){
		Figura tijera = Figura.TIJERA;
		assertEquals( Figura.PIEDRA, piedra.contra(tijera));
	}
}
