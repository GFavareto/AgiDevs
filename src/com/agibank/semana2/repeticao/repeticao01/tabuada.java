// Implementar

package com.agibank.semana2.repeticao.repeticao01;

import java.util.Scanner;

public class tabuada {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Digite um número para saber a tabuada: ");
        num = sc.nextInt();
        for(int i = 1; i<=10; i++){
            System.out.printf("\n%d x %d = %d", num, i , num * i);
        }
    }

}
