//Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.


package com.company;

import java.util.Scanner;

public class Atividade1Lista4 {
    static void myMethod(int i, int[] numeros) {
        for (; i < numeros.length; i++) {
            System.out.println("Digite o valor numero " + (i + 1));
            Scanner sc = new Scanner(System.in);
            numeros[i] = sc.nextInt();


        }
        for (;i< numeros.length; i++)
            System.out.print(numeros[i] + ", ");
    }
    public static void main (String[]args){
        myMethod(0, new int[5]);

    }
}

