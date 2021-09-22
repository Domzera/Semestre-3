import java.lang.Math;

public class Lista02Exerc08 {
	
	public static void main (String[] args) {
		
		int b=0,c=0,cont=0,total=1000000;
		int[] a={0,0,0,0,0,0};
		
		System.out.println("Os Valores sao:");
		
		dado(a,b,c,cont,total);

		for(int i =0;i<=5;i++){
			System.out.println("\n Valor "+(i+1)+" --> "+a[i]+" do total de "+total);
			System.out.printf(" percentual %.3f %%\n",((double)a[i]/(double)total)*100);
		}
	}
	
	static int[] dado (int[] d,int e,int f,int g,int h){
		
		for(int i=0;i<h;i++){
			e=(int)(Math.random()*(8-1));
			g++;
			for(int y=0;y<6;y++){
				if(e==y)d[y]=d[y]+1;
			}
		}
		return d;
	}
}

