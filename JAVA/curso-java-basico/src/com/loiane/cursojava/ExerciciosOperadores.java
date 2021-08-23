package com.loiane.cursojava;

import java.util.Scanner;

public class ExerciciosOperadores {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
				
		// Exercício 01
		/* System.out.print("Digite o 1º número: ");
		int num1 = scan.nextInt();
		System.out.print("Digite o 2º número: ");
		int num2 = scan.nextInt();
		System.out.println("A soma dos números é: " + (num1 + num2)); */
		
		// Exercício 02
		/* System.out.print("Digite a 1ª nota: ");
		double nota1 = scan.nextDouble();
		System.out.print("Digite a 2ª nota: ");
		double nota2 = scan.nextDouble();
		System.out.print("Digite a 3ª nota: ");
		double nota3 = scan.nextDouble();
		System.out.print("Digite a 4ª nota: ");
		double nota4 = scan.nextDouble();
		System.out.println("A média é: " + ((nota1 + nota2 + nota3 + nota4)/4));*/
		
		// Exercício 03
		System.out.print("Informe quanto você ganha por hora: R$");
		double salarioHora = scan.nextDouble();
		System.out.print("Informe o nº de horas trabalhadas no mês: ");
		double horasTrabalhadas = scan.nextDouble();
		System.out.print("O seu salário é R$" + (salarioHora * horasTrabalhadas));
				
		scan.close();
	}

}
