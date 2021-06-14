//Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.


package com.company;

import java.util.Scanner;

public class Atividade2Lista4 {

    static void myMethod(int i, int[] numeros ) {
        Scanner sc = new Scanner(System.in);

        for (; i < numeros.length; i++) {
            System.out.println("Digite o valor da casa " + (i + 1));
            numeros[i] = sc.nextInt();
        }
        for (i = 9; i>=0; i--) {
            System.out.print(numeros[i] + ", ");
        }
    }

    public static void main(String[] args) {
        myMethod(0,new int[10]);

    }
}