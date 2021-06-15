//Reverso do número. Faça uma função que retorne o reverso de um número inteiro informado. Por exemplo: 127 -> 721.


package com.company;

import java.util.Scanner;

public class Atividade9Lista5 {

    static void reverso(String numero){
        String[] Digitos = numero.split("");
        for (int i = (Digitos.length-1); i>=0; i--){
            System.out.println(Digitos[i]);
        }

    }

    public static void main(String[] args) {
        System.out.println("Digite um número inteiro");
        Scanner sc = new Scanner(System.in);
        reverso(String.valueOf(sc.nextInt()));

    }
}
