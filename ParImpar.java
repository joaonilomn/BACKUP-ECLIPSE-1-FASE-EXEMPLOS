package primeiraFase.exemplos;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Informe um número inteiro: ");
		int numero = teclado.nextInt();
		if (numero == 0) {        // SE o número for igual a zero, é neutro
			System.out.println("O número digitado" + numero + " é neutro");

		} else {
			if (numero % 2 == 0) { // SE número RESTO de 2 é igual a zero, executa verdadeiro(par)
				System.out.println("O número digitado" + numero + " é par");

			} else {               // SE NÃO  número RESTO de 2 é diferente de zero, executa falso(ímpar)
				System.out.println("O número digitado" + numero + " é ímpar");
			}

		}

		teclado.close();

	}

}
