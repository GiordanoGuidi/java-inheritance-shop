package org.learning;

public class Televisori extends Prodotto{

    int size;
    boolean smart;
    public Televisori(String name, String description, double price, double vat,int size,boolean smart) {
        super(name, description, price, vat);
        this.size=size;
        this.smart=smart;
    }
}
