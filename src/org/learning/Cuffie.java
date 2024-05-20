package org.learning;

public class Cuffie extends Prodotto{
    //ATTRIBUTI
    private String color;
    private boolean wireless;
    //COSTRUTTORE
    public Cuffie(String name, String description, double price, double vat,String color,boolean wireless) {
        super(name, description, price, vat);
        this.color = color;
        this.wireless = wireless;
    }

    //Sovrascrivo il metodo toString(
    @Override
    public String toString(){
        return super.toString() + ", color=" + color + ", wireless=" + wireless + "]";
    }
}
