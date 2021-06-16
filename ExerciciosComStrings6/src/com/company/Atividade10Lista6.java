//Número por extenso. Escreva um programa que solicite ao usuário a digitação de um número até 99 e imprima-o na tela por extenso.


package com.company;

import java.util.Scanner;

public class Atividade10Lista6 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Digite um numeto ate 99");
        int numeroDigitado = sc.nextInt();
        if (numeroDigitado <= 10){
            System.out.println(unidade(numeroDigitado));
        }else if (numeroDigitado >= 11 && numeroDigitado <= 19){
            System.out.println(dezenaDez(numeroDigitado));
        }else if (numeroDigitado >= 20){
            System.out.print(dezena(numeroDigitado / 10) + " e ");
            System.out.println(unidade(numeroDigitado % 10));
        }
    }

    private static String dezenaDez(int numero) {
        String String;
        switch (numero){
            case 11 -> {
                String = "Onze";
            }
            case 12 -> {
                String = "Doze";
            }
            case 13 -> {
                String = "Treze";
            }
            case 14 -> {
                String = "Quatorze";
            }
            case 15 -> {
                String = "Quinze";
            }
            case 16 -> {
                String = "Dezeseis";
            }
            case 17 -> {
                String = "Dezessete";
            }
            case 18 -> {
                String = "Dezoito";
            }
            case 19 -> {
                String = "Dezenove";
            }
            default -> throw new IllegalStateException("Valor invalido: " + numero);
        }
        return String;
    }

    private static String dezena(int numero) {
        String string;
        switch (numero){
            case 2 -> {
                string = "Vinte";
            }
            case 3 -> {
                string = "Trinta";
            }
            case 4 -> {
                string = "Quarenta";
            }
            case 5 -> {
                string = "Cinquenta";
            }
            case 6 -> {
                string = "Sesenta";
            }
            case 7 -> {
                string = "Setenta";
            }
            case 8 -> {
                string = "Oitenta";
            }
            case 9 -> {
                string = "Noventa";
            }
            default -> throw new IllegalStateException("Valor invalido: " + numero);
        }
        return string;
    }

    private static String unidade(int numero) {
        String string;
        switch (numero){
            case 1 -> {
                string = "Um";
            }
            case 2 -> {
                string = "Dois";
            }
            case 3 -> {
                string = "Tres";
            }
            case 4 -> {
                string = "Quatro";
            }
            case 5 -> {
                string = "Cinco";
            }
            case 6 -> {
                string = "Seis";
            }
            case 7 -> {
                string = "Sete";
            }
            case 8 -> {
                string = "Oito";
            }
            case 9 -> {
                string = "Nove";
            }
            case 10 -> {
                string = "Dez";
            }
            default -> throw new IllegalStateException("Valor invalido: " + numero);
        }
        return string;
    }
}


