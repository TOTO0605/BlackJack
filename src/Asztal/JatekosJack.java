package Asztal;

import java.util.ArrayList;
import java.util.List;

import Kozos.Jatekos;

public class JatekosJack extends Jatekos<FranciaKartya>{

	private int pontszam; // aktuális pontja
	private int buntetoPont; // eddigi körökben szerzett büntetõpontja 
	private List<List<FranciaKartya>> eddigiLapok=new ArrayList<List<FranciaKartya>>();
	
	public JatekosJack(String nev, List<FranciaKartya> kartyak) {
		super(nev, kartyak);
		this.pontszam=0;
		this.buntetoPont=0;
		this.eddigiLapok=new ArrayList<List<FranciaKartya>>();
	}
	
	public int getPontszam(){
		
		return this.pontszam;
		
	}
	
	public void setPontszam(int pont){
		
		this.pontszam=pont;
		
	}

	public int getBuntetoPont(){
		
		return this.buntetoPont;
		
	}
	
	public void setBuntetoPont(int pont){
		
		this.buntetoPont=pont;
		
	}
	
	public void BuntetoPontotKap(int pont){
		
		this.buntetoPont+=pont;
		
	}
	
	public void lapotHuz(FranciaKartya kartya) {
		
		setKartya(kartya);
		
	}

	public void paklitKap(){
		
		eddigiLapok.add(new ArrayList<FranciaKartya>(super.getKartyak()));
		
	}
	
	public List<FranciaKartya> Megnez(int hanyadikat){
		
		return eddigiLapok.get(hanyadikat);
	}

	public int Korszam (){
		
		return eddigiLapok.size();
		
	}
}
