// EX 1 - Crie um programa que verifica se o numero digitado pelo usuario
// é positivo, negativo ou zero.

package com.agibank.semana2.s2elseif01;
import java.util.Scanner;

public class verificaNumero {
    public static void main(String[] args) {

        int numero;

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número:");
        numero = sc.nextInt();
        if(numero <0) {
            System.out.println("Numero é negativo");
        } else if(numero == 0){
            System.out.println("Numero é 0");
        }
        else {
            System.out.println("Múmero é positivo");
        }
    }
}

