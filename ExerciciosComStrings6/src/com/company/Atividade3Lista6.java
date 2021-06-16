//Nome na vertical. Faça um programa que solicite o nome do usuário e imprima-o na vertical.
//
//F
//U
//L
//A
//N
//O


package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Atividade3Lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String palavra = sc.next();
        String[] palavraS = palavra.toUpperCase().split("");
        for (int i=0; i<palavraS.length; i++){
            System.out.println(palavraS[i]);

        }

    }
}
