import java.util.Scanner;

public class Lista04Exerc06 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Data data = new Data();
		
		int opcao=0;
		
		
		while(opcao!=6){
			
			System.out.println("Escolha uma opcao");
			System.out.println("1 - entrar com uma data");
			System.out.println("2 - Saber qual data eh a maior.");
			System.out.println("3 - Saber qual data eh a menor.");
			System.out.println("4 - Saber se as datas sau iguais.");
			System.out.println("5 - Saber a diferenca entre alas.");
			System.out.println("6 - Para sair.");
			opcao=leia.nextInt();
		
			switch(opcao){
				case 1:
					System.out.println("Entre com o dia da primeira data:");
					data.setDiaa(leia.nextInt());
					System.out.println("Entre com o mes da primeira data:");
					data.setMesa(leia.nextInt());
					System.out.println("Entre com o ano da primeira data:");
					data.setAnoa(leia.nextInt());
					
					System.out.println("Entre com o dia da segunda data:");
					data.setDiab(leia.nextInt());
					System.out.println("Entre com o mes da segunda data:");
					data.setMesb(leia.nextInt());
					System.out.println("Entre com o ano da segunda data:");
					data.setAnob(leia.nextInt());
				
				break;
				case 2:
					/*
					data.maiormenor() ? 
					"A " + data.getDiaa() + " / " + data.getMesa() + " / " + data.getAnoa() + " eh maior." :
					"A " + data.getDiab() + " / " + data.getMesb() + " / " + data.getAnob() + " eh maior." ;
					*/
					if(data.maiormenor()){
						System.out.println("==========>A " + data.getDiaa() + " / " + data.getMesa() + " / " + data.getAnoa() + " eh maior.");
					}else{System.out.println("==========>A " + data.getDiab() + " / " + data.getMesb() + " / " + data.getAnob() + " eh maior.");}
				break;
				case 3:
					if(!data.maiormenor()){
						System.out.println("==========>A " + data.getDiaa() + " / " + data.getMesa() + " / " + data.getAnoa() + " eh a menor.");
					}else{System.out.println("==========>A " + data.getDiab() + " / " + data.getMesb() + " / " + data.getAnob() + " eh a menor.");}
				break;
				case 4:
					if(data.iguais()){
						System.out.println("==========>As datas sau iguais");
					}else{System.out.println("==========>As datas sau diferentes");}
				break;
				case 5:
					System.out.println("==========>A diferenca eh de "+data.diferenca()+" dias");
					
				break;
				case 6:
				System.out.println("==========> Tchau <==========");
			}
		}
	}
}

