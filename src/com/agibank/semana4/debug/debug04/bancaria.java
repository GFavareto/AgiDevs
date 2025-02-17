// Matriz de Transações Bancárias: Um banco acompanha 3 clientes e suas 5 transações mais recentes. O saldo inicial de cada cliente é de 1000 reais. Crie uma matriz 3x5 e preencha com os valores das transações. Depois, para cada cliente, calcule e exiba:
//        1. O total movimentado.
// 2. O saldo final, considerando que cada cliente começou com 1000.0 na conta.
// Exemplo de Entrada:valores das transações (podem ser positivos ou negativos)
//          100-50 200 -30 50
//        -100 -200 50 100 150
//        300-100-50 -150 200
// Saída Esperada:
// Cliente 1: Total Movimentado = 270.00 | Saldo Final = 1270.00
// Cliente 2: Total Movimentado = 0.00 | Saldo Final = 1000.00
// Cliente 3: Total Movimentado = 200.00 | Saldo Final = 1200.00

package com.agibank.semana4.debug.debug04;

public class bancaria {

    public static void main(String[] args) {
        double[][] transacoes = {
                {100, -50, 200, -30, 50},
                {-100, -200, 50, 100, 150},
                {300, -100, -50, -150, 200}
        };

        double saldoInicial = 1000.0;

        for (int i = 0; i < transacoes.length; i++) {
            double totalMovimentado = 0.0;
            double saldoFinal = saldoInicial;

            for (int j = 0; j < transacoes[i].length; j++) {
                totalMovimentado += Math.abs(transacoes[i][j]);
                saldoFinal += transacoes[i][j];
            }
            System.out.printf("Cliente %d:\n Total Movimentado = R$ %.2f \n Saldo Final = R$ %.2f\n", i + 1, totalMovimentado, saldoFinal);
        }
    }
}


