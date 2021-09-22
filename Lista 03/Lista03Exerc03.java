import java.util.Scanner;

public class Lista03Exerc03 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Scanner leiaS = new Scanner(System.in);
		
		String a="";
		int b=0;
		
		while(
			(a.equals("C") || a.equals("c") ||
			a.equals("F") || a.equals("f") ||
			a.equals("K") || a.equals("k") ||
			a.equals("S") || a.equals("s")) != true)
			{
			System.out.println("Escolha o tipo da entrada!\n[C]=>Celsius [F]=>Fahrenheit [K]=>Kelvin [S]=>Sair");
			a=leiaS.nextLine();
		}
		
		if(a.equals("s") || a.equals("S"))System.exit(0);
		
		System.out.println("Entre com a temperatura");
		b=leia.nextInt();

		if(a.equals("c") || a.equals("C")){
			System.out.println("A temperatura em Fahrenheit eh: "+fahre(b));
			System.out.println("A temperatura em Kelvin eh: "+kelvin(b));
			}else if(a.equals("f") || a.equals("F")){
				System.out.println("A temperatura em Celsius eh: "+celsius(b));
				System.out.println("A temperatura em Kelvin eh: "+kelvin(b));
				}else{
					System.out.println("A temperatura em Celsius eh: "+celsius(b));
					System.out.println("A temperatura em Fahrenheit eh: "+fahre(b));
		}
	}
	
	static int celsius (int c){
		return 5*(c-32/9);
	}
	static int kelvin (int k){
		return k+273;
	}
	static int fahre (int f){
		return (9*f/5)+32;
	}
}

