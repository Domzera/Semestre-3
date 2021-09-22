import java.util.Scanner;
import java.util.Arrays;

public class Lista03Exerc07 {
	
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
		System .out.println("O valor do MDC eh: "+mdc(a,b));
	}
	
	static int mdc (int a,int b){
		int div=2,cont=1,c=0;

		while(a!=1 || b!=1){
			
			System.out.println("A="+a+" B="+b+"/ DIV="+div+"\n");
						
			if(a%div==0 && b%div==0){
				cont=cont*div;
			}

			if(a%div==0)a=a/div;
			if(b%div==0)b=b/div;
	
			if(a%div==0 || b%div==0)div=1;			
			div++;
		}
		System.out.println("A="+a+" B="+b+"/ DIV="+div+"\n");
		
		return cont;
	}
}
