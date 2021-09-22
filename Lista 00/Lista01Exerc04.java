import java.util.Scanner;

public class Lista01Exerc04 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int linha=0,coluna=0,valor=0;
		
		while(linha==0 || linha>=20 && coluna==0 || coluna>=20){
			System.out.print("Entre com o numero de linhas da matriz A:");
			linha=leia.nextInt();
			System.out.print("Entre com o numero de colunas da matriz A:");
			coluna=leia.nextInt();
			System.out.print("Entre com o valor maximo em A:");
			valor=leia.nextInt();
		}
		
		int b[][]=new int [linha][coluna];
		
		System.out.println("Matriz B: \n");
		
		for (int i=0;i<b.length;i++){
			for (int j=0;j<b[i].length;j++){
				b[i][j]=(int)(Math.random()*valor+1);
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}

