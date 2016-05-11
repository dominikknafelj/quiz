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
    private int fragenAnzahl=0;
    private List<Zahlenfrage> fragen = new ArrayList<Zahlenfrage>(); 
    public Quiz(int fragenAnzahl){
        this.fragenAnzahl = fragenAnzahl;

    }
    public boolean fuegeFrageHinzu(Zahlenfrage f){
        if(this.fragen.size() >= this.fragenAnzahl || f == null){
            return false;
        } else{
            this.fragen.add(f);
            return true;
        }
    }
    
    public int berechneErreichtePunkte(){
        int summe=0;
        for(Zahlenfrage frage: this.fragen){
            summe+= frage.liefereErreichtePunkte();
        }
        return summe;
    }
    
    public int berechneMaximalMoeglichePunkte(){
        int summe=0;
        for(Zahlenfrage frage: this.fragen){
            summe+= frage.liefereMoeglichePunkte();
        }
        return summe;
    }
    
    public Zahlenfrage liefereFrage(int index){
        try{
            return this.fragen.get(index);
        }catch(IndexOutOfBoundsException e){
            return null;
        }
    }
    
    public int liefereFragenAnzahl(){
        return this.fragen.size();
    }
    
    
}
