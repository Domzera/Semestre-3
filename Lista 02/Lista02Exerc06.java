import java.util.Scanner;

public class Lista02Exerc06 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		Scanner leiaS = new Scanner (System.in);
		
		int a=0,c=100;
		String b="s";
		
		while(b.equals("s") || b.equals("S")){
		
			System.out.print("\nEntre com um valor\n");
			a=leia.nextInt();
			
			System.out.print("\nVoce deseja entrar com mais numeros?\n S-sim  N-Nau\n ");
			b=leiaS.nextLine();
			
			c=metodo(a,c);
		
		}
		
		System.out.println("\nO menor eh! "+c);
		 
	}
	
	static int metodo (int d, int f){
		
		if(d<f){return d;}
		else{return f;}
	}
}

