import java.util.Scanner;

public class Lista03Exerc02 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leiaS = new Scanner(System.in);
		
		String a="";
		int b=0;
		
		while(
			(a.equals("C") || a.equals("c") ||
			a.equals("F") || a.equals("f") ||
			a.equals("S") || a.equals("s")) != true)
			{
			System.out.println("[C]=>Celsius [F]=>Fahrenheit [S]=>Sair");
			a=leiaS.nextLine();
		}

		if(a.equals("s") || a.equals("S"))System.exit(0);
		
		System.out.println("Entre com a temperatura");
		b=leia.nextInt();

		if(a.equals("c") || a.equals("C")){
			System.out.println("A temperatura em Celsius eh: "+metodo(a,b));
		}else{		
		System.out.println("A temperatura em Fahrenheit eh: "+metodo(a,b));
		}
	}
	
	static int metodo (String c,int d){
		
		if(c.equals("c") || c.equals("C")){
			return ((9*d/5)+32);		
		}else{
			return (5*(d-32)/9);
		}
	}
}

