import java.util.Scanner;
import java.util.Arrays;

public class Lista03Exerc07AJustado {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a=0,b=0,c=0;
		
		System.out.println("Entre com o primeiro valor");
		a=leia.nextInt();
		System.out.println("Entre com o segundo valor");
		b=leia.nextInt();
		
		if(b<a){
			c=a;
			a=b;
			b=c;
		}

		int conta = mdc(a,b);
		
		System.out.println("\nOs numeros sau:");
		
		/*
		for(int i=0;i<mdc.length;i++){
			System.out.print(mdc[i]+" ");
		}*/
		
		System.out.print("Conta =>"+conta);
	}
	
	static int mdc (int a,int b){
		//Inicio das alterações
		//Cont é definido como um para não gerar erro no multiplicação de números maiores
		int div=2,cont=1;

		while(a!=1 || b!=1){
			
			System.out.println("A="+a+" B="+b+"/ DIV="+div+"\n");
						
			//if a cima de tudo pois ele precisa de prioridade para passar primeiro
			if(a%div==0 && b%div==0){
				System.out.println(a + " " + b);
				System.out.println(div);
				System.out.println(cont);
				cont=cont*div;
			}

			// se esses dois if estiver em cima do outro eles vão fazer a disão primeiro
			//consequentemente nunca entrando no if com && pois os valores ou de a ou de b ja foram dividos
			if(a%div==0)a=a/div;
			if(b%div==0)b=b/div;

			
			if(a%div==0 || b%div==0)div=1;
			
			div++;
		
		}
		//Final das alterações
		System.out.println("A="+a+" B="+b+"/ DIV="+div+"\n");
		System.out.print(cont);
		
		//int a[]= new int [cont1];
		
		return a;
	}
}
