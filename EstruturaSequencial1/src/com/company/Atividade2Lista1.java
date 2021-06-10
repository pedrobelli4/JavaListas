////Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].


package com.company;

import java.util.Scanner;

public class Atividade2Lista1 {
        static void meuMetodo(int numero) {
            System.out.println("O número digitado foi" + numero);
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            meuMetodo(scanner.nextInt());

    }
}
