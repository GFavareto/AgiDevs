//Implemente um metodo chamado calcularCorrelacao() que recebe duas series de preços de ativos
//e calcula a correlação entre elas. A formula da correlação é: Cor= Cov(X,Y)/oX.oY
//SAIDA: Correlação: 1.0

package com.agibank.semana4.metodos09;

public class correlacao {
    public static double calcularCorrelacao(double[] serie1, double[] serie2) {
        int n = serie1.length;
        double X = 0.0;
        double Y = 0.0;
        double XY = 0.0;
        double varX = 0.0;
        double varY = 0.0;

        for (int i = 0; i < n; i++) {
            X += serie1[i];
            Y += serie2[i];
        }
        X /= n;
        Y /= n;

        for (int i = 0; i < n; i++) {
            double difX = serie1[i] - X;
            double difY = serie2[i] - Y;
            XY += difX * difY;
            varX += difX * difX;
            varY += difY * difY;
        }
        return XY / (Math.sqrt(varX) * Math.sqrt(varY));
    }

    public static void main(String[] args) {
        double[] serie1 = {100.0, 102.0, 104.0, 106.0};
        double[] serie2 = {50.0, 51.0, 52.0, 53.0};

        double correlacao = calcularCorrelacao(serie1, serie2);
        System.out.printf("Correlação: %.1f%n", correlacao);
    }
}
