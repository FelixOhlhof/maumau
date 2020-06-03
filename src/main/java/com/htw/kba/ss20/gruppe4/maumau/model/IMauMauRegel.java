package com.htw.kba.ss20.gruppe4.maumau.model;

public interface IMauMauRegel {

    /**
     * Prüft ob die Karte gespielt werden kann
     * @return
     */
    public boolean ckecktKarte(Karte gespielteKarte);

    /**
     *
     */
    public void spieltKarte();

    /**
     *
     */
    public void ziehtKarte();

    /**
     *
     */
    public void naechsterSpieler();

    /**
     *
     */
    public void ckecktKartenFunktion();

    /**
     *
     */
    public void farbeWuenschen();

    /**
     *
     */
    public void zweiKartenZiehen();

    /**
     *
     */
    public void aussetzen();

    /**
     * Checkt ob Mau "gesagt" wurde
     * @return
     */
    public boolean checktMau();

}
