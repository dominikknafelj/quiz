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
 class SchaetzFrage extends AbstrakteZahlenfrage {
    
    private int prozentualeAbweichung = 0;
    
    public SchaetzFrage(String frage, int punkte, int richtigeAntwort, int prozentualeAbweichung) {
        super(frage, punkte);
        this.loesung = richtigeAntwort;
        this.prozentualeAbweichung = prozentualeAbweichung;
    }
    
    @Override
    public boolean istRichtigBeantwortet(){
       int min = this.loesung * (100 - this.prozentualeAbweichung) / 100; 
       int max = this.loesung * (100 + this.prozentualeAbweichung) / 100;
       return (this.antwort >= min ) && (this.antwort <= max) && (this.istBeantwortet());
    }
    
}
