// Conversão de Moeda para Viagem:
// Um turista deseja converter valores em reais para dólares ao longo de 7 dias de viagem.
// O programa deve:
// 1. Criar um vetor com os valores gastos em reais por dia.
// 2. Converter cada valor para dólares usando uma taxa fixa informada pelo usuário.
// Entrada:
//         Um vetor de 7 valores (gastos diários em reais).
//         Uma taxa de câmbio (float).
// Saída:
//         Vetor com 7 valores convertidos para dólares

package com.agibank.semana4.debug05;

public class moedaviagem {

    public static void main(String[] args) {
        double[] gastosReais = {2000.0, 1500.0, 1800.0, 1200.0, 250.0, 920.0, 500.0};
        float taxaCambio = 5.0f;

        double[] gastosDolares = new double[7];
        for (int i = 0; i < 7; i++) {
            gastosDolares[i] = gastosReais[i] / taxaCambio;
        }

        System.out.println("Valores convertidos para dólares:");
        for (int i = 0; i < 7; i++) {
            System.out.printf("Dia %d: $%.2f USD\n", (i + 1), gastosDolares[i]);
        }
    }
}


