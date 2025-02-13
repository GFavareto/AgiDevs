package com.agibank.semana3.exemplovetor;
import java.util.Arrays;
import java.util.Scanner;

public class vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] valores = {10,30,20,90};
        valores[2] = 15;

        System.out.println(Arrays.toString(valores));
    }
}
