package Asztal;

import javax.swing.ImageIcon;

import Kozos.Kartya;

public class FranciaKartya extends Kartya{

	private String neve;
	private ImageIcon kep;
	
	public FranciaKartya(String szine, int erteke, String nev, ImageIcon kepe) {
		super(szine, erteke);
		this.neve=nev;
		this.kep=kepe;
	}

	public int getPontertek() {
		
		return super.getErtek();
	}

	public String getNeve(){
		
		return getSzin()+neve;
		
	}
	
	public void setNeve(String nev){
		
		this.neve=nev;
		
	}
	
	public void setKepe(ImageIcon kepe){
		
		this.kep=kepe;
		
	}
	
	public ImageIcon getKepe(){
		
		return this.kep;
		
	}
	
}
