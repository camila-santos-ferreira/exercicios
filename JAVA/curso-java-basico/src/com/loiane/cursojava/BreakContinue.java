package com.loiane.cursojava;

import java.util.Scanner;

public class BreakContinue {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		/*System.out.print("Entre com 1 nº: ");
		int num = scan.nextInt();
		
		System.out.print("Entre com um limite: ");
		int max = scan.nextInt();
		
		for(int i = num; i <= max; i++) {
			
			if(i % 7 == 0) {
				System.out.println("i: " + i);
				break;
			}
			
		}*/
		
		
		/*for(int i = 0; i <= 4; i++) {
			rotulo1: {
				rotulo2: {
					rotulo3: {
						if(i == 1) {
							break rotulo1;
						}
						if(i == 2) {
							break rotulo2;
						}
						if(i == 3) {
							break rotulo3;
						}
						System.out.println("rotulo3");
					}
					System.out.println("rotulo2");
				}
				System.out.println("rotulo1");
			}
			System.out.println(i);
		}*/
		
		System.out.print("Entre com 1 nº: ");
		int num = scan.nextInt();
		
		System.out.print("Entre com um limite: ");
		int max = scan.nextInt();
		
		for(int i = num; i <= max; i++) {
			
			if(i % 7 == 0) {
				continue;
			}
			System.out.println("i: " + i);
		}
	
		scan.close();
		
	}

}
