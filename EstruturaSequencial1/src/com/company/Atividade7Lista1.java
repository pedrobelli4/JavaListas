//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.


package com.company;

import java.util.Scanner;

public class Atividade7Lista1 {
    static void meuMetodo(int lado) {
        System.out.println("A área desse quadrado é de " + lado*lado +", e o dobro dessa área é de " + (lado*lado) *2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do lado do quadrado");
        meuMetodo(scanner.nextInt());

    }
}
