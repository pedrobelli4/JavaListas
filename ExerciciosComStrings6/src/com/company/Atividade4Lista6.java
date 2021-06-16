//Nome na vertical em escada. Modifique o programa anterior de forma a mostrar o nome em formato de escada.
//
//F
//FU
//FUL
//FULA
//FULAN
//FULANO


package com.company;

import java.util.Scanner;

public class Atividade4Lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra");
        String palavra = sc.next();
        String[] palavraS = palavra.toUpperCase().split("");
        for (int i = 0; i < palavraS.length; i++) {
            for (int j = 0; j < (i + 1); j++) {
                System.out.print(palavraS[j]);
            }
            System.out.println();
        }
    }
}


