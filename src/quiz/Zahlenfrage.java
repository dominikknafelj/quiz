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
interface Zahlenfrage {
    public boolean istBeantwortet();
    public boolean istRichtigBeantwortet();
    public void legeAntwortFest(int antwort);
    public int liefereErreichtePunkte();
    public String liefereFrage();
    public int liefereMoeglichePunkte();   
}
