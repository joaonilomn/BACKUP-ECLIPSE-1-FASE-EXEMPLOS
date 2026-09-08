package primeiraFase.exemplos;

import java.util.Scanner;

public class CompraFrutas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Entrada de dados
        System.out.print("Quantos quilos você comprou de laranja? ");    
        double quilosLaranja = entrada.nextDouble();

        System.out.print("Quantos quilos você comprou de maçã? ");      
        double quilosMaca = entrada.nextDouble();

        // Definição de preços
        double precoLaranja = 10;
        double precoMaca = 12;

        // Cálculo do valor da compra
        double valorCompra = (quilosLaranja * precoLaranja) + (quilosMaca * precoMaca);   // uso de parênteses necessário para isolar

        // Exibição dos resultados
        System.out.println("Você comprou " + quilosLaranja + " quilos de laranja e " + quilosMaca + " quilos de maçã.");
        System.out.println("Você deve pagar pela compra o valor de R$: " + valorCompra + " . ");

        // Fechar o Scanner
        entrada.close();
		

	}

}
