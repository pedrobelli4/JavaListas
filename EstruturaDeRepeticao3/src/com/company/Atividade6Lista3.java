//Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro. Depois modifique o programa para que ele mostre os números um ao lado do outro.


package com.company;

import java.util.Scanner;

public class Atividade6Lista3 {
    static void myMethod(int i) {
        for (; i <= 20; i++) {
            System.out.println(i);
        }
        for (; i <= 20; i++) {
            if (i == 20) {
                System.out.print(i);
            }
            else {
                System.out.print(i + ", ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        myMethod(1);
    }
}

