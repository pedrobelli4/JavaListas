//Faça um programa para imprimir:
//    1
//    1   2
//    1   2   3
//    .....
//    1   2   3   ...  n


package com.company;

import java.util.Scanner;

public class Atividade2Lista5 {

    static void repeticao(int numRepeticoes){
        for (int i=0; i<numRepeticoes; i++){
            for (int j=0; j<(i+1); j++){
                System.out.print((j+1) + " ");
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

