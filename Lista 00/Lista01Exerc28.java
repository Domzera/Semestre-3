import java.util.Collections;
import java.util.Arrays;
import java.util.Scanner;

public class Lista01Exerc28 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int linha=0,coluna=0,testa=0,a=0,b=0;
		
		while(linha==0 || linha>=20 && coluna==0 || coluna>=20){
			System.out.print("Entre com a quantidade de linhas da matriz\n");
			linha=leia.nextInt();
			System.out.print("Entre com a quantidade de colunas da matriz\n");
			coluna=leia.nextInt();
		}
		
		int matriz[][]=new int [linha][coluna];
		
		System.out.println("\n\nMatriz original \n");
		
		for(int i=0;i<linha;i++){
			for(int j=0;j<coluna;j++){
				matriz[i][j]=(int)(Math.random()*100);
				System.out.print(matriz[i][j]+" ");			
			}
			System.out.println();
		}
		
		System.out.println("\n\nMatriz ordenada \n");
		
		//Ordenando a matriz
		
		while(a<=(coluna*linha)){
			for(int i=0;i<linha-1;i++){
				for(int j=0;j<coluna;j++){
					if(matriz[i][j]<matriz[i+1][j]){
						testa=matriz[i][j];
						matriz[i][j]=matriz[i+1][j];
						matriz[i+1][j]=testa;
						j++;
					}
				}
			}
			a++;
		}
		
		for(int i=0;i<linha;i++){
			for(int j=0;j<coluna;j++){
				System.out.print(matriz[i][j]+" ");
			}
		System.out.println();
		}
		
	}
}

