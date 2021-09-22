import java.util.Scanner;

public class Lista01Exerc06 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int linha=0,coluna=0,valor=0,lugarl=0,lugarc=0,conta=0,l=0,k=0,f=0;
		
		while(linha==0 || linha>=25 && coluna==0 || coluna==25){
			System.out.print("Entre com a quantidade de linhas da matriz: ");
			linha=leia.nextInt();
			System.out.print("Entre com a quantidade de colunas da matriz: ");
			coluna=leia.nextInt();
			System.out.print("Entre com o valor: ");
			valor=leia.nextInt();
		}
		
		int a[][]=new int [linha][coluna];
		int contador[][]=new int [50][2];
		
		System.out.println("Matriz:\n");
		
		for (int i=0;i<a.length;i++){
			for (int j=0;j<a[i].length;j++){
				a[i][j]=(int)(Math.random()*100);
				if(a[i][j]==valor){
					conta++;
					//System.out.print("-->");
					contador[l][0]=i+1;
					contador[l][1]=j+1;
					//System.out.print("<--");
					l++;
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.print("\nExistem "+conta+" numeros escolhidos\n\n");
		
		if(conta>0){
			l=0;
			while(contador[l][1]!=0){
			//for(int i=0;i<conta;i++){
				System.out.println("O valor digitado esta presente na matriz na linha "+contador[l][0]+" coluna "+contador[l][1]);
				l++;
			}
			
		}else{
			System.out.println("O valor digitado nau esta presente na matriz");
			}
		
	}
}

