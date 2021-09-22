import java.util.Scanner;

public class Lista01Exerc04 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double a=0,b=0,c=0,d=0;
		
		do{
			System.out.print("Entre com o valor de 'a'\n");
			a=leia.nextDouble();
		}while(a==0);
		
		System.out.print("Entre com o valor de 'b'\n");
		b=leia.nextDouble();
		System.out.print("Entre com o valor de 'c'\n");
		c=leia.nextDouble();
		
		d = metodo(a,b,c);
		System.out.println("Delta: "+d);
	}
	
	static double metodo (double a, double b, double c){
		return b*b-4*a*c;
	}
}

