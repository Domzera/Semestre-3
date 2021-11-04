public class ConversaoDeUnidadesDeArea {
	
	private int metro;
	private int pe;
	private int milha;
	private int acre;
	private double centimetro;
	
	public ConversaoDeUnidadesDeArea(){
	
		this.metro=1;
		this.pe=1;
		this.milha=1;
		this.acre=1;
		this.centimetro=1.1;
	
	}
	
	//Seters
	public void setMetro (int a){
		this.centimetro=metroToCm(a);
	}
	public void setPe (int pe){
		this.centimetro=peToCm(pe);
	}
	public void setMilha (int a){
		this.centimetro=milhaToCm(a);
	}
	public void setAcre (int a){
		this.centimetro=acreToCm(a);
	}
	
	
	//Geters
	public double getMetro(){
		return metros();
	}
	public double getPe(){
		return pes();
	}
	public double getMilha(){
		return milhas();
	}
	public double getAcre(){
		return acres();
	}
	
	
	//metodos
	
	//Transforma tudo em CM na entrada
	private float metroToCm(float a){
		return a/100;
	}
	
	private double peToCm(float a){//Atenção aqui ==> Esse requer um double!!
		return a/30.48;
	}
	
	private float milhaToCm(float a){
		return a/160934;
	}
	
	private float acreToCm(float a){
		return a/404700;
	}
	
	//Transforma no que o usuario deseja
	private double metros(){
		return this.centimetro*100;
	}
	
	private double pes (){
		return this.centimetro*30.48;
	}
	
	private double milhas(){
		return this.centimetro*160934;
	}
	
	private double acres(){
		return this.centimetro*404700;
	}
}

