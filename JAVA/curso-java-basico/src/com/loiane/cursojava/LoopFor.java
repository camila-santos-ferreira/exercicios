package com.loiane.cursojava;

public class LoopFor {

	public static void main(String[] args) {

		/*for(int i = 0; i < 5; i++) {
			System.out.println("Valor de i: " + i);
		}
		
		for(int i = 5; i > 0; i--) {
			System.out.println("Valor de i: " + i);
		}*/
		
		/*for (int i = 0, j= 10; i < j; i++, j--) {
			System.out.println("i: " + i + " | j: " + j);
		}*/
		
		int i = 0;
		for(; i < 5;) {
			System.out.println("i: " + i);
			i += 2;
		}
		
		/*for(i = 0; i < 10; i+=2) {
			System.out.println("i: " + i);
		}*/
		
		/*for(;;) {
			System.out.println();
		}*/
		
	}

}
