package primeiraFase.exemplos;

import java.util.Scanner;

public class NumerosPositivos {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe um número inteiro: ");
		int numero = teclado.nextInt();
		
		boolean ePositivo = numero >= 0;
		//Se ePositivo igual a verdadeiro, imprima
		
		
		if(ePositivo) {
			System.out.println("O número digitado: " + numero + " é positivo");
			
	

		}
		
teclado.close();
	}

}

