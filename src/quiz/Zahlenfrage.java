package quiz;

/**
 *
 * @author Dominik Knafelj <d.knafelj@gmail.com>
 */
/**
 * 
 * Interface laut Vorgabe
 */
interface Zahlenfrage {
    public boolean istBeantwortet();
    public boolean istRichtigBeantwortet();
    public void legeAntwortFest(int antwort);
    public int liefereErreichtePunkte();
    public String liefereFrage();
    public int liefereMoeglichePunkte();   
}
