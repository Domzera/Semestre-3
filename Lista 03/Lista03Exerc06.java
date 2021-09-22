import java.util.Scanner;
import java.util.Arrays;

public class Lista03Exerc06 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a=0,b=0,c=0;
		
		System.out.println("Entre com o primeiro valor");
		a=leia.nextInt();
		System.out.println("Entre com o segundo valor");
		b=leia.nextInt();
		
		if(b<a){
			c=a;
			a=b;
			b=c;
		}

		int primos[]= metodo(a,b);
		
		System.out.println("\nOs numeros sau:");
		
		for(int i=0;i<primos.length;i++){
			System.out.print(primos[i]+" ");
		}
	}
	
	
	
	static int[] metodo (int d,int e){
		int cont=0,cont1=0,c=0;
		c=d;
		
		while(c<=e){
			cont=0;
			
			for(int i=1;i<=c;i++){
				if(c%i==0)cont++;
			}

			if(cont==2){
				cont1++;
			}
			c++;
		}
		
		int a[]= new int [cont1];
		cont1=0;
		c=d;
		
		while(c<=e){
			cont=0;
					
			for(int i=1;i<=c;i++){
				if(c%i==0)cont++;
			}

			if(cont==2){
				a[cont1]=c;
				//System.out.println("Quantos numeros tem =>"+cont1+" e numero="+c);
				cont1++;
			}
			c++;
		}
		return a;
	}
}
