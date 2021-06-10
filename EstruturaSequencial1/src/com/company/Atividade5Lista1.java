////Faça um Programa que converta metros para centímetros.


package com.company;

import java.util.Scanner;

public class Atividade5Lista1 {
    static void meuMetodo(int QuantidadeEmMetros) {
        System.out.println("Passando para centimetros fica " + QuantidadeEmMetros * 100);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); {
            System.out.println("Bem vindo, aqui convertemos centimetros para metodos, informe a quantidade em centimtros");
            meuMetodo(scanner.nextInt());
        }

    }
}
