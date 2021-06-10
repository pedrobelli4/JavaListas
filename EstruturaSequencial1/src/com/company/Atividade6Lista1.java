//


package com.company;

import java.util.Scanner;

public class Atividade6Lista1 {
    static void meuMetodo(int raio, double pi ) {
        System.out.println("A área é de " + raio *pi);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o raio do circulo");
        meuMetodo(scanner.nextInt(), 3.14);

    }
}


