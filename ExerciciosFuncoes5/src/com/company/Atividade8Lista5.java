//Faça uma função que informe a quantidade de dígitos de um determinado número inteiro informado.


package com.company;

import java.util.Scanner;

public class Atividade8Lista5 {

    static void mymethod(String numint){
        String[] quantD = numint.split("");
        System.out.println("A quantidade de digitos do número digitado foi de " + quantD.length);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número");
        mymethod(String.valueOf(sc.next()));

    }
}
