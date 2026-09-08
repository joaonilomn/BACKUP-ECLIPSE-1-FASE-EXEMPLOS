package primeiraFase.exemplos;

import java.util.Scanner;

public class MaiorMenorMedia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe a quantidade de n[umeros a serem lidos: ");
		int totalLeituras = teclado.nextInt();
		
		//Declaração do Array
		int[] valores = new int[totalLeituras];
		
		//Preenchimento do Array
		for(int i = 0; i < valores.length; i++) {
			System.out.print("Informe o " + (i+1) + "° número: ");
			valores [i] = teclado.nextInt();
		}
		
		//Percorrendo e imprimindo
		for(int i = 0; i < valores.length; i++) {
			System.out.print(valores[i] + " ");
		}
		
		int maiorNumero = 0;
		int menorNumero = 9999;
		int totalizador = 0;
		for(int i = 0; i < valores.length; i++) {
			totalizador += valores[i];
			if(valores [i] < menorNumero) {
				menorNumero = valores[i];
			}
			if(valores[i] > maiorNumero) {
				maiorNumero = valores[i];
			}
		}
		System.out.println("A média dos números é: " + totalizador/totalLeituras);
		System.out.println("O menor número é: " + menorNumero);
		System.out.println("O maior número é: " + maiorNumero);
		teclado.close();
		
	}

}
