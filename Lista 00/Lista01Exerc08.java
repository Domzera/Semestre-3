public class Lista01Exerc08 {
	
	public static void main (String[] args) {
		
		int linha=20,coluna=18,a=0,d=0,ci=0,cp=0;
		
		int b[][]=new int [linha][coluna];
		int par[]=new int [400];
		int impar[]=new int [400];
		
		System.out.println("Matriz F: \n");
		
		for (int i=0;i<b.length;i++){
			for (int j=0;j<b[i].length;j++){
				b[i][j]=(int)(Math.random()*100);
				System.out.print(b[i][j]+" ");
				if(b[i][j]%2==0){
					par[a]=b[i][j];
					cp++;
				}else{
					impar[d]=b[i][j];
					ci++;
				}
				a++;
				d++;
			}
			System.out.println();
		}
		
		System.out.println("\nPar "+cp+"\n");
		System.out.println("Impar "+ci+"\n");
		
		for(int i=0;i<cp;i++){if(par[i]!=0)System.out.print(par[i]+" ");}
		System.out.println("\n");
		for(int i=0;i<ci;i++){if(impar[i]!=0)System.out.print(impar[i]+" ");}
	}
}
