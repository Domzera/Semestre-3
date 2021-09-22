import java.util.Scanner;

public class Lista01Exerc01 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a[][] = new int[4][5];
		
		for(int i=0;i<4;i++){
			for(int j=0;j<5;j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		
		//Entrando com valores na matriz
		System.out.println("Entre com 20 valores: ");
		for (int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				System.out.print("Entre com um numero na posicao A["+i+"] ["+j+"]:");
				a[i][j]=leia.nextInt();
			}
		}
		//Mostrando os elementos digitados na matriz
		System.out.println("\nMostrando a matraz A");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			
		}
	}
}

