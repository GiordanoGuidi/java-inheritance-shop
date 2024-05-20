package org.learning;

public class Televisori extends Prodotto{

    private int size;
    private boolean smart;
    public Televisori(String name, String description, double price, double vat,int size,boolean smart) {
        super(name, description, price, vat);
        this.size=size;
        this.smart=smart;
    }
}
