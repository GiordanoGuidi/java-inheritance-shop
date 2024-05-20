package org.learning;

public class Smartphone extends Prodotto {
    protected int imeiCode;
    protected int memory;
    public Smartphone(String name, String description, double price, double vat,int imeiCode,int memory) {
        super(name, description, price, vat);
        this.imeiCode = imeiCode;
        this.memory = memory;
    }

    //Sovrascrivo il metodo toString(
    @Override
    public String toString(){
        return super.toString() + ", imeiCode=" + imeiCode + ", memory=" + memory;
    }
}
