package org.learning;

public class Cuffie extends Prodotto{
    String color;
    boolean wireless;
    public Cuffie(String name, String description, double price, double vat,String color,boolean wireless) {
        super(name, description, price, vat);
        this.color = color;
        this.wireless = wireless;
    }
}
