import java.util.Scanner;
import java.util.Arrays;

public class Lista03Exerc10 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a=0,c=0;
		
		System.out.println("Entre com o a quantidade de termos");
		a=leia.nextInt();
		
		int array[]=new int[a];
		
		for(int i=0;i<a;i++){		
			System.out.println("Entre com o valor "+(i+1));
			array[i]=leia.nextInt();
		}
		
		System.out.println("\n\nRetorno "+mmc(array));
		
	}
	
	static int mmc (int a[]){
		int mmc=1,div=2,cont1=1,cont2=0,cont3=0,verifica=0;
		int conta[]=new int[a.length];
		
		while(cont1!=0){
			
			for(int i=0;i<a.length;i++){	
				if(a[i]%div==0)verifica++;
			}
			
			if(verifica!=0){
			
				for(int i=0;i<a.length;i++){
					cont2=0;
					System.out.print(a[i]+" ");
					if(a[i]%div==0){
						a[i]=a[i]/div;
						cont2++;
					}
				}
				mmc=mmc*div;
				System.out.println(" /"+div);
			}else{div++;}
			
			for(int i=0;i<a.length;i++){
				if(a[i]==1)cont3++;
			}
			
			if(cont3!=a.length){
				cont1=1;
			}else{cont1=0;}
			cont3=0;
			verifica=0;
		}
		return mmc;
	}
}
