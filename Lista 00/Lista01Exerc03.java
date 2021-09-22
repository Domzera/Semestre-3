import java.util.Scanner;

public class Lista01Exerc03 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int matriz=0;
		
		while(matriz<=0 || matriz>20){
			System.out.print("Entre com o tamanho da matriz B:");
			matriz=leia.nextInt();
			if(matriz<1 || matriz>20)System.out.println("O valor tem que ser entre 1 e 20.");
		}
		
		int b[][]=new int [matriz][matriz];
		
		System.out.println("Matriz B: \n");
		
		for (int i=0;i<b.length;i++){
			for (int j=0;j<b[i].length;j++){
				b[i][j]=(int)(Math.random()*100);
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}

