package com.htw.kba.ss20.gruppe4.maumau.model;


public class Spieler {

    private String name;
    private int position;
    private Hand hand;

    public Spieler(String name, int position, Hand hand) {
        this.name = name;
        this.position = position;
        this.hand = hand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }
}
