//Tamanho de strings. Faça um programa que leia 2 strings e informe o conteúdo delas seguido do seu comprimento. Informe também se as duas strings possuem o mesmo comprimento e são iguais ou diferentes no conteúdo.
//
//Compara duas strings
//String 1: Brasil Hexa 2006
//String 2: Brasil! Hexa 2006!
//Tamanho de "Brasil Hexa 2006": 16 caracteres
//Tamanho de "Brasil! Hexa 2006!": 18 caracteres
//As duas strings são de tamanhos diferentes.
//As duas strings possuem conteúdo diferente.


package com.company;

import java.util.Scanner;

public class Atividade1Lista6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if (a.length() == b.length()){
            System.out.println("as frases possuem a mesma quantidade de caracteres.");
        }
        else
            System.out.println("As frases possuem uma quantidade diferente de caracteres, a primeira possui " + a.length() + "caracteres, ja a segunda possui " + b.length() + "caracteres" );
    }
}
