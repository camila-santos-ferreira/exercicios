package com.loiane.cursojava;

import java.util.Scanner;

public class IntervaloNumeros {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

        System.out.print("Informe o 1º número: ");
        int num1 = scan.nextInt();
        System.out.println(num1);
                
        System.out.print("Informe o 2º número: ");
        int num2 = scan.nextInt();
        System.out.println(num2);
        
        while (num2 < num1) {
        	System.out.print("Informe o 2º número: ");
        	num2 = scan.nextInt();
            System.out.println(num2);
        }
        
        System.out.println("Números finais: " + num1 + " e " + num2);
        
        scan.close();
	}

}
