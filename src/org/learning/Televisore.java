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

    /*Sovrascrivo il metodo per calcolare il
    prezzo per i posssessori dell carta fedeltà*/
    @Override
    public double getPriceWithLoyaltyCard( boolean loyaltyCard){
        /*Assegno alla variabile il valore ritornato dal metodo
         della superclasse
         */
        double discountedPrice = super.getPriceWithLoyaltyCard(loyaltyCard);
        /*Se lo smartphone ha una memoria inferiore a 32gb faccio
         uno sconto maggiore
         */
        if (!smart){
            double discount = price * 0.10;
            discountedPrice  = price - discount;
        }
        return discountedPrice;
    }
}
