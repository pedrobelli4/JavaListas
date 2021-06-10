////Faça um Programa que peça dois números e imprima a soma.


package com.company;

import java.util.Scanner;

public class Atividade3Lista1 {
    static void meuMetodo(int numero1,int numero2) {
        System.out.println("A somo dos números é " + numero1 + numero2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite dois números");
        meuMetodo(scanner.nextInt(), scanner.nextInt());

    }
}

