package com.arquitecturajava.servicios;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class ServicioATest {

	@Test
	public void testSumar() {
		int a=2;
		int b=2;
		//ServicioA servicio= new ServicioAImpl();
		ServicioA servicio=mock(ServicioA.class);
		when(servicio.sumar(2,2)).thenReturn(4);
		
		assertEquals(servicio.sumar(a, b),4);
	}

}
