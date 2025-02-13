// Crie um metodo chamado simularCarteira() que recebe um array
// com os valores iniciais 3 ativos financeiros e os retornos medios esperados
// para cada ativo. O metodo deve calcular o valor final da carteira apos 1 ano.
// Entrada: valores iniciais {1000.0, 2000.0, 1500.0}
// Retornos: {0.05, 0.03, 0.04}
// SAIDA: Valor final da carteira: 4825.0

package com.agibank.semana4.metodos07;

public class carteira {
    public static double simularCarteira(double[] valoresIniciais, double[] retornos) {
        double valorFinal = 0.0;

        for (int i = 0; i < valoresIniciais.length; i++) {
            valorFinal += valoresIniciais[i] * (1 + retornos[i]);
        }
        return valorFinal;
    }

    public static void main(String[] args) {
        double[] valoresIniciais = {1000.0, 2000.0, 1500.0};
        double[] retornos = {0.05, 0.03, 0.04};

        double resultado = simularCarteira(valoresIniciais, retornos);
        System.out.println("Valor final da carteira: " + resultado);
    }
}