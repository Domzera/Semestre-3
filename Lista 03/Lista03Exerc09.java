import java.util.Scanner;
import java.util.Arrays;

public class Lista03Exerc09 {
	
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
		System .out.println("\nO valor do MMC eh: "+metodo(a,b));
	}
	
	static int metodo (int a,int b){
		int mmc=1,div=2,cont=0,cont2=0;

		while(cont2==0){
			System.out.println(a+" "+b+" /"+div);
			
			if(a%div==0 || b%div==0){
				if(a%div==0)a=a/div;
				if(b%div==0)b=b/div;
				cont++;
				mmc=mmc*div;
				//System.out.println(a+" "+b+" /"+div+" cont="+cont);
			}else{cont=0;}
			//System.out.println("Cont="+cont);
			if(cont==0)div++;	
			if(a==1 && b==1)cont2=1;
			
		}
		System.out.println(a+" "+b+" /"+div);	
		return mmc;
	}
}
