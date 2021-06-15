//Faça um programa para imprimir:
//    1
//    2   2
//    3   3   3
//    .....
//    n   n   n   n   n   n  ... n


package com.company;

import java.util.Scanner;

public class Atividade1Lista5 {
        static void repeticao(int numRepeticoes){
            for (int i=0; i<numRepeticoes; i++){
                for (int j=0; j<(i+1); j++){
                    System.out.print((i+1) + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Digite o numero de repetições");

            repeticao(sc.nextInt());
        }
    }

