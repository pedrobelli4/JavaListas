//Faça um Programa que leia 4 notas, mostre as notas e a média na tela.


package com.company;

import java.util.Scanner;

public class Atividade3Lista4 {

    static void myMethod(float[] notas, float media, int i) {
        Scanner sc = new Scanner(System.in);
        for (; i < notas.length; i++) {
            System.out.println("Digite sua nota do " + (i + 1) + " bimestre");
            notas[i] = sc.nextFloat();
            media += notas[i];
        }
        for (i = 0; i < notas.length; i++) {
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
        float mm = (media/ notas.length);
        System.out.println("Sua média foi de " + mm);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        myMethod(new float[4],0,0);
    }
}