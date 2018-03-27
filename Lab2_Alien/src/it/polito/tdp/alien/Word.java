package it.polito.tdp.alien;

public class Word {
	
	private String alienWord;
	private String translation;
	
	public Word(String alienWord, String translation) {
		//super();
		this.alienWord = alienWord;
		this.translation = translation;
	}
	
	public String getAlienWord() {
		return alienWord;
	}
	
	public void setAlienWord(String alienWord) {
		this.alienWord = alienWord;
	}
	
	public String getTranslation() {
		return translation;
	}
	
	public void setTranslation(String translation) {
		this.translation = translation;
	}
	
	@Override
	public String toString() {
		return " AlienWord = " + alienWord + ", Translation = " + translation;
	}
	
	public boolean equals(String s) {   //se la parola aliena è gia presente
		if(alienWord.equals(s)) {       // ritorna false e la sostituisce
			//this.alienWord = s;
			return false;
		}
		
		return true;
		
	}
	

}
