package org.lessons.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float x, y;
		Calculator c;
		Scanner s = new Scanner(System.in);
		System.out.println("Inserisci due numeri");
		x = Float.parseFloat(s.nextLine());
		y = Float.parseFloat(s.nextLine());
		s.close();
		try {
			c = new Calculator();
			System.out.printf("NUMERO X: %.2f Y: %.2f \n", x, y);
			System.out.println("SOMMA: "+c.sum(x,y));
			System.out.println("SOTTRAZIONE: "+c.sub(x,y));
			System.out.println("MOLTIPLICAZIONE: "+c.mul(x,y));
			System.out.println("DIVISIONE: "+c.div(x,y));
		} catch (ZeroDiv e) {
	
		System.out.println("ATTENZIONE "+e.getMessage().toUpperCase());
		}
		

	}

}
