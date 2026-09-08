package primeiraFase.exemplos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ExemploArrayList {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String[] frutas = new String[4];

        for(int i = 0; i < frutas.length; i++) {
            System.out.print("Informe o nome da fruta: ");
            frutas[i] = teclado.nextLine();
        }

        Arrays.sort(frutas);

        for(int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
        }

        System.out.println("\n-----------------");

        ArrayList<String> frutas2 = new ArrayList<>();

        for(int i = 0; i < 4; i++) {
            System.out.print("Informe o nome da fruta: ");
            frutas2.add(teclado.nextLine());
        }

        Collections.sort(frutas2);

        System.out.println(frutas2 + " ---> Tamanho do ArrayList: " + frutas2.size());

        frutas2.remove(1);

        System.out.println("--------------");

        for(int i = 0; i < frutas2.size(); i++) {
            System.out.print(frutas2.get(i) + " ");
        }

        System.out.print("--> Tamanho do ArrayList: " + frutas2.size());

        teclado.close();
    }
}