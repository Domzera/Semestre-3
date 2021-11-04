import java.util.Scanner;

public class Lista04Exerc02 {
	
	public static void main (String[] args) {
		Scanner leiaStr = new Scanner(System.in);
		Scanner leia = new Scanner(System.in);
		
		Conta bill = new Conta();
		
		int pessoas,valor;
		String gorjeta;
		
		System.out.print("Pagar os 10%?\n");
		gorjeta = leiaStr.nextLine().toUpperCase();
		
		switch(gorjeta){
			case "S":
				System.out.print("Quantas pessoas\n");
				bill.setPessoas(leia.nextInt());
				System.out.print("Qual o valor\n");
				bill.setValor (leia.nextInt());
				System.out.println("O valor da gorjeta eh:"+bill.contaComGorjeta());
				System.out.println("E o valor total da conta eh "+bill.totalComGorjeta());
				break;
			case "N":
				System.out.print("Quantas pessoas\n");
				bill.setPessoas (leia.nextInt());
				System.out.print("Qual o valor\n");
				bill.setValor (leia.nextInt());
				System.out.println("Nau tem gorjeta para essa conta\nE cada um vai pagar "+bill.contaSemGorjeta());
				break;
			default:
				System.out.print("com ou sem gorjeta?");
		}
	}
}

