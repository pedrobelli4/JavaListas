//Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%
////Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.


package com.company;

import java.util.Scanner;

public class Atividade4Lista3 {
    static void myMethod(int cidadeA, int cidadeB, int ano) {
        while (cidadeA <= cidadeB) {
            cidadeA+= cidadeA * 0.03;
            cidadeB+= cidadeB * 0.015;
            ano += 1;

        }
        System.out.println("Sera ultrapassada em " + ano + " anos");


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Uma cidade com 80000 habitantes tem taxa anual de crescimento de 3%, ja a outra cidade tem 200000 com uma taxa de 1,5%");
        myMethod(80000, 200000, 0);


    }
}

