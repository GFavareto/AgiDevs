// Implemente um metodo chamado calcularVolatilidade() que rcebe um array de retornos diarios
// de uma ação e retorna o desvio padrao dos retornos.
//ENTRADA: Retornos: {0.01, 0.02, -0.01, 0.03, -0.02}
//SAIDA: Volatilidade: 0.018

package com.agibank.semana4.metodos06;

public class volatilidade {
    public static double calcularVolatilidade(double[] retornos) {

        int n = retornos.length;
        double soma = 0;
        double somaQuadrados = 0;
        double media = soma / n;

        for (double retorno : retornos) {
            soma += retorno;
        }
        for (double retorno : retornos) {
            somaQuadrados += Math.pow(retorno - media, 2);
        }
        return Math.sqrt(somaQuadrados / n);
    }

    public static void main(String[] args) {
        double[] retornos = {0.01, 0.02, -0.01, 0.03, -0.02};
        System.out.printf("Volatilidade: %.3f%n", calcularVolatilidade(retornos));
    }
}