package quiz;

/**
 *
 * @author Dominik Knafelj <d.knafelj@gmail.com>
 */
 class SchaetzFrage extends AbstrakteZahlenfrage {
    
    // Integer Attribut, das die prozentuale Toleranz angibt
    private int prozentualeAbweichung = 0;
    
    /**
     * Konstruktor
     * @param frage Fragestellung
     * @param punkte maximal erreichbare Punkte
     * @param richtigeAntwort integer Wert der richtigen Antwort
     * @param prozentualeAbweichung integer Wert der prozentualen Toleranz
     */
    public SchaetzFrage(String frage, int punkte, int richtigeAntwort, int prozentualeAbweichung) {
        super(frage, punkte);
        this.loesung = richtigeAntwort;
        this.prozentualeAbweichung = prozentualeAbweichung;
    }
    
    /**
     * Methode wird ueberschrieben
     * Unter Beachtung des prozentualen Toleranzwertes, wird bestimmt, ob die Frage richtig beantwortet wurde.
     * Die gegebene Antwort muss in einem offenen Interval von +/- des Prozentwertes liegen, damit die Frage als richtig
     * beantworted gilt.
     * @return 
     */
    @Override
    public boolean istRichtigBeantwortet(){
       double min = this.loesung * (double)(100 - this.prozentualeAbweichung) / 100; 
       double max = this.loesung * (double)(100 + this.prozentualeAbweichung) / 100;
       return (this.antwort >= min ) && (this.antwort <= max) && (this.istBeantwortet());
    }
    
}
