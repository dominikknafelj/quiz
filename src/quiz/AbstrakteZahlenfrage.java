package quiz;

/**
 *
 * @author Dominik Knafelj <d.knafelj@gmail.com>
 * 
 * Abstrakte Klasse mit grundlegender Logic
 */
 abstract class AbstrakteZahlenfrage implements Zahlenfrage {
    // maximale erreichbare Punktzahl
    private int maxPunkte = 0;
    // Fragestellung
    private String frage = null;
    // Aufloesung
    protected int loesung = 0;
    // vom Aktuer uebergeben Antwort
    protected int antwort = 0;
    // Flag ob die Antwort bereits beantwortet wurde
    protected boolean beantwortet = false;
    
    /**
     * Konstruktor
     * @param frage String mit der Fragestellung
     * @param punkte int-Wert der maximal erreichbaren Punkte
     */
    public AbstrakteZahlenfrage(String frage, int punkte){
        this.frage = frage;
        this.maxPunkte = punkte;
    }
    
    /**
     * Methode um die Frage zu beantworten
     * @param antwort int-Wert der gegebenen Antwort
     */
    public void legeAntwortFest(int antwort){
        this.beantwortet = true;
        this.antwort = antwort;
    }
    
    /**
     * Methode zur Punkteauswertung
     * @return gibt die maximale Punktzahl zurueck wenn die Frage richtig beantwortet wurde 
     */
    public int liefereErreichtePunkte(){
        return (this.istRichtigBeantwortet())? this.maxPunkte : 0;
    }
    
    /**
     * Getter Methode fuer die Fragestellung
     * @return Fragestellung
     */
    public String liefereFrage(){
        return this.frage;
    }
    /**
     * Getter Methode fuer die moegliche Punktzahl
     * @return Punktzahlwert
     */
    public int liefereMoeglichePunkte(){
        return this.maxPunkte;
    }
    
    /**
     * Methode zur Pruefung ob die Frage bereits beantwortet wurde
     * @return boolscher Wert ob die Frage beantwortet wurde
     */
    public boolean istBeantwortet() {
       return beantwortet;
    }

    /**
     * Diese Methode prueft, ob die Frage richtig beantwortet wurde.
     * @return boolscher Wert ob die Frage richtig beantwortet wurde.
     */
    public boolean istRichtigBeantwortet() {
       return ((this.antwort == this.loesung) && this.istBeantwortet());
    }

    
}
