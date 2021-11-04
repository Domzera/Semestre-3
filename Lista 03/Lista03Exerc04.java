import java.util.Scanner;
import java.util.Arrays;

public class Lista03Exerc04 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int c=0;
		double a[]=new double[3];
		
		for(int i=0;i<=2;i++){
			System.out.println("Entre com a "+(i+1)+" nota");
			a[i]=leia.nextDouble();
		}
		
		Arrays.sort(a);

		for(int i=0;i<=2;i++){
			System.out.print(a[i]+" ");
		}
		
		System.out.println("\nAs notas usadas para a mediaforam "+
							a[1]+" e "+a[2]
							+"\nA media eh: "+notas(a[1],a[2]));
	}
	
	static double notas (double d,double e){
		return (d+e)/2;
	}
}

