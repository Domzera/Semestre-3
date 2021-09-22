import java.util.Collections;
import java.util.Arrays;
import java.util.Scanner;

public class Lista01Exerc31 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int primeiro=0,segundo=0,teste=0,passa=0;
		
		while(primeiro==0 || primeiro>=20){
			System.out.print("Entre com o primeiro valor\n");
			primeiro=leia.nextInt();
			System.out.print("Entre com o segundo valor\n");
			segundo=leia.nextInt();
		}
		
		if(primeiro>segundo){
			passa=primeiro;
			primeiro=segundo;
			segundo=passa;
		}
		
		int matriz[][]=new int [primeiro][segundo];
		
		System.out.println("\nMatriz original\n");
		
		for(int i=0;i<matriz.length;i++){
			for(int j=0;j<matriz[i].length;){
				teste=(int)(Math.random()*10+primeiro);
				if(teste>primeiro && teste<segundo){
					matriz[i][j]=teste;
					System.out.print(" ["+matriz[i][j]+"]");
					j++;
				}
			}
			
			System.out.println();
		}
		
		System.out.print("\nMatriz ordenada \n");
		
	}
}

