import java.util.Scanner;
import java.util.Arrays;

public class Lista03Exerc11 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int a=0;
		
		System.out.println("Entre com o valor");
		a=leia.nextInt();
		
		if(a<6){
			System.out.println("\nErro! Valor invalido");
		}else if(metodo(a)==true){
			System.out.println("\nO numero "+a+" eh perfeito");
			}else{System.out.println("\nO numero "+a+" NAU eh perfeito");}
		
	}
	
	static boolean metodo (int a){
		int div=2,cont=0;
		boolean primo;
		
		for(int i=1;i<a;i++){
			if(a%i==0){
				cont=cont+i;
			}
		}
		
		if(cont==a){
			primo=true;
		}else{primo=false;}
		
		return primo;
	}
}
