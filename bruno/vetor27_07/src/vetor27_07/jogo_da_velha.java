package vetor27_07;

import java.util.Scanner;

public class jogo_da_velha {

	public static void main(String[] args) {
		// vetor de valores dp tipo INT
		int[][] matriz = new int[3][3];
		// vetor de vetores INT ja os valores;
		int[][] matrizNumeros = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
}
