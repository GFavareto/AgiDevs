// NOTA: 100
// Nome do Dev: Gabriel Rufino Favareto
// Nome do tester: Heitor Santos Delvecchi

package com.agibank.semana4.maratona;

public class maratonasemana04 {
    public static void main(String[] args) {
        String[] ativos = {"PETR4", "VALE3", "ITUB4"};
        double[][] precos = {
                {22.5, 23.0, 22.0, 24.5, 25.0},
                {85.0, 86.5, 84.0, 83.5, 87.0},
                {30.0, 29.5, 30.5, 31.0, 32.5}
        };

        System.out.println("Média de preços:");
        for (int i = 0; i < ativos.length; i++) {
            System.out.println(ativos[i] + ": " + mediaPrecos(i, precos));
        }

        String valorizacao = maiorValorizacao(ativos, precos);
        System.out.println("\nAtivo com maior valorização: " + valorizacao);

        System.out.println("\nLucro e perda de cada ativo:");
        for (int i = 0; i < ativos.length; i++) {
            System.out.println(ativos[i] + ": " + simularLucroPerda(i, precos));
        }

        int indiceAtivoConsulta = 1;
        int diaConsulta = 3;
        System.out.println("\nConsulta do preço do ativo " + ativos[indiceAtivoConsulta] + " no dia " + diaConsulta + " : " + consultarPreco(indiceAtivoConsulta, diaConsulta, precos));
    }

    public static double mediaPrecos(int index, double[][] precos) {
        double soma = 0;
        for (double preco : precos[index]) {                    //20 pontos
            soma += preco;
        }
        return soma / precos[index].length;
    }

    public static String maiorValorizacao(String[] ativos, double[][] precos) {
        String ativoMaior = "";
        double maiorCrescimento = 0;
        for (int i = 0; i < ativos.length; i++) {
            double inicial = precos[i][0];
            double finalPreco = precos[i][precos[i].length - 1];                //20
            double crescimento = ((finalPreco - inicial) / inicial) * 100;
            if (crescimento > maiorCrescimento) {
                maiorCrescimento = crescimento;
                ativoMaior = ativos[i] + " (de " + inicial + " para " + finalPreco + ", crescimento de " + String.format("%.2f", crescimento) + "%)";
            }
        }
        return ativoMaior;
    }

    public static String simularLucroPerda(int index, double[][] precos) {
        double inicial = precos[index][0];
        double finalPreco = precos[index][precos[index].length - 1];                                    //20
        double variacao = ((finalPreco - inicial) / inicial) * 100;
        return (variacao >= 0 ? "Lucro" : "Prejuízo") + " (" + String.format("%.2f", variacao) + "%)";
    }

    public static double consultarPreco(int index, int dia, double[][] precos) {
        if (dia < 1 || dia > precos[index].length) {
            throw new IllegalArgumentException("ERRO: Dia inválido, por favor selecione entre os dias 1 a 5");      //40
        }
        return precos[index][dia - 1];
    }
}