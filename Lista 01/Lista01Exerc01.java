import java.util.Scanner;

public class Lista01Exerc01 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Entre com um valor\n");
		double entrada=leia.nextDouble();
		
		System.out.println("\nO valor eh positivo ? "+(metodo(entrada)? " SIM ":" NAU"));
		System.out.println(metodo(entrada));
		
	}
	
	static boolean metodo (double teste){
		
		return teste%2==0;
	
	}
}

