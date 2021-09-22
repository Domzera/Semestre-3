import java.util.Collections;
import java.util.Arrays;
import java.util.Scanner;

public class Lista01Exerc30 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int coluna=0,cont=1,j=1,fibo1=0,fibo2=0,fibo3=1;
		
		while(coluna==0 || coluna>=20){
			System.out.print("Entre com a quantidade de linhas da matriz\n");
			coluna=leia.nextInt();
		}
		
		int matriz[]=new int [coluna];
		
		System.out.println("\nMatriz original\n");
		
		for(int i=0;i<coluna;i++){
			matriz[i]=(int)(Math.random()*5+1);
			System.out.println(" ["+matriz[i]+"] ");
		}
		
		System.out.print("\nMatriz ordenada \n");
		
		//Ordenando a matriz
		int matrizb[][];
		
		for(int i=0;i<coluna;i++){
			System.out.print(" ["+matriz[i]+"] ");
			cont=0;
			fibo1=0;
			fibo2=0;
			fibo3=1;
			
			matrizb = new int[coluna][matriz.length+1];
			matrizb[i][0] = matriz[i];
			
			while(matriz[i]>=cont+1){
				
				matrizb[i][cont]=matriz[i];
		
				System.out.print(" ["+fibo2+"] ");
				fibo1=fibo2;
				fibo2=fibo1+fibo3;
				fibo3=fibo1;
			
				cont++;
			}
			
			System.out.println();
		}
		
	}
}

