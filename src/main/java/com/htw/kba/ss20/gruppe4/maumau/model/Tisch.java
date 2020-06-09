package com.htw.kba.ss20.gruppe4.maumau.model;


import java.util.ArrayList;

public class Tisch {

    private ArrayList <Spieler> spielerList;
    private ArrayList <Karte> kartenDeck;
    private ArrayList <Karte> ablageStapel;

    public Tisch(ArrayList<Spieler> spielerList, ArrayList<Karte> kartenDeck, ArrayList<Karte> ablageStapel) {
        this.spielerList = spielerList;
        this.kartenDeck = kartenDeck;
        this.ablageStapel = ablageStapel;
    }

    public Tisch(ArrayList<Spieler> spielerList, ArrayList<Karte> kartenDeck) {
        this.spielerList = spielerList;
        this.kartenDeck = kartenDeck;
    }

    public ArrayList<Spieler> getSpielerList() {
        return spielerList;
    }

    public void setSpielerList(ArrayList<Spieler> spielerList) {
        this.spielerList = spielerList;
    }

    public ArrayList<Karte> getKartenDeck() {
        return kartenDeck;
    }

    public void setKartenDeck(ArrayList<Karte> kartenDeck) {
        this.kartenDeck = kartenDeck;
    }

    public ArrayList<Karte> getAblageStapel() {
        return ablageStapel;
    }

    public void setAblageStapel(ArrayList<Karte> ablageStapel) {
        this.ablageStapel = ablageStapel;
    }
}
