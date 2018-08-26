package com.arquitecturajava.servicios;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class ServicioBTest {

	@Test
	 public void testmultiplicarSumar() {
	  
		//ServicioA servicioA=new ServicioAImpl();
	    //Realizamos el mock del ServicioA
		ServicioA servicioA=mock(ServicioA.class);
		when(servicioA.sumar(2,3)).thenReturn(5);
		
		ServicioB servicioB= new ServicioBImpl();
	   
		servicioB.setServicioA(servicioA);
		assertEquals(servicioB.multiplicarSumar(2, 3, 2),10); 
	 }
	
	@Test
	public void testMultiplicar() {
		ServicioB servicioB= new ServicioBImpl();
		assertEquals(servicioB.multiplicar(2, 3),6);
	}

}
