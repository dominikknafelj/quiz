/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author Dominik Knafelj <d.knafelj@gmail.com>
 */
 abstract class AbstrakteZahlenfrage implements Zahlenfrage {
    
    private int maxPunkte = 0;
    private String frage = null;
    protected int loesung = 0;
    protected int antwort = 0;
    protected boolean beantwortet = false;
    
    
    public AbstrakteZahlenfrage(String frage, int punkte){
        this.frage = frage;
        this.maxPunkte = punkte;
    }
    
    public void legeAntwortFest(int antwort){
        this.beantwortet = true;
        this.antwort = antwort;
    }
    
    public int liefereErreichtePunkte(){
        return (this.istRichtigBeantwortet())? this.maxPunkte : 0;
    }
    
    public String liefereFrage(){
        return this.frage;
    }
    
    public int liefereMoeglichePunkte(){
        return this.maxPunkte;
    }
    
 
    public boolean istBeantwortet() {
       return beantwortet;
    }

    
    public boolean istRichtigBeantwortet() {
       return ((this.antwort == this.loesung) && this.istBeantwortet());
    }

    
}
