////Faça um Programa que peça as 4 notas bimestrais e mostre a média.


package com.company;

import java.util.Scanner;

public class Atividade4Lista1 {
    static void meuMetodo(int nota1, int nota2, int nota3,int nota4) {
        System.out.println("A sua média foi de " + (nota1+nota2+nota3+nota4) /4);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite suas 4 notas,");
        meuMetodo(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }
}
