public class Lista03Exerc05 {
	
	public static void main (String[] args) {
		
		for(int a=0; a<=1000; a++){
			if(primo(a)>0)System.out.print(primo(a)+" - ");
			
			//System.out.print(a+" - ");
		}
		
	}
	
	static int primo (int b){
		
		int cont=0;
		
		for(int c=1; c<=b; c++){
			if(b%c==0)cont++;
		}
		if(cont==2)return b;
		else{ return b=0;}
	}
}

