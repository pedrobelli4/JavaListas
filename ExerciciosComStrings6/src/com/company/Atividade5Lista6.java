//Nome na vertical em escada invertida. Altere o programa anterior de modo que a escada seja invertida.
//
//FULANO
//FULAN
//FULA
//FUL
//FU
//F


package com.company;

import java.util.Scanner;

public class Atividade5Lista6 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite uma palavra");
            String palavra = sc.next();
            String[] palavraS = palavra.toUpperCase().split("");
            for (int i = palavraS.length; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print(palavraS[j]);
                }
                System.out.println();
            }
        }

    }
