package primeiraFase.exemplos;

public class UtilizandoMatriz {

	public static void main(String[] args) {
		
		int[][] matriz = new int[2][4];
		
		int valor = 1;
		
		//Preenchendo a matriz
		
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz[linha].length; coluna++) {
				matriz[linha][coluna] = valor;
				valor++;
				
			}
		}
		
		//Impriminto a matriz
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

}
