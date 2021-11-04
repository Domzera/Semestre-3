public class ModeloDeComputador {
	
	private int processador;
	private int memoria;
	private int disco;
	private int monitor;
	
	private int precoProcessador1;
	private int precoProcessador2;
	private int precoProcessador3;
	private int modeloProcessador1;
	private int modeloProcessador2;
	private int modeloProcessador3;
	private int precoMemoria1;
	private int precoMemoria2;
	private int precoMemoria3;
	private int precoMemoria4;
	private int precoMemoria5;
	private int modeloMemoria1;
	private int modeloMemoria2;
	private int modeloMemoria3;
	private int modeloMemoria4;
	private int modeloMemoria5;
	private int precoDisco1;
	private int precoDisco2;
	private int precoDisco3;
	private int modeloDisco1;
	private int modeloDisco2;
	private int modeloDisco3;
	private int precoMonitor1;
	private int precoMonitor2;
	private int modeloMonitor1;
	private int modeloMonitor2;
	
	//Construtor
	public ModeloDeComputador(){
		
		this.precoProcessador1=700;
		this.precoProcessador2=830;
		this.precoProcessador3=910;
		this.precoMemoria1=350;
		this.precoMemoria2=700;
		this.precoMemoria3=1400;
		this.precoMemoria4=2100;
		this.precoMemoria5=2800;
		this.precoDisco1=300;
		this.precoDisco2=420;
		this.precoDisco3=500;
		this.precoMonitor1=320;
		this.precoMonitor2=520;
		
		this.modeloProcessador1=1600;
		this.modeloProcessador2=1800;
		this.modeloProcessador3=1900;
		this.modeloMemoria1=1;
		this.modeloMemoria2=2;
		this.modeloMemoria3=4;
		this.modeloMemoria4=6;
		this.modeloMemoria5=8;
		this.modeloDisco1=500;
		this.modeloDisco2=1;
		this.modeloDisco3=2;
		this.modeloMonitor1=15;
		this.modeloMonitor2=17;
	}
	
	//Metodos
	//Retorna os valores
	
	public int precoProcessador(int a){
		int escolha=0;
		switch(a){
			case 1:
				escolha=this.precoProcessador1;
				break;
			case 2:
				escolha=this.precoProcessador2;
				break;
			case 3:
				escolha=this.precoProcessador3;
				break;
		}
		return escolha;
	}
	
	public int precoMemoria(int b){
		int escolha=0;
		switch(b){
			case 1:
				escolha=this.precoMemoria1;
				break;
			case 2:
				escolha=this.precoMemoria2;
				break;
			case 3:
				escolha=this.precoMemoria3;
				break;
			case 4:
				escolha=this.precoMemoria4;
				break;
			case 5:
				escolha=this.precoMemoria5;
				break;
		}
		return escolha;
	}
	
	public int precoDisco(int c){
		int escolha=0;
		switch(c){
			case 1:
				escolha=this.precoDisco1;
				break;
			case 2:
				escolha=this.precoDisco2;
				break;
			case 3:
				escolha=this.precoDisco3;
				break;
		}
		return escolha;
	}
	
	public int precoMonitor(int d){
		int escolha=0;
		switch(d){
			case 1:
				escolha=this.precoMonitor1;
				break;
			case 2:
				escolha=this.precoMonitor2;
				break;
		}
		return escolha;
	}
	
	//Retorna os modelos
	
	public int ModeloProcessador(int a){
		int escolha=0;
		switch(a){
			case 1:
				escolha=modeloProcessador1;
				break;
			case 2:
				escolha=modeloProcessador2;
				break;
			case 3:
				escolha=modeloProcessador3;
				break;
		}
		return escolha;
	}
	
	public int ModeloMemoria(int b){
		int escolha=0;
		switch(b){
			case 1:
				escolha=modeloMemoria1;
				break;
			case 2:
				escolha=modeloMemoria1;
				break;
			case 3:
				escolha=modeloMemoria1;
				break;
			case 4:
				escolha=modeloMemoria1;
				break;
			case 5:
				escolha=modeloMemoria1;
				break;
		}
		return escolha;
	}
	
	public int ModeloDisco(int c){
		int escolha=0;
		switch(c){
			case 1:
				escolha=modeloDisco1;
				break;
			case 2:
				escolha=modeloDisco2;
				break;
			case 3:
				escolha=modeloDisco3;
				break;
		}
		return escolha;
	}
	
	public int ModeloMonitor(int d){
		int escolha=0;
		switch(d){
			case 1:
				escolha=modeloMonitor1;
				break;
			case 2:
				escolha=modeloMonitor2;
				break;
		}
		return escolha;
	}
	
}
