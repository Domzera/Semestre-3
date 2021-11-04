import java.lang.Math;

public class Equacao {
	
	private int a;
	private int b;
	private int c;
	private int delta;
	
	public Equacao(){
		
		this.a=0;
		this.b=0;
		this.c=0;
	}
	
	public void setA(int a){
		this.a=a;
	}
	public void setB(int b){
		this.b=b;
	}
	public void setC(int c){
		this.c=c;
	}
	
	public int a(){
		return a;
	}
	public int b(){
		return b;
	}
	public int c(){
		return c;
	}
	
	public int delta(int a, int b,int c){
		return (b*b)-4*(a*c);
	}
	
	public double raiza(int a,int b,int c){
		
		return (-b+(Math.sqrt(delta(a,b,c))))/(2*a);
	}
	public double raizb(int a,int b,int c){
		return (-b-(Math.sqrt(delta(a,b,c))))/(2*a);
	}
}
