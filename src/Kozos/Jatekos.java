package Kozos;

import java.util.ArrayList;
import java.util.List;

public abstract class Jatekos<Egyedi> {

	public String nev;
	private List<Egyedi> kartyak=new ArrayList<Egyedi>();
	
	public Jatekos(String nev,List<Egyedi> kartyak){
		
		this.nev=nev;
		this.kartyak=kartyak;
	}
	
	public String getNev(){
		
		return this.nev;
		
	}
	public List<Egyedi> getKartyak(){
		
		return this.kartyak;
		
	}
	
	public void setKartyak(List<Egyedi> kartyak){
		
		this.kartyak=kartyak;
		
	}
	
	public Egyedi getKartya(int hanyadik){
		
		return this.kartyak.get(hanyadik);
		
	}
	
	public void setKartya(Egyedi kartya){
		
		this.kartyak.add(kartya);
		
	}
	
	public abstract void lapotHuz(Egyedi pakli);
	
}
