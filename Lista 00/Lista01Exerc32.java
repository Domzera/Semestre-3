import java.util.Collections;
import java.util.Arrays;
import java.util.Scanner;

public class Lista01Exerc32 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int coluna=0,linha=0,somalinha=0,somacoluna=0,somavertical=0,mostra=0;
		
		while(coluna==0 || coluna>=20 && linha==0 || linha>=20){
			System.out.print("Entre com a quantidade de colunas\n");
			coluna=leia.nextInt();
			System.out.print("Entre com a quantidade de linhas\n");
			linha=leia.nextInt();
		}
		
		int matriz[][]=new int [linha][coluna+1];
		//System.out.println("COLUNA-> "+coluna);
		int ultimalinha[]= new int [coluna+1];
		
		System.out.println("\nMatriz original\n");
		
		for(int i=0;i<linha;i++){
			somalinha=0;
			
			for(int j=0;j<coluna+1;j++){
				
				mostra=(int)(Math.random()*100);
				ultimalinha[j]+=mostra;   //Soma as colunas
				matriz[i][j]=mostra;
				
				if(i==j){
					somavertical+=matriz[i][j];//Soma a vertical
					//System.out.print("i="+i+"  j="+j);
				}
				
				if(j+1==matriz[i].length){
					matriz[i][j]=somalinha;
					System.out.print(" ["+matriz[i][j]+"]");
				}else{
					System.out.print(" ["+mostra+"]");
					somalinha=somalinha+mostra;
				}
			}
			System.out.println();
		}
		
		for(int i=0;i<=coluna;i++){
			if(i==coluna){
				System.out.print(" ["+somavertical+"] ");
			}else{
				System.out.print(" ["+ultimalinha[i]+"] ");
			}
		}
	}
}

