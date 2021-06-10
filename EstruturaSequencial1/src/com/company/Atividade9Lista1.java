//Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
////C = 5 * ((F-32) / 9).


package com.company;

import java.util.Scanner;

public class Atividade9Lista1 {
    static void meuMetodo(double tempF) {
        System.out.println("Essa temperatura em Celsius fica " + 5 *((tempF-32) /9));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit ");
        meuMetodo(sc.nextInt());


    }
}

