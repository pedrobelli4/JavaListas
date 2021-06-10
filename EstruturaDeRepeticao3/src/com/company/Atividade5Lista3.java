//Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais. Valide a entrada e permita repetir a operação.


package com.company;

import java.util.Scanner;

public class Atividade5Lista3 {
    static void myMethod(int popuA, int popuB, int taxA,int taxB, int ano) {
        while (popuA < popuB ) {
            popuA += popuA * taxA;
            popuB += popuB * taxB;
            ano += 1;

        }
        System.out.println("Sera ultrapassado em " + ano + " anos");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe A população de A e sua taxa de crescimento, informe a população de B e sua taxa de crescimento");
        myMethod(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), 0);

    }
}


