public class Lista01Exerc10 {
	
	public static void main (String[] args) {
		
		int linha=0;
		
		int matriz[][]=new int [10][10];
		
		System.out.println("Matriz: H\n");
		
		for (int i=0;i<matriz.length;i++){
			for (int j=0;j<matriz[i].length;j++){
				matriz[i][j]=(int)(Math.random()*100);
				if(i+j==9){
					System.out.print(matriz[i][j]+" ");
				}else{System.out.print(" 0 ");}
				
			}
			System.out.println();
		}
		
	}
}

