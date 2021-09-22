import java.util.Scanner;

public class Lista01Exerc03 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Entre com um valor\n");
		int entrada=leia.nextInt();
		
		if(metodo(entrada)==1){System.out.println("\n\nO numero eh negativo");}
			else if(metodo(entrada)==2){System.out.println("\n\nO numero eh zero");}
			else{System.out.println("\n\nO numero eh positivo");}
		
		metodo(entrada);
		
	}
	
	static int metodo (int teste){
		
			if(teste<0){teste=1;}
			else if(teste==0){teste=2;}
			else{teste=3;}
		
		return teste;
	}
}

