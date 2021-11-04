public class Conta {
	
	private int valor;
	private int pessoas;
	private boolean gorjeta;
	
	public Conta(){
		
		this.valor=0;
		this.pessoas=1;
		this.gorjeta=false;
	}
	
	public void setValor (int valor){
		this.valor=valor;
	}
	public void setPessoas (int pessoas){
		this.pessoas=pessoas;
	}
	public void setGorjeta (boolean gorjeta){
		this.gorjeta=gorjeta;
	}
	
	public int getValor(){
		return valor;
	}
	public int getPessoas(){
		return pessoas;
	}
	public boolean getGorjeta(){
		return gorjeta;
	}
	
	public int contaSemGorjeta(){
		int resultadoS = valor/pessoas;
		
		return resultadoS;
	}
	public double contaComGorjeta(){
		double resultadoC = (valor/pessoas)*(double)0.1;
		
		return resultadoC;
	}
	
	public double totalComGorjeta(){
		double resultadoD = valor+(double)(valor*0.1);
		
		return resultadoD;
	}
}

