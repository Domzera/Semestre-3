import java.util.Scanner;

public class Lista01Exerc07 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int linha=0,coluna=0,valor=0,
			maiorL=0,maiorC=0,maiora=0,maiorb=0,
			menorL=0,menorC=0,menora=1000,menorb=1000;
		
		while(linha==0 || linha>=25 && coluna==0 || coluna==25){
			System.out.print("Entre com a quantidade de linas da matriz:\n");
			linha=leia.nextInt();
			System.out.print("Entre com a quantidade de colunas da matriz:\n");
			coluna=leia.nextInt();
			System.out.println();
		}
		
		int a[][]=new int [linha][coluna];
		
		for (int i=0;i<a.length;i++){
			for (int j=0;j<a[i].length;j++){
				a[i][j]=(int)(Math.random()*100);
				if(a[i][j]>maiora){
					maiora=a[i][j];
					if(maiora>maiorb){
						maiorb=maiora;
						maiorL=i+1;
						maiorC=j+1;
					}
				}
				if(a[i][j]<menora){
					menora=a[i][j];
					if(menora<menorb){
						menorb=menora;
						menorL=i+1;
						menorC=j+1;
					}
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("\nO maior numero eh: "+maiora);
		System.out.println("O maior esta na linha: "+maiorL+" e coluna "+maiorC);
		System.out.println("\nO menor numero eh: "+menora);
		System.out.println("O menor esta na linha: "+menorL+" e coluna "+menorC);
	}
}

