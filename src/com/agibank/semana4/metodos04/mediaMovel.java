//Implemente um metodo chamado calcularMediaMovel1()
// que recebe um array de preços de uma ação e um intervalo de tempo n.
// O metodo deve calcular a media movel para o intervalo dado.
// Entrada: Preços: {100.0, 102.0, 103.0, 105.0}
// Intervalo: 3
// Saida: Media movel: 101.0, 102.0, 103.0.

package com.agibank.semana4.metodos04;
import java.util.Arrays;

public class mediaMovel {
    public static void calcularMediaMovel(double[] precos, int n) {
        if (n > precos.length || n <= 0) {
            System.out.println("Inválido.");
            return;
        }
        double[] medias = new double[precos.length - n + 1];

        for (int i = 0; i <= precos.length - n; i++) {
            double soma = 0;
            for (int j = 0; j < n; j++) {
                soma += precos[i + j];
            }
            medias[i] = soma / n;
        }
        System.out.println("Média móvel: " + Arrays.toString(medias).replace("[", "").replace("]", ""));
    }
    public static void main(String[] args) {
        double[] precos = {100.0, 102.0, 101.0, 103.0, 105.0};
        int intervalo = 4;

        calcularMediaMovel(precos, intervalo);
    }
}
