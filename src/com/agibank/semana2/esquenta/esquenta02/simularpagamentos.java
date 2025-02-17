// O usuario tem uma divida e quer simular pagamentos mensais fixos.
// A cada mes, o salario da divida é reduzido pelo valor pago.
// O programa deve mostrar o saldo atualizado a cada mes até
// a divida ser quitada.

package com.agibank.semana2.esquenta.esquenta02;
import java.util.Scanner;

public class simularpagamentos {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int mes =1;
            double saldo;
            double pagamento;

            System.out.print("Digite o valor da dívida: ");
            saldo = scanner.nextDouble();

            while (saldo > 0) {
                System.out.printf("Digite o valor do pagamento do mês %d: ", mes);
                pagamento = scanner.nextDouble();

                saldo -= pagamento;
                if (saldo > 0) {
                    System.out.printf("Mês %d: Saldo restante: R$ %.2f%n", mes, saldo);
                } else {
                    System.out.printf("Mês %d: Dívida quitada!%n", mes);
                }
                mes++;
            }
            scanner.close();
        } // top demais ficou clean tbm
    }

