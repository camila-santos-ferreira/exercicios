package com.loiane.cursojava;

import java.util.Scanner;

public class ExerciciosOperadores {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		// Exerc�cio 01
		/* System.out.print("Digite o 1� n�mero: ");
		int num1 = scan.nextInt();
		System.out.print("Digite o 2� n�mero: ");
		int num2 = scan.nextInt();
		System.out.println("A soma dos n�meros �: " + (num1 + num2)); */
		
		// Exerc�cio 02
		/* System.out.print("Digite a 1� nota: ");
		double nota1 = scan.nextDouble();
		System.out.print("Digite a 2� nota: ");
		double nota2 = scan.nextDouble();
		System.out.print("Digite a 3� nota: ");
		double nota3 = scan.nextDouble();
		System.out.print("Digite a 4� nota: ");
		double nota4 = scan.nextDouble();
		System.out.println("A m�dia �: " + ((nota1 + nota2 + nota3 + nota4)/4));*/
		
		// Exerc�cio 03
		System.out.print("Informe quanto voc� ganha por hora: R$");
		double salarioHora = scan.nextDouble();
		System.out.print("Informe o n� de horas trabalhadas no m�s: ");
		double horasTrabalhadas = scan.nextDouble();
		System.out.print("O seu sal�rio � R$" + (salarioHora * horasTrabalhadas));
				
		scan.close();
	}

}
