//Faça um Programa que leia 20 números inteiros e armazene-os num vetor. Armazene os números pares no vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores.


package com.company;

import java.util.Scanner;

public class Atividade5Lista4 {

    static void myMethod( int[] tdsN, int[] par, int[] impar, boolean teste, int a, int b, int i){
        Scanner sc = new Scanner(System.in);
        for (i=0; i< tdsN.length; i++){
            System.out.print("Digite os números: ");
            tdsN[i] = sc.nextInt();
        }
        for (i=0; i<tdsN.length; i++){
            int nT = tdsN[i];
            teste = true;
            while (teste) {
                if (nT == 0) {
                    a++;
                    par[a] = tdsN[i];
                    teste = false;
                    break;
                } else if (nT == 1) {
                    b++;
                    impar[b] = tdsN[i];
                    teste=false;
                    break;
                } else {
                    nT = nT - 2;
                }
            }
        }
        System.out.print("Os números digitados foram: ");
        for (i=0; i< tdsN.length; i++){
            System.out.print(tdsN[i] + ", ");
        }
        System.out.print("Pares: ");
        for (i=0; i< par.length; i++){
            if (par[i] != 0){
                System.out.print(par[i] + ", ");
            }
        }
        System.out.print("Impares: ");
        for (i=0; i< impar.length; i++){
            if (impar[i] != 0){
                System.out.print(impar[i] + ", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        myMethod(new int[20],new int[20],new int[20],false, 0, 0, 0);

    }
}
