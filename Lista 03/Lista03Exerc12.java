import java.util.Scanner;
import java.util.Arrays;

public class Lista03Exerc12 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		int a=0;
		
		System.out.println("Entre com o valor");
		a=leia.nextInt();
		
		if(a<6){System.out.print("Erro! Valor invalido");
		}else{metodo(a);}
	}
	
	static void metodo (int a){
		int primo=0;

		for(int i=1;i<=a;i++){
			for(int j=1;j<i;j++){
				if(i%j==0){
					primo=primo+j;
				}
			}
			if(primo==i){
				System.out.println("Primo="+primo);
			}
			primo=0;
		}
	}
}
