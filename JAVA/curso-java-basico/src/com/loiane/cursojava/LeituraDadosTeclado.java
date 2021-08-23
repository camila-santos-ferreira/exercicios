package com.loiane.cursojava;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		/*System.out.print("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo é: " + nomeCompleto);

		
		System.out.print("Digite seu 1º nome: ");
		String primeiroNome = scan.next();
		System.out.print("Digite seu 2º nome: ");
		String segundoNome = scan.next();
		System.out.println("Seu 1º nome é: " + primeiroNome);
		System.out.println("Seu 2º nome é: " + segundoNome);
		
		System.out.print("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade é: " + idade);
		
		System.out.print("Digite a sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura é: " + altura); */
		
		System.out.println("Digite o seu nome, idade, quantidade de filhos, altura e se tem animal de estimação:");
		String nome = scan.nextLine();
		int idade = scan.nextInt();
		byte filhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean pets = scan.nextBoolean();

		System.out.println("Você digitou os seguintes valores: ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Qtd filhos: " + filhos);
		System.out.println("Altura: " + altura);
		System.out.println("Pets: " + pets);
		
		scan.close();
		
	}

}
