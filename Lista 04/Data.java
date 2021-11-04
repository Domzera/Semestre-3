public class Data {
	
	private int diaa;
	private int mesa;
	private int anoa;
	
	private int diab;
	private int mesb;
	private int anob;
	
	private int distanciad;
	private int distanciam;
	private int distanciaa;
	private int distanciat;
	private int testa;
	private int maior;
	
	//Construtor
	public Data(){
	
		this.diaa=1;
		this.mesa=1;
		this.anoa=2000;
		
		this.diab=1;
		this.mesb=1;
		this.anob=2000;
		
	}
	
	//Seters
	public void setDiaa (int diaa){
		this.diaa=diaa;
	}
	public void setMesa (int mesa){
		this.mesa=mesa;
	}
	public void setAnoa (int anoa){
		this.anoa=anoa;
	}
	public void setDiab (int diab){
		this.diab=diab;
	}
	public void setMesb (int mesb){
		this.mesb=mesb;
	}
	public void setAnob (int anob){
		this.anob=anob;
	}
	
	//Gueders
	public int getDiaa (){
		return diaa;
	}
	public int getMesa(){
		return mesa;
	}
	public int getAnoa(){
		return anoa;
	}
	public int getDiab (){
		return diab;
	}
	public int getMesb(){
		return mesb;
	}
	public int getAnob(){
		return anob;
	}
	
	//Metodos
	public boolean dataValidaa(){
		if(diaa>0 && diaa<31 && mesa<=12 && mesa>0 && anoa>0){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean dataValidab(){
		if(diab>0 && diab<31 && mesb<=12 && mesb>0 && anob>0){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean iguais(){
		if(diaa==diab && mesa==mesb && anoa==anob){
			return true;
		}else{
			return false;
		}
	}
	
	public int diferenca(){
		if(diaa>diab){
			distanciad=diaa-diab;
		}else if(diab>diaa){
				distanciad=diab-diaa;
			}else{distanciad=0;}
		
		if(mesa>mesb){
			distanciam=(mesa-mesb)*31;
		}else if(mesb>mesa){
				distanciam=(mesb-mesa)*31;
			}else{distanciam=0;}
		
		if(anoa>anob){
			distanciaa=(anoa-anob)+365;
		}else if(anob>anoa){
				distanciaa=(anob-anoa)*365;
			}else{distanciaa=0;}
		
		distanciat=distanciaa+distanciad+distanciam;
		
		return distanciat;
	}
	
	public boolean maiormenor(){
		if(anoa>anob){
			maior=1;
			if(mesa>mesb){
				maior+=1;
				if(diaa>diab){
					maior+=1;
				}
			}
		}
		if(maior>2){
			return true;
		}
		return false;
		
	}
	
}

