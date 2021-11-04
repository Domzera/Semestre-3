/*
 * Classe da -Lampada-
 * 
 * Exercicio 01 da lista 04 
*/

public class Lampada {
	
	private String marca;
	private String modelo;
	private String tipo;
	
	public Lampada(){
		
		this.marca="";
		this.modelo="";
		this.tipo="";
	}
	
	public void setMarca (String marca){
		this.marca=marca;
	}
	public void setModelo (String modelo){
		this.modelo=modelo;
	}
	public void setTipo (String tipo){
		this.tipo=tipo;
	}
	
	public String getMarca(){
		return marca;
	}
	public String getModelo(){
		return modelo;
	}
	public String getTipo(){
		return tipo;
	}
	
	public boolean aceso(boolean interruptor ){
		return true;
	}	
}

