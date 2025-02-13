// Faça um programa que calcule o fatorial de qualquer numero digitado polo usuario,
//sabendo que o fatorial de um numero é o produtorio dos numeros inteiros entre 1 e ele mesmo.

package com.agibank.semana2.s2repeticao04;
import java.util.Scanner;

public class fatorialNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        long fatorial;

        System.out.print("Digite um número para calcular o fatorial: ");
        numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("O fatorial não é definido para números negativos.");
        } else {
            fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
        scanner.close();
    }
}
