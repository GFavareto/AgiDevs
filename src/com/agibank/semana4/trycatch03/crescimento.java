// Validação de Planilha de Riscos: Crie um programa para validar uma planilha financeira de riscos
// representada por uma matriz 5%5 com valores de risco entre 0 e 1.
//        • Se a matriz estiver incompleta, trate AmayInderOutOfBoundsFaception.
// Exemplo de Entrada:
// Matriz de Riscos:
//        {0.2, 0.5, 1.1, 0.4, 0.3}
//        {0.7, 0.9, 0.1, 0.6, 0.8}
// Saída Esperada:
// Erro: Valor inválido encontrado na célula [0][2]:1.1


package com.agibank.semana4.trycatch03;

public class crescimento {

    public static void main(String[] args) {
        double[][] matrizRiscos = {
                {0.2, 0.5, 1.1, 0.4, 0.3},
                {0.7, 0.9, 0.1, 0.6, 0.8},
                {0.3, 0.4, 0.5, 0.8, 0.2},
                {0.6, 0.2, 0.9, 0.7, 0.4},
                {0.5, 0.8, 0.6, 0.3, 0.9}
        };

        try {
            for (int i = 0; i < matrizRiscos.length; i++) {
                for (int j = 0; j < matrizRiscos[i].length; j++) {

                    double valor = matrizRiscos[i][j];
                    if (valor < 0 || valor > 1) {
                        System.out.printf("Erro: Valor inválido encontrado na célula [%d][%d]:%.1f\n", i, j, valor);
                        return;
                    }
                }
            }
            System.out.println("A planilha de riscos está válida.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: A matriz está incompleta ou inválida!");
        }
    }
}