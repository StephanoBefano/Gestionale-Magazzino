/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stefano.casti
 */
public class Prodotto {
    private String codice;
    private String nome;    
    private String descrizione;
    private int giacenza;
    private double prezzo;
    
    Prodotto (String codice, String nome, String descrizione, int giacenza, double prezzo){
        this.codice=codice;
        this.nome=nome;        
        this.descrizione= descrizione;
        this.giacenza=giacenza;
        this.prezzo=prezzo;
    }
    
    
    public String getNome() {
        return nome;
    }
    
    public String getCodice(){
        return codice;
    }
    
    public String getDescrizione() {
        return descrizione;
    }

    public int getGiacenza() {
        return giacenza;
    }

    public double getPrezzo() {
        return prezzo;
    }
    
    public void setNome(String nuovoNome){
        this.nome = nuovoNome;
    }
    
    public void setDescrizione(String nuovaDescrizione){
        this.descrizione = nuovaDescrizione;
    }
    
    public void setGiacenza(int newGiacenza){
        this.giacenza = newGiacenza;
    }
    
    public void setPrezzo(double nuovoPrezzo){
        this.prezzo = nuovoPrezzo;
    }
}
