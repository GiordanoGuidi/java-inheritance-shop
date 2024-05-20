package org.learning;

import java.util.Arrays;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cartLength;
        System.out.println("Quanti articoli ci sono nel carrello?");
        cartLength=Integer.parseInt(scanner.nextLine());
        Prodotto[] cart = new Prodotto[cartLength];
        System.out.println(Arrays.toString(cart));
        for (int i = 0; i < cart.length;i++){
            System.out.println("Stai inserendo uno Smartphone, un Televisore o Cuffie?");
            String product = (scanner.nextLine());
            if (product.equals("Smartphone")){
                System.out.println("Nome dello Smartphone");
                String name = (scanner.nextLine());
                System.out.println("Descrizione dello Smartphone");
                String description = (scanner.nextLine());
                System.out.println("Prezzo dello Smartphone");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Percentuale dell'iva");
                double vat =Double.parseDouble(scanner.nextLine());
                System.out.println("Codice IMEI");
                int imeiCode = Integer.parseInt(scanner.nextLine());
                System.out.println("Memoria del Telefono");
                int memory = Integer.parseInt(scanner.nextLine());
                cart[i]= new Smartphone(name,description,price,vat,imeiCode,memory);
            } else if (product.equals("Televisore")) {
                
            }
        }
        System.out.println(Arrays.toString(cart));
    }
}
