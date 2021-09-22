import java.util.Scanner;

public class Lista02Exerc01 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double a=0,b=0;
		
		System.out.print("Entre com o valor de 'a'\n");
		a=leia.nextDouble();
		
		System.out.print("Entre com o valor de 'b'\n");
		b=leia.nextDouble();
		
		System.out.print("\n\nO maior eh o "+metodo(a,b)); 
	}
	
	static int metodo (double a, double b){
		
		if(a>b){
			return (int)a;
			}else{
				return (int)b;
			}
	}
}

