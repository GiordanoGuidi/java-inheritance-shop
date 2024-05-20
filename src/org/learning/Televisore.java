package org.learning;

public class Televisore extends Prodotto{
    //ATTRIBUTI
    protected int size;
    protected boolean smart;
    //COSTRUTTORE
    public Televisore(String name, String description, double price, double vat,int size,boolean smart) {
        super(name, description, price, vat);
        this.size=size;
        this.smart=smart;
    }
    //Sovrascrivo il metodo toString(
    @Override
    public String toString(){
        return super.toString() + ", size=" + size + ", smart=" + smart +"]";
    }
}
