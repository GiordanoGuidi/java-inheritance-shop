package org.learning;

public class Smartphone extends Prodotto {
    private int imeiCode;
    private int memory;
    public Smartphone(String name, String description, double price, double vat,int imeiCode,int memory) {
        super(name, description, price, vat);
        this.imeiCode = imeiCode;
        this.memory = memory;
    }
}
