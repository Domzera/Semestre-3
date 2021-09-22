

public class Lista01Exerc22 {
	
	public static void main (String[] args) {
		
		int n=(int)(Math.random()*10)+1;//No maximo 10
		int m=(int)(Math.random()*10)+1;//No maximo 10
		int p=(int)(Math.random()*10)+1;//No maximo 10
		
		int menor=0,maior=0,coluna=0;
		
		int[][] a,b,c;
		a=new int[n][m];
		b=new int[n][p];
		c=new int[n][m+p];
		
		System.out.println("Matriz A:");
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				a[i][j]=(int)(Math.random()*10);
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("Matriz B:");
		
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b[i].length;j++){
				b[i][j]=(int)(Math.random()*10);
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
		
		menor=Math.min(m,p);
		maior=Math.max(m,p);
		
		
		for(int i=0;i<c.length;i++){
			coluna=0;
			for(int j=0;j<menor;j++){
			
				c[i][coluna++]=a[i][j];
				c[i][coluna++]=b[i][j];
			}
			/*
			for(int j=menor;j<a[i].length;j++){
				c[i][coluna]=a[i][j];
				coluna++;
			}
			
			for(int j=menor;j<b[i].length;j++){
				c[i][coluna]=b[i][j];
				coluna++;
			}*/
			
			for(int j=menor;j<maior;j++){
				if(maior==a[i].length){
					c[i][coluna]=a[i][j];
				}else{
					c[i][coluna]=b[i][j];
				}
			coluna++;
		}
		}
		
		System.out.println("Matriz C:");
		
		for(int i=0;i<c.length;i++){
			for(int j=0;j<c[i].length;j++){
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
	}
}

