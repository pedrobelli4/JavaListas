//Nome ao contrário em maiúsculas. Faça um programa que permita ao usuário digitar o seu nome e em seguida mostre o nome do usuário de trás para frente utilizando somente letras maiúsculas.
//Dica: lembre−se que ao informar o nome o usuário pode digitar letras maiúsculas ou minúsculas

package com.company;

import java.util.Scanner;

public class Atividade2Lista6 {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String user = myScanner.nextLine();
        StringBuilder userB = new StringBuilder();
        userB.append(user).reverse();
        String reverso = String.valueOf(userB);

        System.out.print(String.valueOf(userB));
    }
}
