//Faça um Programa que leia três números e mostre-os em ordem decrescente.


package com.company;

import java.util.Scanner;

public class Atividade9Lista2 {
    static void myMethod(int n1, int n2, int n3) {
        if (n1 > n2 && n2 > n3) {
            System.out.println(n1 + " " + n2 + " " + n3);
        }else if (n2 > n1 && n1 > n3) {
            System.out.println(n2 + " " + n1 + " " + n3);
        }else if (n3 > n1 && n1 > n2) {
            System.out.println(n3 + " " + n1 + " " + n2);
        }else if (n3 > n2 && n2 > n1) {
            System.out.println(n3 + " " + n2 + " " + n1);
        }else if (n1 > n3 && n3 > n2) {
            System.out.println(n1 + " " + n3 + " " + n2);
        }else if (n2 > n3 && n3 > n1) {
            System.out.println(n2 + " " + n3 + " " + n1);
        }else {
            System.out.println("Os números são iguais");
        }

    }


    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Digite 3 números");
        myMethod(sc.nextInt(), sc.nextInt(), sc.nextInt());

    }
}

