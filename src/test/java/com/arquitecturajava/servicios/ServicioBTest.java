package com.arquitecturajava.servicios;

import static org.junit.Assert.*;

import org.junit.Test;

public class ServicioBTest {

	@Test
	 public void testmultiplicarSumar() {
	  
		ServicioA servicioA=new ServicioAImpl();
	  
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
