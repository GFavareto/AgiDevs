// EX 3 - Crie um programa em java que
// mostre a situação de um atleta de acordo com seu IMC.

package com.agibank.semana2.s2elseif03;
import java.util.Scanner;

public class atletaImc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite a altura: ");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("O IMC do atleta é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("O atleta está abaixo do peso.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("O atleta está com o peso normal.");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("O atleta está com Sobrepeso.");
        } else {
            System.out.println("O atleta está com Obesidade.");
        }

        scanner.close();
    }
}

