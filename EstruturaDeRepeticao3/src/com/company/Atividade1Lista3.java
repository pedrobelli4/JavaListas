//Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.


package com.company;

import java.util.Scanner;

public class Atividade1Lista3 {
    static void myMethod(double nota) {
        Scanner sc = new Scanner(System.in);
        while (nota > 10 || nota < 0 ) {
            System.out.println("Nota inválida! Digite corretamente.");
            nota = sc.nextDouble();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua nota de 0 a 10");
        myMethod(sc.nextDouble());

    }
}


