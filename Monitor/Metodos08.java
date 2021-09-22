/*
 * Metodos08.java
 * 
 */

public class Metodos08 {
	
	public static void main (String[] args) {
		
		int[] numeros = { 15, 61, 28, 37 };
		int quantidade = 3;
		
		System.out.println("Numero no metodo principal: " + numeros );

		imprime ( numeros, numeros.length );
		
		//numeros = subArray ( numeros, quantidade );
		subArray ( numeros, quantidade );
		
		System.out.println("Numero no metodo principal, depois de subArray(): " + numeros );
		imprime ( numeros, numeros.length );
	}
	
	//                     
	static int[] subArray ( int array[], int quantidade ) {
		
		int novoArray[] = new int [quantidade];
		
		for ( int i = 0 ; i < quantidade ; i++ ) {
			
			novoArray[i] = array[i];
		}
		
		novoArray[0] = novoArray[0] + 2;
		
		return novoArray;
	}
	
	//                        
	static void imprime ( int[] vetor, int quantidade ) {
		
		for ( int i = 0 ; i < quantidade ; i++ ) {
			
			System.out.print ( vetor [i] + " " );
		}
		
		System.out.println();
	}
}
