package com.loiane.cursojava;

import java.util.Scanner;

public class OperadorTernario {


	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe um número entre 1 e 30: ");
		int numeroDias = scan.nextInt();
		
		System.out.print((numeroDias <= 15) ? "Primeira quinzena" : "Segunda quinzena");

		scan.close();
	}
}
