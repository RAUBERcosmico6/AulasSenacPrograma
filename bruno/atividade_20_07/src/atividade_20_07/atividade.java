package atividade_20_07;
import java.util.Scanner;
public class atividade {

	
	
	public static void main(String[] args) {
		int somar, subtrair, multiplicar, dividir;
		
		// TODO Auto-generated method stub
		
	  Scanner teclado = new Scanner(System.in); 

	  System.out.println(somar(1,2,3));
	  System.out.println(subtrair(4,6,4));
	  System.out.println(multiplicar());
	}
	

	private static float multiplicar() {

	}
	private static float subtrair(float abacate, float maconha, float catupiri) {
		float batata = abacate - maconha - catupiri;
		
		return batata;

	}
	
    private static float somar(float banana, float tangerina, float abacate) {
	float arroz = banana + tangerina + abacate;
	
    	
    	
    	
    	
    	return arroz;	
    	
		
		
		
		
    }
    
}
