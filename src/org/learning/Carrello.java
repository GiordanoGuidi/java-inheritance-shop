package org.learning;

import java.util.Arrays;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Variabile per la lunghezza dell'array
        int cartLength;
        System.out.println("Quanti articoli ci sono nel carrello?");
        cartLength=Integer.parseInt(scanner.nextLine());
        /*Dichiarazione dell'array di Prodotto con lunghezza
        uguale a cartLength*/
        Prodotto[] cart = new Prodotto[cartLength];
        /* Faccio un ciclo for fino a che la i non è
        minore alla lunghezza dell'array
         */
        for (int i = 0; i < cart.length;i++){
            /*Chiedo all'utente gli attributi comuni a
            a tutti gli oggetti
             */
            System.out.println("Stai inserendo uno Smartphone, un Televisore o Cuffie?");
            String product = (scanner.nextLine());
            System.out.println("Nome" + product);
            String name = (scanner.nextLine());
            System.out.println("Descrizione" + product);
            String description = (scanner.nextLine());
            System.out.println("Prezzo" + product);
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Percentuale dell'iva");
            double vat =Double.parseDouble(scanner.nextLine());
            /*Chiedo all'utente gli attributi specifici
            di ciascun oggetto
             */
            //Smartphone
            if (product.equals("Smartphone")){
                System.out.println("Codice IMEI");
                int imeiCode = Integer.parseInt(scanner.nextLine());
                System.out.println("Memoria del Telefono");
                int memory = Integer.parseInt(scanner.nextLine());
                cart[i]= new Smartphone(name,description,price,vat,imeiCode,memory);
            }
            //Televisori
            else if (product.equals("Televisore")) {
                System.out.println("Dimensioni");
                int size = Integer.parseInt(scanner.nextLine());
                System.out.println("E' una smart tv?");
                boolean smart =Boolean.parseBoolean(scanner.nextLine());
                cart[i]= new Televisore(name,description,price,vat,size,smart);
            }
            //Cuffie
            else if (product.equals("Cuffie")) {
                System.out.println("Colore");
                String color = (scanner.nextLine());
                System.out.println("Sono wireless?");
                boolean wireless =Boolean.parseBoolean(scanner.nextLine());
                cart[i]= new Cuffie(name,description,price,vat,color,wireless);
            }
        }
        //Stampo l'array
        System.out.println(Arrays.toString(cart));
    }
}
