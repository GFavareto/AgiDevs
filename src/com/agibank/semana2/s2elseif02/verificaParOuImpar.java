// EX 2 - Crie um programa que verifica se o numero digitado pelo usuario
// é par ou impar.

package com.agibank.semana2.s2elseif02;
import java.util.Scanner;

public class verificaParOuImpar {
    public static void main(String[] args) {

        int numero;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número:");
        numero = sc.nextInt();
        if(numero % 2 == 0) {
            System.out.println("O Número " + numero + " é par");
        }
        else {
            System.out.println("O Número " + numero + " é impar");
        }
    }
}

