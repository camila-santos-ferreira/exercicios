package com.loiane.cursojava;

public class OperadoresLogicos {

	public static void main(String[] args) {
	
		int valor1 = 1;
		int valor2 = 2;
		
		boolean resultado1 = (valor1 == 1) && (valor2 == 2);
		System.out.println(resultado1);
		
		boolean resultado2 = (valor1 == 1) || (valor2 == 2);
		System.out.println(resultado2);


		boolean verdadeiro = true;
		boolean falso = false;
		System.out.println(verdadeiro && falso);
		System.out.println(verdadeiro || falso);
		System.out.println(verdadeiro ^ falso);
		System.out.println(!verdadeiro || falso);
		
	}

}
