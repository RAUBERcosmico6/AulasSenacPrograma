package vetor27_07;

import java.util.Scanner;
import java.util.Arrays;

public class atividade2 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		System.out.println("digite um número");
		int ordem = teclado.nextInt();

		int vetor1[] = new int[ordem];
		int media = 0;
		for (int i = 0; i < ordem; i++) {
			System.out.println("digite um número");
			vetor1[i] = teclado.nextInt();
			media = media + vetor1[i];
		}
		System.out.println(Arrays.toString(vetor1));
		System.out.println("a media bla bla bla: " + (media = media / ordem));

	}

}
