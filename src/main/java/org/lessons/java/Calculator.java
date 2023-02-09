package org.lessons.java;

public class Calculator {


	
	// SOMMA
	public float sum(float x, float y) {
		return x + y;
	}

	// SOTTRAZIONE
	public float sub(float x, float y) {
		return  x - y;
	}

	// MOLTIPLICAZIONE
	public float mul(float x, float y) {
		return  x * y;
	}

	// DIVISIONE
	public float div(float x, float y) throws ZeroDiv{
		if (y == 0)
			throw new ZeroDiv();
		return  x / y;
	}

}
