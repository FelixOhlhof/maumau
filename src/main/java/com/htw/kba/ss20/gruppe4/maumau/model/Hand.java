package com.htw.kba.ss20.gruppe4.maumau.model;

import java.util.LinkedList;

public class Hand {
    private LinkedList<Karte> listeHand;

    public Hand(LinkedList<Karte> listeHand) {
        this.listeHand = listeHand;
    }

    public LinkedList<Karte> getListeHand() {
        return listeHand;
    }

    public void setListeHand(LinkedList<Karte> listeHand) {
        this.listeHand = listeHand;
    }
}
