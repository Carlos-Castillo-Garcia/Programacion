package UT7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EstadisticaTest {

	@Test
	void testMedia() {
		float prueba[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		float resultado = Estadistica.media(prueba);
		assertEquals(resultado, 5.5);
	}

	@Test
	void testModa() {
		float prueba[] = {2, 4, 6, 8, 9, 2, 2, 1, 4, 5};
		
		float resultado = Estadistica.moda(prueba);
		assertEquals(resultado, 2);
	}

	@Test
	void testVariacionSR() {
		long resultado = Estadistica.variacionSR(3, 5);
		assertEquals(resultado, 60);
	}

	@Test
	void testVariacion() {
		double resultado = Estadistica.variacion(5, 6);
		assertEquals(resultado, 7776);
	}

	@Test
	void testPermutaciones() {
		long resultado = Estadistica.permutaciones(7);
		assertEquals(resultado, 5040);
	}

}
