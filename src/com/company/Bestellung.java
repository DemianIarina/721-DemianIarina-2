package com.company;

import java.util.List;

public class Bestellung {
    private int bestellNr;
    private String adresse;
    private List<Produkt> produkte;

    public Bestellung() {
    }

    public Bestellung(int bestellNr, String adresse, List<Produkt> produkte) {
        this.bestellNr = bestellNr;
        this.adresse = adresse;
        this.produkte = produkte;
    }

    public int getBestellNr() {
        return bestellNr;
    }

    public void setBestellNr(int bestellNr) {
        this.bestellNr = bestellNr;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public List<Produkt> getProdukte() {
        return produkte;
    }

    public void setProdukte(List<Produkt> produkte) {
        this.produkte = produkte;
    }

    @Override
    public String toString() {
        return "Bestellung{" +
                "bestellNr=" + bestellNr +
                ", adresse='" + adresse + '\'' +
                ", produkte=" + produkte +
                '}';
    }
}
