package org.lessons.java;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
	
	static Calculator c;
	@BeforeAll 
	static void setUBeforeClass() throws Exception {
		c= new Calculator();
		
	}
	
//
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

	
	@Test
	@DisplayName("verifica somma")
	void sumTest() {
		assertEquals(4, c.sum(3,1));
	}
	
	@Test
	@DisplayName("verifica sottrazione")
	void subTest() {
		assertEquals(-2, c.sub(1,3));
	}
	
	@Test
	@DisplayName("verifica moltiplicazione")
	void mulTest() {
		assertEquals(6, c.mul(3,2));
	}
	
	@Test
	@DisplayName("verifica divisione")
	void divTest() throws ZeroDiv {
		assertEquals(3, c.div(15,5));
	}
	
	@Test
	@DisplayName("Lancia eccezione con divizo 0")
	void exceptionDivideTest() {
		assertThrows(ZeroDiv.class, () -> c.div(4, 0), "La divisione per 0 non valida" );
	}
	
}
