//Faça um programa, com uma função que necessite de três argumentos, e que forneça a soma desses três argumentos.


package com.company;

import java.util.Scanner;

public class Atividade3Lista5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primeiro numero");
        float n1 = sc.nextFloat();
        System.out.println("Segundo numero");
        float n2 = sc.nextFloat();
        System.out.println("Terceiro numero");
        float n3 = sc.nextFloat();
        System.out.println(soma(n1, n2, n3));
    }

    static float soma(float pn1, float pn2, float pn3) {
        return (pn1 + pn2 + pn3);
    }
}

