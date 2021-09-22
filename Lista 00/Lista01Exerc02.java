import java.util.Scanner;

public class Lista01Exerc02 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int b[][]=new int [6][3];
		
		System.out.println("Matriz B: \n");
		
		for (int i=0;i<b.length;i++){
			for (int j=0;j<b[i].length;j++){
				b[i][j]=(int)(Math.random()*100);
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("\nMatriz B (invertida);\n");
		
		for(int i=b.length-1;i>=0;i--){
			for(int j=b[i].length-1;j>=0;j--){
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}

