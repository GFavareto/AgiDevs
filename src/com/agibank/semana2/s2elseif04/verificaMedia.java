// EX 4 - Crie um programa que verifique o quanto um valor se aproxima da média,
// em percentual, Entre com o valor e a média.

package com.agibank.semana2.s2elseif04;
import java.util.Scanner;

    public class verificaMedia {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double gasto;
            double totalGasto = 0;

            while (true) {
                System.out.print("Digite um gasto: ");
                gasto = scanner.nextDouble();

                if (gasto < 0) {
                    break;
                }
                totalGasto += gasto;
                if (totalGasto > 5000) {
                    System.out.println("Alerta: seus gastos ultrapassaram R$ 5000!");
                }
            }
            System.out.printf("Total gasto: R$ %.2f%n", totalGasto);
            scanner.close();
        }
    }
