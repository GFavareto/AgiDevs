// Crie um metodo chamado compararAtivos() que recebe os retornos
//medios de dois ativos financeiros e retorna o nome do ativo com maior retorno.
//ENTRADA: Ativo 1: 5.0% Ativo 2: 4.5%
//SAIDA: O ativo com maior retorno é: Ativo 1

package com.agibank.semana4.metodos.metodos05;

public class comparar {
    public static String compararAtivos(double ativo1, double ativo2) {
        if (ativo1 > ativo2) {
            return "Ativo 1 tem o maior retorno";
        } else if (ativo2 > ativo1) {
            return "Ativo 2 tem o maior retorno";
        } else
            return "Os ativos tem o mesmo retorno";
    }
    public static void main(String[] args) {
        double ativo1 = 5.0;
        double ativo2 = 4.5;
        System.out.println(compararAtivos(ativo1, ativo2));
    }
}
