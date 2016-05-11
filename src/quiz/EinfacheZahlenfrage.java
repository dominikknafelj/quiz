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
 class EinfacheZahlenfrage extends AbstrakteZahlenfrage {

    public EinfacheZahlenfrage(String frage, int punkte, int richtigeAntwort) {
        super(frage, punkte);
        this.loesung = richtigeAntwort;
    }  
}
