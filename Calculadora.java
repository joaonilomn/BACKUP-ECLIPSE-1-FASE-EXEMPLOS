package primeiraFase.exemplos;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Calculadora");
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
		System.out.print("Escolha uma opção: ");
		int opcao = teclado.nextInt();
		
		System.out.print("Informe o primeiro número ");
		double numero1 = teclado.nextDouble();
		System.out.print("Informe o segundo número ");
		double numero2 = teclado.nextDouble();
		
		switch(opcao) {
		case 1 : {
			System.out.println("O valor da soma é: " + (numero1 + numero2));
			break;
		   }
		case 2: {
			System.out.println("O valor da soma é: " + (numero1 - numero2));
			break;

		  }
		case 3: {
			System.out.println("O valor da soma é: " + (numero1 * numero2));
			break;

		 }
		case 4: {
			System.out.println("O valor da soma é: " + (numero1 / numero2));
			break;

		  }
		default: {
			System.out.println("Você selecionou uma opção inválida");
			break;

		  }
	
		}

		teclado.close();
	}

}
