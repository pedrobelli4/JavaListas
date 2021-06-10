//Faça um Programa que verifique se uma letra digitada é vogal ou consoante.



package com.company;

import java.util.Scanner;

public class Atividade4Lista2 {
    static void myMethod(String letra) {
        switch (letra) {
            case "A", "a":
            case "E", "e":
            case "I","i":
            case "O","o":
            case "U","u":
                System.out.println("Vogal" + letra);
                break;
            default:
                System.out.println("Consoante" + letra);
        }

    }


    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Digite uma letra");
        myMethod(sc.next());
    }
}

