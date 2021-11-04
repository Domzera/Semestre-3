import java.util.Scanner;

public class Lista04Exerc07 {
	
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ModeloDeComputador modelo = new ModeloDeComputador();
		
		int a=0,b=0,c=0,d=0;
		
		System.out.println("Escolha o processador:\n 1-1600MHZ 2-1800MHZ 3-1900MHZ");
		a=leia.nextInt();
		System.out.println("Escolha a memoria:\n 1-1GB 2-2GB 3-4GB 4-6GB 5-8GB ");
		b=leia.nextInt();
		System.out.println("Escolha o tamanho do disco:\n 1-500GB 2-1TB 3-2TB");
		c=leia.nextInt();
		System.out.println("Escolha o monitor:\n 1-15 polegadas 2-17 polegadas");
		d=leia.nextInt();

		System.out.println("O modelo escolhido foi placa mae de 800,00 Reais.");
		System.out.println("O processador "+modelo.ModeloProcessador(a)+"Mhz de "+modelo.precoProcessador(a)+" Reais.");
		System.out.println("A memoria de "+modelo.ModeloMemoria(b)+"GB de "+modelo.precoMemoria(b)+" Reais.");
		
		if(c>1){
			System.out.println("O disco rigido de "+modelo.ModeloDisco(c)+"TB de "+modelo.precoDisco(c)+" Reais.");
		}else{
		System.out.println("O disco rigido de "+modelo.ModeloDisco(c)+"GB de "+modelo.precoDisco(c)+" Reais.");
		}
		
		System.out.println("O monitor de "+modelo.ModeloMonitor(d)+" polegadas de "+modelo.precoMonitor(d)+" Reais.");
		System.out.println("");
		System.out.println("O valor total foi de "+(
							800+modelo.precoProcessador(a)+
							modelo.precoMemoria(b)+modelo.precoDisco(c)+
							modelo.precoMonitor(d))+" Reais.");
	}
}

