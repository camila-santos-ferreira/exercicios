package com.loiane.cursojava;

import java.util.Scanner;

public class AlunoResetLeituraTeclado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Informe o seu nome: ");
		String nome = scan.nextLine();
		
		System.out.print("Sou aluno do Level 1 do CWI Reset! Me chamo " + nome);
		
		scan.close();

	}

}
