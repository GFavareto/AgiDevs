// 1 - Um cliente deseja escolher o tipo de investimento a ser feito:
// CDB, CDI, Tesouro DIreto, FII. Faça um programa em Java
// que permita ao usuário fazer esta escolha. Dê mensagem de acordo com o investimento escolhido.

package com.agibank.semana2.switchcase.switchcase01;

import java.util.Scanner;

public class investimentoTipo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(" 1 - CDB\n 2 - CDI\n 3 - Tesouro Direto\n 4 - FII\n Escolha o tipo de investimento:");
            String investimento = sc.next();

            switch (investimento) {

                case "CDB":
                    System.out.print("Esse foi seu investimento selecionado foi o CDB");
                    break;
                case "CDI":
                    System.out.print("Esse foi seu investimento selecionado foi o CDI");
                    break;
                case "Tesouro Direto":
                    System.out.print("Esse foi seu investimento selecionado foi o Tesouro Direto");
                    break;
                case "FII":
                    System.out.print("Esse foi seu investimento selecionado foi o FII");
                    break;
            }
    }
}
