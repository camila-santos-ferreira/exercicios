package com.loiane.cursojava;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		
		int resultado = 1 + 2;
		System.out.println(resultado);
		
		resultado -= 1;
		System.out.println(resultado);
		
		resultado *= 2;
		System.out.println(resultado);
		
		resultado /= 2;
		System.out.println(resultado);
		
		resultado += 8;
		System.out.println(resultado);
		
		resultado %= 7;
		System.out.println(resultado);
		
		String primeroNome = "Esta é";
		String segundoNome = " uma String concatenada";
		String terceiroNome = primeroNome + segundoNome;
		System.out.println(terceiroNome);
		
		// adiciona depois		
		System.out.println(resultado++);
		
		// adiciona antes
		System.out.println(++resultado);
		
		// subtrai depois		
		System.out.println(resultado--);
		
		// subtrai antes
		System.out.println(--resultado);
				

	}

}
