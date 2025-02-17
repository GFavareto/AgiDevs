// Em uma loja, todos os clientes que comprarem mais de R$ 300,00 receberão um desconto
//proporcional ao valor de sua compra, de acordo com a tanela abaixo:
//Voê foi incumbido de fazer um programa que permita que o cliente entre com o valor dos
//produtos comprados e mostre o total da compra, o valor do desconto e o preço a pagar.
//Pergunte ao usuario se deseja terminar a digitação dos produtos e tambem se deseja finalizar o programa.

// TABELA: |VALOR DA COMPRA           | Desconto(%) |
//         |Até 500,00                | 5           |
//         |Até 501,00 a 1000,00      | 10          |
//         |Acima de 1000,00          | 12          |

package com.agibank.semana2.repeticao.repeticao06;

import java.util.Scanner;

public class valorProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String resposta;
        String finalizar;
        double valorProduto;
        double totalCompra = 0.0;
        double desconto;
        double valorDesconto;
        double valorAPagar;
        boolean continuarComprando = true;
        boolean maisClientes = true;

        while (maisClientes) {
            totalCompra = 0.0;
            desconto = 0.0;
            continuarComprando = true;

            while (continuarComprando) {
                System.out.print("Digite o valor do produto: R$ ");
                valorProduto = scanner.nextDouble();
                totalCompra += valorProduto;

                System.out.print("Deseja continuar comprando? (sim/nao): ");
                resposta = scanner.next();
                if (resposta.equalsIgnoreCase("nao")) {
                    continuarComprando = false;
                }
            }

            desconto = 0.0;
            if (totalCompra > 1000) {
                desconto = 0.12;
            } else if (totalCompra > 500) {
                desconto = 0.10;
            } else if (totalCompra > 300) {
                desconto = 0.05;
            }

            valorDesconto = totalCompra * desconto;
            valorAPagar = totalCompra - valorDesconto;

            System.out.println("\nResumo da compra:");
            System.out.println("Total da compra: R$ " + totalCompra);
            System.out.println("Valor do desconto: R$ " + valorDesconto);
            System.out.println("Preço a pagar: R$ " + valorAPagar);

            System.out.print("Tem mais cliente (sim/nao): ");
            finalizar = scanner.next();
            if (finalizar.equalsIgnoreCase("nao")) {
                maisClientes = false;
                System.out.println("Obrigado pela compra! Até logo.");
            }
        }
        scanner.close();
    }
}
