//Faça um Programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação e os números.


package com.company;

import java.util.Scanner;

public class Atividade7Lista4 {
    static void myMethod(int[] quantN, float soma, float mult, int i ){
        for (; i <quantN .length; i++) {
            System.out.println("Digite um numero (" + (i + 1) + ")");
            Scanner sc = new Scanner(System.in);
            quantN[i] = sc.nextInt();
            soma = soma + quantN[i];
        }
        for (; i < quantN.length; i++) {
            mult = mult * quantN[i];
        }
        System.out.println("Soma dos números " + soma + " ,Multiplicação de todos os numeros " + mult);

        for (; i < quantN.length; i++) {
            if (i == 4) {
                System.out.print(quantN[i]);
            } else {
                System.out.print(quantN[i] + ", ");
            }
        }
    }

    public static void main(String[] args) {
        myMethod(new int[5], 0,1,0);


    }
}
