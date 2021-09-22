import java.util.Scanner;

public class Lista02Exerc04 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int a=0,b=0;
		
		System.out.print("Entre com o valor de 'a'\n");
		a=leia.nextInt();
		
		System.out.print("Entre com o valor de 'b'\n");
		b=leia.nextInt();
		
		System.out.print("\n\nO maior eh o "+metodo(a,b)); 
	}
	
	static int metodo (int a, int b){
		
		return Math.min(a,b);
	}
}

