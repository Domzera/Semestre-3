import java.util.Scanner;
import java.util.Arrays;

public class Lista03Exerc13 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int a=0;
		
		System.out.println("Entre com o valor");
		a=leia.nextInt();
		
		if(a<=0){
			System.out.print("Erro! Valor invalido");
		}else{				
			int array[]=new int[a];
		
			for(int i=0;i<a;i++){		
				System.out.println("Entre com o valor "+(i+1));
				array[i]=leia.nextInt();
			}
			
			metodo(array);
		}
		
	}
	
	static void metodo (int a[]){
		int primo=0,div=2,cont1=0,cont2=0;
		int arrays[]=new int[a.length];
	
		for(int i=0;i<a.length;i++){
			
			for(int j=1;j<a[i];j++){
				if(a[i]%j==0){
				cont2=cont2+j;
				}
			}
			
			if(cont2==a[i]){
				System.out.println(">>"+cont2);
			}
			cont2=0;
		}
	
		
	}
}
