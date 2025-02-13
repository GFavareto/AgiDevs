// A sequencia de Fibonacci segue a seguinte ordem:
// 0,1,1,2,3,5,8,13,21,34,55,89,...
// Repare que cada  termo é a somatoria de dois anteriores, sendo que os dois primeiros sao 0 e o 1.
// Faça um prgrama que receba um valor de usuario e imprima os termos da sequencia de
//Fibonacci menores que os valores digitados.

package com.agibank.semana2.s2repeticao05;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int valor;
        int prox;
        int a = 0, b = 1;

        System.out.print("Digite um valor para gerar os termos da sequência de Fibonacci: ");
        valor = scanner.nextInt();

        System.out.println("Termos da sequência de Fibonacci menores que " + valor + ":");
        while (a < valor) {
            System.out.print(a + " ");
            prox = a + b;
            a = b;
            b = prox;
        }
        scanner.close();
    }
}
