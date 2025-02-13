// 2 - Um banco precisa de uma ferramenta para saber o nível de satisfação
// de atendimento do cliente ( de 0 a 5). Desenvolva uma solução computacional
// para resolver esta necessidade. Mostre mensagens coerentes com as validações dadas.

package com.agibank.semana2.s2switchcase02;

import java.util.Scanner;

public class atendimentoNivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor escolha o nivel de satisfação do atendimento\n (Escolha um número entre 0 a 5):");
        int nivel = sc.nextInt();

        switch (nivel) {

            case 0:
                System.out.print("O seu nível de satisfação foi 0, obrigado pela sua avaliação!");
                break;
            case 1:
                System.out.print("O seu nível de satisfação foi 1, obrigado pela sua avaliação!");
                break;
            case 2:
                System.out.print("O seu nível de satisfação foi 2, obrigado pela sua avaliação!");
                break;
            case 3:
                System.out.print("O seu nível de satisfação foi 3, obrigado pela sua avaliação!");
                break;
            case 4:
                System.out.print("O seu nível de satisfação foi 4, obrigado pela sua avaliação!");
                break;
            case 5:
                System.out.print("O seu nível de satisfação foi 5, obrigado pela sua avaliação!");
                break;
        }
    }
}
