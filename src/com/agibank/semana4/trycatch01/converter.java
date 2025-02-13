// Crie um programa que armazene os saldos de 10 contas bancárias em um vetor. O usuário deve poder buscar o saldo de uma conta pelo Indice do vetor.
// Se o usuário inserir um índice inválido, capture e trate ArrayIndexOutOfBoundsException.
// Exemplo de Entrada: Digite o indice da conta: 12
// Saída Esperada: Erro: Conta não encontrada!


package com.agibank.semana4.trycatch01;

import java.util.Scanner;

public class converter {

    public static void main(String[] args) {
        double[] saldos = {1000.0, 1500.0, 2000.0, 2500.0, 3000.0, 3500.0, 4000.0, 4500.0, 5000.0, 5500.0};
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o índice da conta: ");
            int indice = scanner.nextInt();

            System.out.printf("Saldo da conta %d: R$ %.2f\n", indice, saldos[indice]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Conta não encontrada!");
        }
        scanner.close();
    }
}

