package primeiraFase.exemplos;

import java.util.Scanner;

public class ProcurandoErro {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe um número: ");
		double numero = teclado.nextDouble();
		System.out.print("Informe outro número: ");
		double outroNumero = teclado.nextDouble();         //única forma de uma divisão dar inteira, é se tudo for inteiro
		double resultado = numero / outroNumero;
		System.out.println("O resultado da operação foi: " + resultado);
		teclado.close();
	}

}