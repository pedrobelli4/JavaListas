//Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar
////A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
////A mensagem "Reprovado", se a média for menor do que sete;
////A mensagem "Aprovado com Distinção", se a média for igual a dez.


package com.company;

import java.util.Scanner;

public class Atividade5Lista2 {
    static void myMethod(int nota1, int nota2) {

        if ( (nota1+nota2) /2 == 10) {
            System.out.println("Aprovado com Distinção");
        }
        else if ((nota1+nota2)/2 >= 7) {
            System.out.println("Aprovado");
        }
        else if ((nota1+nota2)/2 < 7 ) {
            System.out.println("Reprovado");
        }

    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Digite suas duas notas");
        myMethod(sc.nextInt(), sc.nextInt());

    }
}

