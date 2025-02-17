//Faça um programa que calcule e motrste o quadro de um número N intero positivo,
//digitado pelo usúario. O cálculo deve ser feito através dasoma dos N primeiros
// números ímpares. Ex: se N=3 o programa calculará 1+3+5=9, que é o quadrado de 3.

package com.agibank.semana2.repeticao.repeticao02;

import java.util.Scanner;

public class numerointeiro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int Num = sc.nextInt();

        if (Num <=0) {
            System.out.print("O número deve ser inteiro positivo");

        } else {
            int soma = 0;
            int impar = 1;

            for (int i = 0; i<Num; i++) {
                soma += impar;
                impar = 2;
            }

            System.out.println("O quaradro de " + Num + " é " + soma);

            sc.close();
        }
    }
}
