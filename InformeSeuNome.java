package primeiraFase.exemplos;

import java.util.Scanner;

public class InformeSeuNome {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.print("Informe o seu nome: ");
		String nome = teclado.nextLine();
		System.out.print("Seja bem vindo MASTER " + nome);

		teclado.close();

	}                 //ctrl + shift + f, ele deixa o código certo para rodar, caso esteja errado, exemplo:
	
/* 
Scanner teclado = new Scanner(System.in);
System.out.print("Informe o seu nome: ");
String nome = teclado.nextLine();
System.out.print("Seja bem vindo MASTER " + nome);

	teclado.close();
	                                                         }
	                                                         
*/

}
