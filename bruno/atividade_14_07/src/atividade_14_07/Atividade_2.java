package atividade_14_07;
import java.util.Scanner;
public class Atividade_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in); 
		//O while representa a estrutura de repetição (repita até que) N OsCRETCH 
        int valor = -1, soma_par = 0, soma_impar =0;
		while(valor != 0) {
			System.out.println("Digite um número");
			valor = teclado.nextInt();
			if(valor%2 == 0 ) {
				 soma_par += valor;
				System.out.println("par: "+ valor);
			} else {
				 soma_impar += valor;
				System.out.println("impar: "+ valor);
			}
			
		}
		System.out.println("O valor toral de pares é de: "+ soma_par +" e impares é de: "+ soma_impar);
	}

}
