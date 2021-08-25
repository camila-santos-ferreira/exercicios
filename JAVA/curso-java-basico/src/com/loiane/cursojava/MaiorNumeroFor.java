package com.loiane.cursojava;

import java.util.Scanner;

public class MaiorNumeroFor {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int maiorNumero = 0;
		
		for(int i = 0; i < 5; i++) {
			
			System.out.print("Informe o " + (i+1) + "� n�mero: ");
			int numero = scan.nextInt();
			
			if(numero > maiorNumero) {
				maiorNumero = numero;
			}
			
		}
		
		System.out.println("O maior n�mero digitado foi: " + maiorNumero);
		
		scan.close();
		
	}

}
