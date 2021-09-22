import java.util.Scanner;

public class Lista02Exerc05 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int a=0,b=0,c=0;
		
		System.out.print("Entre com o valor de 'a'\n");
		a=leia.nextInt();
		
		System.out.print("Entre com o valor de 'b'\n");
		b=leia.nextInt();
		
		System.out.print("Entre com o valor de 'c'\n");
		c=leia.nextInt();
		
		System.out.print("\n\nO maior entre o primeiro e o ultimo eh o "+metodo(a,c)); 
		
		System.out.print("\n\nO maior entre os tres eh o "+metodo(a,b,c)); 
	}
	
	static int metodo (int d, int e){
		
		return Math.max(d,e);
	}
	
	static int metodo (int f, int g, int h){
		
		int l = Math.max(f, g);
		int t = Math.max(l, h);
		
		return t;
	}
}

