package com.cursos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class AdivinaElNumeroTest {

	@Test
	void AciertaTest() {
		AdivinaElNumero juego = new AdivinaElNumero();
		String resultado = juego.validaJugada(55, 55);
		assertEquals("Acertaste :)", resultado);
	}
	
	@Test
	void FallaPorMenorTest() {
		AdivinaElNumero juego = new AdivinaElNumero();
		String resultado = juego.validaJugada(55, 54);
		assertEquals("No llegas", resultado);
	}
	
	@ParameterizedTest
	@ValueSource(ints = {56, 100, 111 } )
	void FallaPorMayorTest(int numeroLeido) {
		AdivinaElNumero juego = new AdivinaElNumero();
		String resultado = juego.validaJugada(55, numeroLeido);
		assertEquals("Te pasas", resultado);
	}

}
