package com.loiane.cursojava;

import java.util.Scanner;

public class SwitchCaseDiaDaSemana {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Entre com o dia da semana, considerando de 1 a 7: ");
		int diaDaSemana = scan.nextInt();
		
		/*if(diaDaSemana == 1) {
			System.out.print("Domingo");
		} else if (diaDaSemana == 2) {
			System.out.print("Segunda");
		} else if (diaDaSemana == 3) {
			System.out.print("Terça");
		} else if (diaDaSemana == 4) {
			System.out.print("Quarta");
		} else if (diaDaSemana == 5) {
			System.out.print("Quinta");
		} else if (diaDaSemana == 6) {
			System.out.print("Sexta");
		} else if (diaDaSemana == 7) {
			System.out.print("Sábado");
		} else {
			System.out.print("Não é um dia válido!");
		}*/
		
		switch(diaDaSemana) {
			case 1: System.out.print("Domingo");
			break;
			case 2: System.out.print("Segunda");
			break;
			case 3: System.out.print("Terça");
			break;
			case 4: System.out.print("Quarta");
			break;
			case 5: System.out.print("Quinta");
			break;
			case 6: System.out.print("Sexta");
			break;
			case 7: System.out.print("Sábado");
			break;
			default: System.out.println("Não é um dia válido!");
		}
		
		/*switch(diaDaSemana) {
		
		case 2: 
		case 3: 
		case 4: 
		case 5: 
		case 6: System.out.print("Dia útil!");
		break;
		case 1: 
		case 7: System.out.print("Fim de semana!");
		break;
		default: System.out.println("Não é um dia válido!");
	}*/
		
		scan.close();
	}

}
