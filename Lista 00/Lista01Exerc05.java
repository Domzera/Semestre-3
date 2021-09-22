import java.util.Scanner;

public class Lista01Exerc05 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int linha=0,coluna=0;
		
		while(linha==0 || linha>=20 && coluna==0 || coluna>=20){
			System.out.print("Entre com a quantidade de linhas A e B:\n");
			linha=leia.nextInt();
			System.out.print("Entre com a quantidade de colunas A e B:\n");
			coluna=leia.nextInt();
		}
		
		int a[][]=new int [linha][coluna];
		
		System.out.println("Matriz A: \n");
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=(int)(Math.random()*100);
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		int b[][]=new int [linha][coluna];
		
		System.out.println("\n\nMatriz B: \n");
		
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b[i].length;j++){
				b[i][j]=(int)(Math.random()*100);
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		int c[][]=new int [linha][coluna];
		
		System.out.println("\n\nA soma das matrizes eh:\n");
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}

