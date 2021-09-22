import java.lang.Math;
import java.util.Scanner;

public class Lista02Exerc07 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		String a="s";
		int b=0;
		
		while(a.equals("s") || a.equals("S")){
		
			System.out.print("\nDeseja jogar\nS - sim    N - nau\n");
			a=leia.nextLine();
			
			System.out.println("\nO valor eh! "+dado(b));
		
		}
	 
	}
	
	static int dado (int d){
		
		return (int)(Math.random()*(8-1));
	}
}

