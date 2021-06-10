//Faça um Programa que pergunte em que turno você estuda
////Peça para digitar M-matutino ou V-Vespertino ou N- Noturno.
////Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.


package com.company;

import java.util.Scanner;

public class Atividade10Lista2 {
    static void myMethod(String turno) {
        if ("m" .equalsIgnoreCase(turno)) {
            System.out.println("Bom dia!!");
        }else if ("V" .equalsIgnoreCase(turno)) {
            System.out.println("Boa tarde!!");
        }else if ("N" .equalsIgnoreCase(turno)) {
            System.out.println("Boa noite!!");
        }else {
            System.out.println("Turno inválido");
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu turno : M-matutino ou V-Vespertino ou N- Noturno");
        myMethod(sc.next());

    }

}

