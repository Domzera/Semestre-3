import java.util.Scanner;

public class Lista04Exerc05 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		Equacao eq = new Equacao();
		
		int a=0,b=0,c=0;
		
		System.out.println("Entre com o valor de a:");
		a=leia.nextInt();		
		System.out.println("Entre com o valor de a:");
		b=leia.nextInt();
		System.out.println("Entre com o valor de a:");
		c=leia.nextInt();
		
		System.out.print("\nA equacao eh:\n");
		
		if(a>=0)System.out.print(a+"X^2 ");
		else{System.out.print(a+"X^2 ");}
		
		if(b>=0)System.out.print("+"+b+"X ");
		else{System.out.print(b+"X ");}
		
		if(c>=0)System.out.print("+"+c+"\n");
		else{System.out.print(c+"\n");}
		
		System.out.println("\nO valor de Delta eh: "+eq.delta(a,b,c));
		
		if(eq.delta(a,b,c)>0){
			
			System.out.println("\nRaiz a =>"+eq.raiza(a,b,c));
			System.out.println("\nRaiz b =>"+eq.raizb(a,b,c));
		}else {System.out.println("\nNau existe razi para essa equacao!");}
		
	}
}

