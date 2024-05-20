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



    }
}
