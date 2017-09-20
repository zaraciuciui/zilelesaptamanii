package com.weekend;

import java.util.Scanner;

/**
 * Created by prettyme on 19/07/2017.
 */
public class Weekend {
    public static void main(String[] args) {
        System.out.println("Alege una dintre zile din saptamana");
        System.out.println("Luni");
        System.out.println("Marti");
        System.out.println("Miercuri");
        System.out.println("Joi");
        System.out.println("Vineri");
        System.out.println("Sambata");
        System.out.println("Duminica");
        Scanner scanner = new Scanner(System.in);
        String ziuasapta = scanner.next();
        switch (ziuasapta) {
            case "Luni":
                System.out.println("ii prima zi din saptamana");
                break;
            case "Marti":
                System.out.println("este a doua zi din saptamana");
                break;
            case "Miercuri":
                System.out.println("este a treia zi din saptamana");
                break;
            case "Joi":
                System.out.println("este a patra zi din saptamana");
                break;
            case "Vineri":
                System.out.println("este a cincea zi din saptamana");
                break;
                default:
                    System.out.println("mai incearca");
        }
        System.out.println("Da un nr");
        int parola = scanner.nextInt();
        if ( parola > 2){
            System.out.println("DA");
        }else {
            System.out.println("NU");
        }
    }
}

