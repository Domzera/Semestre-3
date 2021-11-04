import java.util.Scanner;

public class Lista04Exerc04 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Data data = new Data();
		
		int dia=0,mes=0,ano=0;
		
		System.out.println("Entre com o dia:");
		data.setDiaa(leia.nextInt());
		System.out.println("Entre com o mes:");
		data.setMesa(leia.nextInt());
		System.out.println("Entre com o ano:");
		data.setAnoa(leia.nextInt());
		
		if(data.dataValidaa()==true){
			System.out.println("\nA data eh Valida!");
			System.out.println("\nA data he: "+data.getDiaa()+" / "+data.getMesa()+" / "+data.getAnoa());
		}else{
			System.out.println("\nA data nau eh Valida!");
		}
		
	}
}

