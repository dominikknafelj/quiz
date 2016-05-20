package quiz;

/**
 *
 * @author Dominik Knafelj <d.knafelj@gmail.com>
 */
 class EinfacheZahlenfrage extends AbstrakteZahlenfrage {

    /**
     * Konstruktor
     * @param frage Fragestellung
     * @param punkte maximal erreichbare Punkte
     * @param richtigeAntwort integer Wert der richtigen Antwort
     */
    public EinfacheZahlenfrage(String frage, int punkte, int richtigeAntwort) {
        super(frage, punkte);
        this.loesung = richtigeAntwort;
    }  
}
