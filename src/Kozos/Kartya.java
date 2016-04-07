package Kozos;

public abstract class Kartya {

	private String szin;
	private int ertek;
	
	public Kartya(String szine,int erteke){
			
		this.szin=szine;
		this.ertek=erteke;
	}
	
	public void setSzin(String szine){
		
		this.szin=szine;
		
	}
	
	public void setErtek(int erteke){
		
		this.ertek=erteke;
		
	}
	
	public String getSzin(){
		
		return this.szin;
		
	}
	
	public int getErtek(){
		
		return this.ertek;
		
	}
	
	public String toString(){
		
		return Integer.toString(this.ertek)+" "+this.szin;
	}
	
	public abstract int getPontertek();
	
}
