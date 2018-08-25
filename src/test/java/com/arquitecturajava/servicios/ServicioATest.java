package com.arquitecturajava.servicios;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServicioATest {

	@Test
	public void testSumar() {
		int a=2;
		int b=2;
		ServicioA servicio= new ServicioAImpl();
		assertEquals(servicio.sumar(a, b),4);
	}

}
