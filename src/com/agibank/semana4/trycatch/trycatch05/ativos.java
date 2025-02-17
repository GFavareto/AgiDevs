//Comparação de Portfólios de Investimentos: Crie uma matriz 3x3, onde cada inha representa um portfólio e cada coluna representa um ativo financelro.
//• O programa deve calcular a média dos retornos de cada portiólio.
//• Se um valor for inválido (não numérico), capture NumberFormatException.
//        • Se um portfólio estiver incompleto, capture ArrayIndexOutOfBounds Exception.
//Exemplo de Entrada:
//Portfólios:
//        {0.05, 0.08, "A")
//        {0.07, 0.06, 0.09}
//        {0.02, 0.03, 0.04}
//Saída Esperada:
// ERROR: Valor invalido encontrado na celula [0],[2]

package com.agibank.semana4.trycatch.trycatch05;

public class ativos {

    public static void main(String[] args) {
        Object[][] portfolios = {
                {0.05, 0.08, "A"},
                {0.07, 0.06, 0.09},
                {0.02, 0.03, 0.04}
        };

        try {
            for (int i = 0; i < portfolios.length; i++) {
                double soma = 0.0;
                int somatoria = 0;

                for (int j = 0; j < portfolios[i].length; j++) {
                    try {
                        double valor = Double.parseDouble(portfolios[i][j].toString());
                        soma += valor;
                        somatoria++;
                    } catch (NumberFormatException e) {
                        System.out.printf("ERROR: Valor invalido encontrado na celula [%d][%d]%n", i, j);
                        return;
                    }
                }
                double media = soma / somatoria;
                System.out.printf("Média do Portfólio %d: %.2f%n", i + 1, media);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ERROR: Portfólio incompleto ou inválido!");
        }
    }
}
