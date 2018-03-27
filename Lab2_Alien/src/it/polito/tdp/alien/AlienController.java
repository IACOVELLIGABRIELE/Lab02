/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */

package it.polito.tdp.alien;

import java.net.URL; 
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	AlienDictionary dizionario = new AlienDictionary();

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtWord"
    private TextField txtWord; // Value injected by FXMLLoader

    @FXML // fx:id="btnTranslate"
    private Button btnTranslate; // Value injected by FXMLLoader

    @FXML // fx:id="txtResult"
    private TextArea txtResult; // Value injected by FXMLLoader

    @FXML // fx:id="btnReset"
    private Button btnReset; // Value injected by FXMLLoader

    @FXML
    void doReset(ActionEvent event) {
    	
    	txtResult.clear();

    }

    @FXML
    void doTranslate(ActionEvent event) {
    	/*
    	String s = txtWord.getText().toLowerCase().trim();
    	String v[] = s.split(" ");
    	
    	if(v.length == 2) {
    		dizionario.addWord(v[0], v[1]);
    		txtResult.appendText("La traduzione è stata aggiunta \n");
    	
    	}
    	
    	if(v.length == 1) {
    		if(dizionario.translateWord(v[0]) == null) {
    			txtResult.appendText("Parola non torvata !!! \n");}
    		else {
    		    txtResult.appendText("La traduzione è " +dizionario.translateWord(v[0])+"\n");
    		}
    	
    	}
    	if(v.length == 0 || v.length>2) {
             txtResult.appendText("Formato errato \n");}
    	
    
    	
    	txtWord.clear(); */
    	
    	//con wordEnhanced
    	String s = txtWord.getText().toLowerCase().trim();
    	String v[] = s.split(" ");
    	
    	if(v.length == 2) {
    		dizionario.addWord(v[0], v[1]);
    		txtResult.appendText("La traduzione è stata aggiunta \n");
    	
    	}
    	
    	if(v.length == 1) {
    		if(dizionario.translateWord(v[0]) == null) {
    			txtResult.appendText("Parola non torvata !!! \n");}
    		else {
    		    txtResult.appendText("La traduzione è " +dizionario.translateWord(v[0])+"\n");
    		}
    	
    	}
    	if(v.length == 0 || v.length>2) {
             txtResult.appendText("Formato errato \n");}
    	
    
    	
    	txtWord.clear();
    	

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnTranslate != null : "fx:id=\"btnTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";

    }
}
