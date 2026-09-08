package primeiraFase.exemplos;

import java.util.Scanner;

public class ProcedimentosFuncoes {

	public static void main(String[] args) {

		int numero1 = leia();

		int numero2 = leia();

		int soma = somar(numero1, numero2);

		imprimir(soma);

	}

	// Exemplo de função
	static int leia() {

		Scanner teclado = new Scanner(System.in);
		// Tudo bem nesse caso, em exemplo, não fechar o teclado.

		System.out.print("Informe um número: ");

		int numero = teclado.nextInt();

		return numero;
	}

	// Exemplo de função
	static int somar(int numero1, int numero2) {

		int total = numero1 + numero2;

		return total;
	}

	// Exemplo de procedimento
	static void imprimir(int soma) {

		System.out.println("O resultado é: " + soma);
		
		

	}

}