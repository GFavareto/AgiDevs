//O usuario informa seus gastos mensais um por um. O programa soma os valores
// e para quando um gasto negativo for digitado. Se o total ultrapassar
// R$ 5000, o programa exibe um alerta.
// Exemplo de execução:
// Digite um gasto:1200
//Digite um gasto: 2300
//Digite um gasto: 1800
//Alerta: seus gastos ultrapassaram R$5000!
//Digite um gasto: -1
//Total gasto: R$ 5300.00

package com.agibank.semana2.s2esquenta01;
import java.util.Scanner;

public class gastosmensais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double gasto;
        double gastoTotal = 0;

        while (true){
            System.out.print("Digite um gasto: ");
        gasto = sc.nextDouble();

        if (gasto < 0) {
            break;
        }
        gastoTotal += gasto;

        if (gastoTotal > 5000) {
            System.out.println("Seus gastos ultrapassaram R$5000");
        }
    }
    System.out.printf("Total gasto: %.2f%%", gastoTotal);
    sc.close();
 } // cumpriu o que pedia no exercicio, top clean
}
