package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {
	
	//TreeMap<String, Word> mappaTraduzioni;
	  TreeMap<String, WordEnhanced> mt;
	
	public AlienDictionary() {
		
		//mappaTraduzioni = new TreeMap<String, Word>();
		mt = new TreeMap<String, WordEnhanced>();
	}

	public void addWord(String alienWord, String translation) {
		
		/*Word w = new Word(alienWord, translation);
		
		                                                         //se contiene la parola alieno la sostituisce con nuova traduzione
		if(mappaTraduzioni.containsKey(alienWord)) {
			mappaTraduzioni.replace(alienWord, w);}
		else  {                                                  //altrimenti aggiunge la nuova parola
		mappaTraduzioni.put(alienWord, w);}
		
		*/
		
		//soluzione con wordEnhanced
		
		WordEnhanced w = new WordEnhanced(alienWord);
	    
		if(mt.containsKey(alienWord)) {
			mt.get(alienWord).addTraduzioni(translation);
		}
		else  {
		    w.addTraduzioni(translation);
		    mt.put(alienWord, w);
		}
		
	}
	
	public String translateWord(String alienWord) {
		//restituisce la traduzione di una parola alieno
		/*
		if(mappaTraduzioni.containsKey(alienWord))
			return mappaTraduzioni.get(alienWord).toString();
		
		return null;*/
		
		
		//con wordEnhanced
		String risultato = "";
		
		if(!mt.containsKey(alienWord)) {
			return null;
		}
		
		if(mt.containsKey(alienWord)) {
			for(String a : mt.get(alienWord).traduzioni) {
				risultato = risultato +a +", ";
			}
		}
		
		return risultato;
		
	}

}
