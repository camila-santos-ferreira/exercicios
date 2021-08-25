package com.loiane.cursojava;

import java.util.Scanner;

public class NotaDoWhile {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int nota;

		do {
			System.out.print("Informe uma nota de 0 a 10: ");
			nota = scan.nextInt();

		} while (nota < 0 || nota > 10);
		
		System.out.print("Nota: " + nota);

		scan.close();
	}

}
