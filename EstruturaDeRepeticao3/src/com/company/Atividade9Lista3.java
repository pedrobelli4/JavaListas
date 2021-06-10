//Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.


package com.company;

public class Atividade9Lista3 {
    static void myMethod(int i) {
        for (; i<51; i+=2){
            System.out.print(i + ", ");

        }
    }

    public static void main(String[] args) {
        myMethod(1);
    }
}

