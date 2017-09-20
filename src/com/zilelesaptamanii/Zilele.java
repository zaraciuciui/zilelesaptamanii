package com.zilelesaptamanii;

import java.util.Scanner;

/**
 * Created by prettyme on 19/07/2017.
 */
public class Zilele {
    public static void main(String[] args) {
        System.out.println("Scrieti un numar intre 1 si 7");
        Scanner scanner = new Scanner(System.in);
        int numar = scanner.nextInt();
        String ziua = "";
            switch (numar){
                case 1 :
                    System.out.println("Luni");
                    break;
                case 2 :
                    System.out.println("Marti");
                    break;
                case 3:
                    System.out.println("Miercuri");
                    break;
                case 4:
                    System.out.println("Joi");
                    break;
                case 5:
                    System.out.println("vineri");
                    break;
                case 6:
                    System.out.println("sambata");
                    break;
                case 7:
                    System.out.println("duminica");
                    break;

        }


    }
}
