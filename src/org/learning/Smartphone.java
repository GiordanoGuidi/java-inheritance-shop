package org.learning;

public class Smartphone extends Prodotto {
    //ATTRIBUTI
    protected int imeiCode;
    protected int memory;
    //COSTRUTTORE
    public Smartphone(String name, String description, double price, double vat,int imeiCode,int memory) {
        super(name, description, price, vat);
        this.imeiCode = imeiCode;
        this.memory = memory;
    }

    //Sovrascrivo il metodo toString(
    @Override
    public String toString(){
        return super.toString() + ", imeiCode=" + imeiCode + ", memory=" + memory + "]";
    }

    @Override
    public double getPriceWithLoyaltyCard( boolean loyaltyCard){
        /*Assegno alla variabile il valore ritornato dal metodo
         della superclasse
         */
        /*Se lo smartphone ha una memoria inferiore a 32gb faccio
         uno sconto maggiore
         */
        double discountedPrice = price;
        if (memory < 32){
            double discount = price * 0.05;
            discountedPrice  = price - discount;
        }else {
            double discount = price * 0.02;
            discountedPrice = price - discount;
        }
        return discountedPrice;
    }
}
