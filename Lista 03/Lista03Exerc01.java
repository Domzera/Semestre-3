import java.util.Scanner;

public class Lista03Exerc01 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a=0;
		
		System.out.println("Entre com a temperatura em Celsius");
		a=leia.nextInt();

		System.out.println("A temperatura em Fahrenheit eh: "+metodo(a));
	}
	
	static int metodo (int b){
		
		return ((9*b/5)+32);
	}
}

