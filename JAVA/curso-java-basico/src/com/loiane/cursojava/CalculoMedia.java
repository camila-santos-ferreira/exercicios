package com.loiane.cursojava;

import java.util.Scanner;

public class CalculoMedia {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double nota;
		double soma = 0;
		double media = 0;
		
		
		for(int i = 0; i < 4; i++) {
			System.out.print("Entre com a " + (i+1) + "ª nota: ");
			nota = scan.nextDouble();
			
			soma = soma + nota;
			
			media = soma/4;
						
		}	
		
		if(media >= 7.00 && media < 10.00) {
			System.out.print("Aluno aprovado!!! Média: " + media);
		} else if (media > 10.00) {
			System.out.println("Digite notas entre 0 e 10 apenas!!!");
		}
		else if (media == 10.00) {
			System.out.println("Aluno aprovado com louvores!!! Média: " + media);
		} else {
			System.out.println("Aluno reprovado!!! Média: " + media);
		}
		
		scan.close();
	}
}
