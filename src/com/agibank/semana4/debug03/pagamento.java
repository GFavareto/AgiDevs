// Dado um valor de empréstimo e uma quantidade de parcelas,
// o programa deve calcular o valor de cada parcela e armazenar os resultados em um vetor.
// Fórmula (parcela fixa sem juros): Parcela=Valor total / Numero de parcelas
// Exemplo de Entrada:Valor do empréstimo = 1000.0
// Saída Esperada:Valores das parcelas = {250.00 250.00 250.00 250.00}

package com.agibank.semana4.debug03;

public class pagamento {

    public static void main(String[] args) {
        double valor = 1000.0;
        int numeroParcelas = 4;

        double parcela = valor / numeroParcelas;

        double[] parcelas = new double[numeroParcelas];

        for (int i = 0; i < numeroParcelas; i++) {
            parcelas[i] = parcela;
        }

        for (double p : parcelas) {
            System.out.printf("%.2f ", p);
        }
    }
}

