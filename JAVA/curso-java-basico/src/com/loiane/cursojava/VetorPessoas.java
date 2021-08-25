package com.loiane.cursojava;

import java.util.Scanner;

public class VetorPessoas {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] idades = new int[10];
		
		int maiorIdade = 0;
		
		for(int i = 0; i < idades.length; i++) {
			
			System.out.print("Insira a " + (i+1) + "ª idade: ");
			idades[i] = scan.nextInt();
			
			if(idades[i] >= 18) {
				maiorIdade++;
			}
		}
		
		System.out.print("Vetor de idades: ");
		
		for(int idade : idades) {
			System.out.print(idade + " | ");
		}
		
		System.out.println("\nA quantidade de pessoas maiores de idade é: " + maiorIdade);
		
		scan.close();
	}

}
