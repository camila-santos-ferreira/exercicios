package com.loiane.cursojava;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		/*System.out.print("Entre com a sua idade: ");
		int idade = scan.nextInt();
		
		if(idade >= 18) {
			System.out.println("Você é maior de idade!");
		} else {
			System.out.println("Você é menor de idade!");
		}*/
		
		System.out.print("Entre com o preço do item: R$");
		double preco = scan.nextDouble();
		
		if(preco <= 10.00) {
			System.out.println("Pode comprar. Está barato!");
		} else if (preco < 10.00 && preco < 15.00) {
			System.out.println("Pode pedir um desconto!");
		} else if (preco >= 15.00 && preco < 17.00) {
			System.out.println("Pode pesquisar mais!");
		} else {
			System.out.println("Está muito caro, não compre!");
		}
		
		scan.close();
	}
	
}
