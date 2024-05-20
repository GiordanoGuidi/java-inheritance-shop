package org.learning;

public class Cuffie extends Prodotto{
    private String color;
    private boolean wireless;
    public Cuffie(String name, String description, double price, double vat,String color,boolean wireless) {
        super(name, description, price, vat);
        this.color = color;
        this.wireless = wireless;
    }
}
