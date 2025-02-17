// EX 4 - Crie um programa que veridique a situação de um aluno,
// atraves de sua nota final em uma disciplina.Aprovado : 6 ou acima;
// Exame: entre 4 (inclusive) e 6 (exclusivo). Reporvado : Abaixo de 4.

package com.agibank.semana2.elseif.elseif05;
import java.util.Scanner;

public class aluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Digite a sua nota: ");
        double nota = scanner.nextDouble();

        if(nota >=6) {
            System.out.println("O aluno está aprovado");
        } else if (nota <6 && nota >=4) {
            System.out.println("O aluno está de recuperação");
        }
        else {
            System.out.println("O aluno está reprovado");
        }

    }
}