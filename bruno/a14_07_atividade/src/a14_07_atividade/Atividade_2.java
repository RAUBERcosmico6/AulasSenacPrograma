package a14_07_atividade;
import java.util.Scanner;
public class Atividade_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner teclado = new Scanner(System.in);
  
   int numero = 0;
   int a25 = 0, a50=0, a75=0, a100=0;
   while(numero >= 0) {
  			System.out.println("Digite algum numero entre 0 a 100");
  		    numero = teclado.nextInt();
  		    
  		    if(numero >= 0 && numero <= 25 ) {
  		    	 a25  ++; 
  		    } else  if(numero >= 26 && numero <= 50 ) {
  		    	 a50  ++; 		    	
  		    } else  if(numero >= 51 && numero <= 75 ) {
  		    	 a75  ++;
  		    } else  if(numero >= 76 && numero <= 100 ) {
  		    	 a100  ++;
  		    }
   }
   System.out.println("[0 - 25]: "+ a25 +"[26 - 50]: "+ a50 +"[51 - 75] "+ a75 +"[76 - 100]: "+ a100 );
	}

}
