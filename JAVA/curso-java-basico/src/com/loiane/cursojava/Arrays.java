package com.loiane.cursojava;

public class Arrays {

	public static void main(String[] args) {
		
		double[] temperaturas = new double[365];
		
		temperaturas[0] = 31.3;
		temperaturas[1] = 32.3;
		temperaturas[2] = 33.3;
		temperaturas[3] = 34.3;
		temperaturas[4] = 35.3;
		
		System.out.println("Tamanho do array: " + temperaturas.length);
		
		/*for(int i = 0; i < temperaturas.length; i++) {
			System.out.println("A temperatura do dia " + (i+1) + " é: " + temperaturas[i]);
		}*/
		
		for(double temp : temperaturas) {
			System.out.println("A temperatura em sequência de dias é: " + temp);
		}
		
		
	}

}
