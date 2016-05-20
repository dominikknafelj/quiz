/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author Dominik Knafelj <d.knafelj@gmail.com>
 */
 class Quiz {
    // Anzahl der Quizfragen
    private int fragenAnzahl=0;
    // ArrayList mit Zahlenfragen
    private List<Zahlenfrage> fragen = new ArrayList<Zahlenfrage>(); 
    /**
     * Konstruktor
     * @param fragenAnzahl Anzahl der Fragen
     */
    public Quiz(int fragenAnzahl){
        this.fragenAnzahl = fragenAnzahl;

    }
    
    /**
     * Methode zum Hinzufuegen einer Zahl.
     * @param f Zahlenfrage instanz
     * @return boolscher Wert, der angibt, ob die Zahlenfrage zur ArrayList hinzugefuegt wurde.
     */
    public boolean fuegeFrageHinzu(Zahlenfrage f){
        // Wenn die Groesse der ArrayList mindestens die fragenAnzahl erreicht hat oder f gleich null ist
        if(this.fragen.size() >= this.fragenAnzahl || f == null){
            // gebe false zurueck
            return false;
        } else{
            //fuege f zur Liste hinzu
            this.fragen.add(f);
            // gebe true zurueck
            return true;
        }
    }
    
    /**
     * Berechnet die Summe der erreichten Punkte aller Fragen
     * @return integer Summe
     */
    public int berechneErreichtePunkte(){
        int summe=0;
        // Summiere alle erreichten Punkte zusammen
        summe = this.fragen.stream().map((frage) -> frage.liefereErreichtePunkte()).reduce(summe, Integer::sum);
        return summe;
    }
        /**
     * Berechnet die Summe der maximal erreichbaren Punkte aller Fragen
     * @return integer Summe
     */
    public int berechneMaximalMoeglichePunkte(){
        int summe=0;
        // Summiere alle erreichbaren Punkte zusammen
        summe = this.fragen.stream().map((frage) -> frage.liefereMoeglichePunkte()).reduce(summe, Integer::sum);
        return summe;
    }
    
    /**
     * Gibt die Fragestellung der Frage an einem bestimmten Index zurueck
     * @param index Indexwert einer Fage
     * @return 
     */
    public Zahlenfrage liefereFrage(int index){
        try{
            return this.fragen.get(index);
        }catch(IndexOutOfBoundsException e){
            return null;
        }
    }
    
    /**
     * Gebe die tatsächliche Anzahl der Fragen zurueck.
     * @return Anzahl der Fragen
     */
    public int liefereFragenAnzahl(){
        return this.fragen.size();
    }
    
    
}
