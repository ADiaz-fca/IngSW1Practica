package com.fca.calidad;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;



public class CalculadoraTest {
	private Calculadora miCalculadora;
	
	@Before
	public void setup(){
		 miCalculadora = new Calculadora();
	}
	
	@Rule
	public ExpectedException expectedException = ExpectedException.none();
	
	@Test
    public void divideEntreCero() {
        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage(equalTo("/ by zero"));
        miCalculadora.divide(1, 0);
    }
	
	@Test
	public void divideEntreSiMismo() {
		//Llamando al código
		float resultadoEsperado = 1;
		float resultadoEjecucion =miCalculadora.divide(10,10);
		//Verificando
		assertThat(resultadoEsperado,equalTo(resultadoEjecucion));
	}

	@Test
	public void multiplicaPositivos() {
		//Llamando al código
		float resultadoEsperado=12;
		float resultadoEjecucion=miCalculadora.multiplica(4, 3);
		//Verificando
		assertThat(resultadoEsperado,equalTo(resultadoEjecucion));
	}
	
	@Test
	public void multiplicaNegativos() {
		//Llamando al código
		float resultadoEsperado=12;
		float resultadoEjecucion=miCalculadora.multiplica(-4, -3);
		//Verificando
		assertThat(resultadoEsperado,equalTo(resultadoEjecucion));
	}
	
	@Test
	public void sumaPositivosTest() {
		//Llamar al código
		float resultadoEsperado = 6;
		float resultadoEjecucion = miCalculadora.suma(2, 4);
		//Verificar
		assertThat(resultadoEsperado, equalTo(resultadoEjecucion));
	}
	
	@Test
	public void sumaConCeroTest() {
		//Llamar al código
		float resultadoEsperado = 4;
		float resultadoEjecucion = miCalculadora.suma(0,4);
	
		//Verificar
		assertThat(resultadoEsperado,equalTo(resultadoEjecucion));
	}
	
	@After
	public void tearDown(){
		System.out.println("Prueba terminada!");
	}
	
	

}
