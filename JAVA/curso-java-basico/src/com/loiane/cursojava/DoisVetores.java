package com.loiane.cursojava;

import java.util.Scanner;

public class DoisVetores {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] numeros1 = new int[5];
		
		for(int i = 0; i < numeros1.length; i++) {
			System.out.print("Digite o " + (i+1) + "º número: ");
			numeros1[i] = scan.nextInt();
		}
		
		int[] numeros2 = new int[5];
		
		for(int i = 0; i < numeros2.length; i++) {
			numeros2[i] = numeros1[i] * 2;
		}
		
		System.out.print("Vetor 01: ");
		
		for(int numero : numeros1) {
			System.out.print(numero + " | ");
		}
		
		System.out.println("");
		
		System.out.print("Vetor 02: ");
		
		for(int numero : numeros2) {
			System.out.print(numero + " | ");
		}
		
		scan.close();
		
	}

}
