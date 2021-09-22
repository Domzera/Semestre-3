import java.util.Collections;
import java.util.Arrays;
import java.util.Scanner;

public class Lista01Exerc25 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int linha=0,coluna=0,cont=0;
		
		while(linha==0 || linha>=20 && coluna==0 || coluna>=20){
			System.out.print("Entre com a quantidade de linhas da matriz\n");
			linha=leia.nextInt();
			System.out.print("Entre com a quantidade de colunas da matriz\n");
			coluna=leia.nextInt();
		}
		
		int matriz[][]=new int [linha][coluna];//Matriz final
		int a[]=new int [linha*coluna];
		
		System.out.println("\n\nMatriz original \n");
		
		for(int i=0;i<linha;i++){
			for(int j=0;j<coluna;j++){
				matriz[i][j]=(int)(Math.random()*100);
				a[cont]=matriz[i][j];
				System.out.print(matriz[i][j]+" ");			
				cont++;
			}
			System.out.println();
		}
		/*
		for(int i=0;i<cont;i++){
			System.out.print(a[i]+" ");
		}*/
		System.out.println("\n\nMatriz ordenada \n");
		
		//Ordenando a matriz		
		
		Arrays.sort(a);
		/*for(int i=0;i<cont;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();*/
		
		cont=0;
		for(int i=0;i<linha;i++){
			for(int j=0;j<coluna;j++){
				matriz[i][j]=a[cont];
				System.out.print(matriz[i][j]+" ");			
				cont++;
			}
			System.out.println();
		}
		
	}
}

