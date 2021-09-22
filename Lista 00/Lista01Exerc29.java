import java.util.Collections;
import java.util.Arrays;
import java.util.Scanner;

public class Lista01Exerc29 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int coluna=0,cont=0,conta=0,j=1;
		
		while(coluna==0 || coluna>=20){
			System.out.print("Entre com a quantidade de linhas da matriz\n");
			coluna=leia.nextInt();
		}
		
		int matriz[]=new int [coluna];
		
		System.out.println("\nMatriz original\n");
		
		for(int i=0;i<coluna;i++){
			matriz[i]=(int)((Math.random()*5+1));
			System.out.println(" ["+matriz[i]+"] ");
		}
		
		System.out.print("\nMatriz ordenada \n");
		
		//Ordenando a matriz
		int matrizb[][];
		
		for(int i=0;i<coluna;i++){
			System.out.print(" ["+matriz[i]+"] ");
			cont=0;
			
			matrizb = new int [coluna][matriz[i]+1];
			matrizb[i][0]=matriz[i];
			j=0;
			while(cont<matriz[i]){
				conta=0;
				
				matrizb[i][cont]=matriz[i];
				
				for(int y=1;y<=j;y++){//Aqui eu posso declarar a parte da matriz horizontal do tamnaho certo para cada linha
					if(j%y==0)conta++;
					//System.out.print("Fazer a conta ");
				}
				if(conta==2){
					System.out.print(" ["+j+"] ");
					cont++;
				}
				j++;
			}
			
			System.out.println();
		}
		
	}
}

