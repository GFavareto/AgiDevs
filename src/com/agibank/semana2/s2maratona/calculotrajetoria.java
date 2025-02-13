// Uma das primeiras aplicações de computador foi o cálculo de trajetória de
// projéteis. Se um projétil é atirado com uma velocidade inicial V (m/s) a um
// ângulo de inclinação 0 (radianos), sua posição no plano vertical (x,y) no
// tempo t (segundos) é calculada pelas fórmulas:
// x=V*cos(0)*t
// y=(V*sen(0)*t)-(0,5g*t2)
// onde: 0<0<2 e g=9,8ms2

package com.agibank.semana2.s2maratona;
import java.util.Scanner;

public class calculotrajetoria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double intervalo = 0.01,g = 9.8,theta,velocidade,radiano,Vx,Vy,x,y,t;

        System.out.print("Digite a velocidade inicial (m/s): ");
        velocidade = scanner.nextDouble();

        System.out.print("Digite o ângulo de inclinação: ");
        theta = scanner.nextDouble();

        radiano = Math.toRadians(theta);
        Vx = velocidade * Math.cos(radiano);
        Vy = velocidade * Math.sin(radiano);
        x = 0;
        y = 0;
        t = 0.01;

        System.out.println("\nTrajetória do projétil:");
        System.out.printf("| x | y %n");

        while (y >= 0) {
            x = Vx * t;
            y = (Vy * t) - (0.5 * g * t * t);
            System.out.printf("X = %.2f | Y = %.2f%n", x, y);
            t += intervalo;
        }
        scanner.close();
    }
}