import java.util.Scanner;

public class Lista01Exerc05 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner (System.in);
		
		double a=0,b=0,c=0,d=0;
		
		do{
			System.out.print("Entre com o valor de 'a'\n");
			a=leia.nextDouble();
		}while(a==0);
		
		System.out.print("Entre com o valor de 'b'\n");
		b=leia.nextDouble();
		System.out.print("Entre com o valor de 'c'\n");
		c=leia.nextDouble();
		
		System.out.print("\nA equacao eh:\n");
		
		if(a>=0)System.out.print(a+"X^2 ");
		else{System.out.print(a+"X^2 ");}
		
		if(b>=0)System.out.print("+"+b+"X ");
		else{System.out.print(b+"X ");}
		
		if(c>=0)System.out.print("+"+c+"\n");
		else{System.out.print(c+"\n");}
		
		System.out.println("\nO valor de Delta eh: "+delta(a,b,c));
		
		System.out.println("\n"+equacao(a,b,c));
		
	}
	
	static double delta (double a, double b, double c){
		
		return (b*b)-4*(a*c);
	}
	
	static String equacao(double a, double b, double c){
		
		double d = delta(a,b,c);
		String saida="";
		
		if(d<0)
			return "Nau existe raizes reais!";
		if(d==0)
			return "x = "+(-b/(2*a));
		if(d>0){
			saida="x\' = "+String.format("%.2f",(-b+Math.sqrt(d))/(2*a));
			saida +="\n";
			saida +="x\'\' ="+String.format("%.2f",(-b-Math.sqrt(d))/(2*a));	
		}
		return saida;
	}
}

