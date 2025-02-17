//Calcule a expressão, sem utilizar a função pow() da math.h: XY
//Onde: X e Y são digitados pelo usuário

package com.agibank.semana2.repeticao.repeticao03;

import java.util.Scanner;

public class expressao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de X: ");
        int X = scanner.nextInt();

        System.out.print("Digite o valor de Y: ");
        int Y = scanner.nextInt();
        int resultado = 1;
        for (int i = 1; i <= Y; i++) {
            resultado *= X;
        }
        System.out.println(X + " elevado a " + Y + " é: " + resultado);
        scanner.close();
    }
}



