import java.util.Scanner;
import java.util.Arrays;

public class Lista03Exerc08 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a=0,c=0;
		
		
		System.out.println("Entre com o a quantidade de termos");
		a=leia.nextInt();
		
		int arrayz[]=new int[a];
		
		for(int i=0;i<a;i++){		
			System.out.println("Entre com o valor "+(i+1));
			arrayz[i]=leia.nextInt();
		}
		
		System.out.println("\n\nRetorno "+mdc(arrayz));
		
	}
	
	static int mdc (int a[]){
		int mdc=1,div=2,cont1=1,cont2=0;
		int conta[]=new int[a.length];
		
		while(cont1!=0){
			
			for(int i=0;i<a.length;i++){
				System.out.print(" "+a[i]);
				if(a[i]%div==0){
					a[i]=a[i]/div;
					conta[i]=1;
				}else{conta[i]=0;}
			}
			System.out.println(" /"+div);
			for(int i=0;i<conta.length;i++){
				if(conta[i]==1){
					cont2++;
				}
				if(a[i]==1)cont1++;
			}
			if(cont2==conta.length)mdc=mdc*div;//System.out.print("Igual\n");
			if(cont2==0){div++;}
			if((cont1-1)==conta.length){
				cont1=0;
			}
			else{cont1=1;}
			
			cont2=0;
		}
		
		return mdc;
	}
}
