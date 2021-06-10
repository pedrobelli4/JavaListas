//Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.


package com.company;

import java.util.Scanner;

public class Atividade10Lista1 {
    static void meuMetodo(double tempC) {
        System.out.println("Em Fahrenheit fica " + ((tempC * 9/5) + 32));
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius");
        meuMetodo(scanner.nextDouble());

    }
}

