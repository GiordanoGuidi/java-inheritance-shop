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

    /*Sovrascrivo il metodo per calcolare il
    prezzo per i posssessori dell carta fedeltà*/
    @Override
    public double getPriceWithLoyaltyCard( boolean loyaltyCard){
        /*Assegno alla variabile il valore ritornato dal metodo
         della superclasse
         */
        double discountedPrice = super.getPriceWithLoyaltyCard(loyaltyCard);
        /*Se le cuffie sono cablate applico uno sconto maggiore
         */
        if (!wireless){
            double discount = price * 0.07;
            discountedPrice  = price - discount;
        }
        return discountedPrice;
    }
}
