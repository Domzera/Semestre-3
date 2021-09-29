import java.util.Scanner;

public class Lista03Exerc14 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int a=0;
		
		System.out.println("Entre com o valor");
		a=leia.nextInt();
		
		System.out.print(">>"+metodo(a));
		
	}
	
	static String metodo (int a){
		String b=String.valueOf(a);
		String c="";
		
		for(int i=b.length();i>0;i--){
			c+=b.substring(i-1,i);
		}
		
		return c;
	
	}
}
