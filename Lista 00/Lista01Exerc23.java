import java.util.Scanner;

public class Lista01Exerc23 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int linha=0,coluna=0,cont=0,vai=0,t=0;
		
		while(linha==0 || linha>=20 && coluna==0 || coluna>=20){
			System.out.print("Entre com a quantidade de linhas da matriz\n");
			linha=leia.nextInt();
			System.out.print("Entre com a quantidade de colunas da matriz\n");
			coluna=leia.nextInt();
		}
		
		int total[]=new int [linha*coluna];//Matriz final
		
		for(int i=1;i<=total.length;){
			cont=0;
			vai++;
			for(int y=vai;y>=1;y--){
				
				if(vai%y==0){
				cont++;
				}
			}
			if(cont==2){
				total[t]=vai;
				t++;
				i++;
			}
		}
		
		System.out.println("\nTotal["+total.length+"]");
		
		int a[][]=new int [linha][coluna];
		t=0;
		
		System.out.println("\n\nMatriz: \n");
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){				
				
				a[i][j]=total[t];
				System.out.print(a[i][j]+" ");
				t++;
			}
			System.out.println();
			
		}
		
	}
}

