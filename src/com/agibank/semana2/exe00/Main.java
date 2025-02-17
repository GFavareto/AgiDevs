package com.agibank.semana2.exe00;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int numero;

        Scanner s = new Scanner(System.in);
        System.out.print("Digite a sua idade:");
        numero = s.nextInt();
        if(numero>18) {
                System.out.println("Maior de idade");
         } else {
            System.out.println("Menor de idade");
        }
//        for (int i = 1; i <= 15; i++) {
//            System.out.println("i = " + i);
//        }
    }
}
