package primeiraFase.exemplos;

import java.util.Scanner;

public class ClassificadorNumerico {

	public static void main(String[] args) {
		int numeroUm = 1;
		int numeroDois = 2;
		int numeroTres = 3;
		int numeroQuatro = 4;
		if(numeroUm % 2 == 0) {
			System.out.println (numeroUm + " é par");
		} else {
			System.out.println(numeroUm + " é ímpar");
			
		}
		if(numeroDois % 2 == 0) {
			System.out.println (numeroDois + " é par");
		} else {
			System.out.println(numeroDois +  " é ímpar");

		}
		if(numeroTres % 2 == 0) {
			System.out.println (numeroTres + " é par");
		} else {
			System.out.println(numeroTres +  " é ímpar");

		}
		if(numeroQuatro % 2 == 0) {
			System.out.println (numeroQuatro + " é par");
		} else {
			System.out.println (numeroQuatro + " é ímpar");

		}
		System.out.println ("-----------------------");
		
		//Repetição com FOR
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe até que número você deseja classificar (FOR): ");
		int numero = teclado.nextInt();
		for(int i = 1; i <= numero; i++) {
			if(i % 2 == 0) {
				System.out.println (i + " é par");
			} else {
				System.out.println (i + " é ímpar");

			}
		}
		
		// Repetição com WHILE
		System.out.print("Informe até que número você deseja classificar (WHILE): ");
		numero = teclado.nextInt();
		int i = 1;
		while(i <= numero) {
			if (i % 2 == 0) {
				System.out.println(i + " é par");
			} else {
				System.out.println(i + " é ímpar");
		
			}
			i++;
		}
		
		// Repetição com DO WHILE
				System.out.print("Informe até que número você deseja classificar (DO WHILE): ");
				numero = teclado.nextInt();
				int j = 1;
				do {
					if (i % 2 == 0) {
						System.out.println(j + " é par");
					} else {
						System.out.println(j + " é ímpar");
				
					}
					j++;
				}while (j <= numero);
		teclado.close();
	}

}
