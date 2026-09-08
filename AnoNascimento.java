package primeiraFase.exemplos;

import java.util.Scanner;

public class AnoNascimento {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

        // Solicita o nome do usuário
        System.out.print("Digite o seu nome: ");
        String nome = entrada.nextLine();

        // Solicita a idade do usuário
        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();

        // Calcula o ano de nascimento
        int anoAtual = 2025;  // Pode ser substituído por LocalDate.now().getYear() para obter o ano atual dinamicamente
        int anoNascimento = anoAtual - idade;

        // Exibe a mensagem formatada corretamente
        System.out.println("Olá " + nome + ", você nasceu no ano de " + anoNascimento + ".");

        // Fecha o Scanner
        entrada.close();

	}

}
