package com.loiane.cursojava;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		/*System.out.print("Digite seu nome completo: ");
		String nomeCompleto = scan.nextLine();
		System.out.println("Seu nome completo �: " + nomeCompleto);

		
		System.out.print("Digite seu 1� nome: ");
		String primeiroNome = scan.next();
		System.out.print("Digite seu 2� nome: ");
		String segundoNome = scan.next();
		System.out.println("Seu 1� nome �: " + primeiroNome);
		System.out.println("Seu 2� nome �: " + segundoNome);
		
		System.out.print("Digite a sua idade: ");
		int idade = scan.nextInt();
		System.out.println("Sua idade �: " + idade);
		
		System.out.print("Digite a sua altura: ");
		double altura = scan.nextDouble();
		System.out.println("Sua altura �: " + altura); */
		
		System.out.println("Digite o seu nome, idade, quantidade de filhos, altura e se tem animal de estima��o:");
		String nome = scan.nextLine();
		int idade = scan.nextInt();
		byte filhos = scan.nextByte();
		float altura = scan.nextFloat();
		boolean pets = scan.nextBoolean();

		System.out.println("Voc� digitou os seguintes valores: ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Qtd filhos: " + filhos);
		System.out.println("Altura: " + altura);
		System.out.println("Pets: " + pets);
		
		scan.close();
		
	}

}
