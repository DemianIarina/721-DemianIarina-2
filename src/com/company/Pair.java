package com.company;

public class Pair {
    private Bestellung bestellung;
    private int sum;

    public Pair(Bestellung bestellung, int sum) {
        this.bestellung = bestellung;
        this.sum = sum;
    }

    public Bestellung getBestellung() {
        return bestellung;
    }

    public void setBestellung(Bestellung bestellung) {
        this.bestellung = bestellung;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
