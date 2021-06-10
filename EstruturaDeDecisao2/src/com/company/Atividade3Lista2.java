//Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.


package com.company;

import java.util.Scanner;

public class Atividade3Lista2 {
    static void myMethod(String letra) {
        if ("f" .equalsIgnoreCase(letra)) {
            System.out.println("Sexo feminino escolhido");
        }
        else if ("m" .equalsIgnoreCase(letra)) {
            System.out.println("Sexo masculino escolhido");
        }
        else {
            System.out.println("Sexo inválido");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma letra : F - Feminino, M - Masculino");
        myMethod(sc.next());


    }
}

