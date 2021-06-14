//Faça um Programa que leia um vetor A com 10 números inteiros, calcule e mostre a soma dos quadrados dos elementos do vetor.


package com.company;

import java.util.Scanner;

public class Atividade9Lista4 {

    static void myMethod(int[] todosNum, int somaQuad, int i) {
        for (; i < todosNum.length; i++) {
            System.out.println("Digite um numero (" + (i + 1) + ")");
            Scanner sc = new Scanner(System.in);
            todosNum[i] = sc.nextInt();
            somaQuad = (todosNum[i] * todosNum[i]);
        }
        System.out.println("Soma total: " + todosNum);
    }

    public static void main(String[] args) {
        myMethod(new int[10], 0, 0);


    }
}

