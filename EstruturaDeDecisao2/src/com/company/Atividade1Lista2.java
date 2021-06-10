//Faça um Programa que peça dois números e imprima o maior deles.


package com.company;

import java.util.Scanner;

public class Atividade1Lista2 {
    static void myMethod(float n1, float n2) {
        float ff = Math.max(n1,n2);
        System.out.println("O maior é " + ff);
    }

    public static void main(String[] args) {
        System.out.println("Digite dois números");
        Scanner sc = new Scanner(System.in);
        myMethod(sc.nextFloat(), sc.nextFloat());

    }
}

