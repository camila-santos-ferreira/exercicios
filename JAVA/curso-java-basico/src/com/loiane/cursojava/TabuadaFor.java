package com.loiane.cursojava;

import java.util.Scanner;

public class TabuadaFor {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
			
		System.out.print("Informe qual tabuada deseja gerar [1 a 10]: ");	
		int tabuada = scan.nextInt();
		
		if(tabuada > 0 && tabuada < 10) {
			
			System.out.println("Tabuada do " + tabuada);
			
			for(int i = 1; i < 11; i++) {
				System.out.println(i + " x " + tabuada + " = " + i*tabuada);
			}
			
		} else {
			System.out.print("Tabuada inválida! Escolha uma número de 1 a 10!");
		}
		
		scan.close();
	}

}
