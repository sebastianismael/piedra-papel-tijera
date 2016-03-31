package edu.grupoesfera.tdd;

import static org.junit.Assert.*;

import org.junit.Test;

public class PapelTest {

	private Figura papel = Figura.PAPEL;

	@Test
	public void deberiaGanarPapelEnPapelVsPiedra() {
		Figura piedra = Figura.PIEDRA;
		assertEquals(papel, papel.contra(piedra));
	}

	@Test
	public void deberiaGanarTijeraEnPapelVsTijera() {
		Figura tijera = Figura.TIJERA;
		assertEquals(tijera, papel.contra(tijera));
	}
	
	@Test
	public void deberiaEmpatarEnPapelVsPapel(){
		assertNull(papel.contra(papel));
	}
}
