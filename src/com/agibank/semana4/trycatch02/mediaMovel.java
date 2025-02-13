// Cálculo de Média Móvel de Ativos: Receba os preços de uma ação nos últimos 10 dias
// e calcule a média móvel de 3 dias.
// Se houver menos de 3 valores no vetor, lance uma exceção Ilegal ArgumentE reption.
// Capture e trate Number FormatException caso os preços sejam informados de forma incometa
// Fórmula da Média Móvel: MIM=Patua P asterior + P asterio | 3
// Exemplo de Entrada:
// Preços das ações: (100.0, 1020, 101.0, 103.0, 105.0]
// Saída Esperada:
// Média Móvel (dia 3): 101.0
// Média Móvel (dia 4): 102.0
// Pref Kerele R/a
// Média Móvel (dia 5): 103.0


package com.agibank.semana4.trycatch02;

public class mediaMovel {
    public static void main(String[] args) {
        double[] precos = {100.0, 102.0, 101.0, 103.0, 105.0, 107.0, 110.0, 108.0, 109.0, 111.0};

        try {
            if (precos.length < 3) {
                throw new IllegalArgumentException("É necessário pelo menos 3.");
            }

            System.out.println("Médias Móveis:");
            for (int i = 0; i <= precos.length - 3; i++) {
                double mediaMovel = (precos[i] + precos[i + 1] + precos[i + 2]) / 3;
                System.out.printf("Média Móvel (dia %d): %.2f\n", (i + 3), mediaMovel);
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
