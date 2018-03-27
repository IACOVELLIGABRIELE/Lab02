package it.polito.tdp.alien;

import java.util.LinkedList;

public class WordEnhanced {

	private String alieno;
	LinkedList<String> traduzioni;
	
	public WordEnhanced(String alieno) {
		this.alieno = alieno;
		traduzioni = new LinkedList<String>();
	}

	public String getAlieno() {
		return alieno;
	}

	public void setAlieno(String alieno) {
		this.alieno = alieno;
	}

	public void addTraduzioni(String t) {
		traduzioni.add(t);
	}
	
	
	
}
