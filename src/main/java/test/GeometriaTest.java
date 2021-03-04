package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import JUnit.Junit09_Geometria.dto.Geometria;

class GeometriaTest {

	@Test
	public void testareacuadrado() {
		int resultado = Geometria.areacuadrado(2);
		int esperado = 4;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testareaCirculo() {
		double resultado = Geometria.areaCirculo(2);
		double esperado = 12.5664;
		assertEquals(esperado, resultado);
		
	}
	
	@Test
	public void testareaTriangulo() {
		int resultado = Geometria.areatriangulo(2,2);
		int esperado = 2;
		assertEquals(esperado, resultado);
	}

	@Test
	public void testareaRectangulo() {
		int resultado = Geometria.arearectangulo(2,2);
		int esperado = 4;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testareaPentagono() {
		int resultado = Geometria.areapentagono(2,2);
		int esperado = 2;
		assertEquals(esperado, resultado);
	}
	

	@Test
	public void testareaRombo() {
		int resultado = Geometria.arearombo(2,2);
		int esperado = 2;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testareaRomboide() {
		int resultado = Geometria.arearomboide(2,2);
		int esperado = 4;
		assertEquals(esperado, resultado);
	}

	
	@Test
	public void testareaTrapecio() {
		int resultado = Geometria.areatrapecio(2,2,2);
		int esperado = 4;
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testFiguras() {
		String resultado = Geometria.figura(1);
		String esperado = "cuadrado";
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void testConstructor() {
		Geometria c = new Geometria(1);
		int resultado = c.getId();
		String resultado2 = c.getNom();
		String esperado2 = "cuadrado";
		int esperado = 1;
		assertEquals(esperado, resultado);
		assertEquals(esperado2, resultado2);

	}
	
	

}
