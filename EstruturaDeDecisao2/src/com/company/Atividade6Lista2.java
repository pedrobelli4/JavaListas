//Faça um Programa que leia três números e mostre o maior deles.



package com.company;

import java.util.Scanner;

public class Atividade6Lista2 {
    static void myMethod(int n1,int n2, int n3) {
        int somaP = Math.max(n1,n2);
        int somaF = Math.max(somaP,n3);
        System.out.println("O maior é " + somaF);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 números");
        myMethod(sc.nextInt(), sc.nextInt(), sc.nextInt());

    }
}

