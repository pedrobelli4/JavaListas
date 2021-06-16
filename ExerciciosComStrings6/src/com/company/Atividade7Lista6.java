//Conta espaços e vogais. Dado uma string com uma frase informada pelo usuário (incluindo espaços em branco), conte:
//
//quantos espaços em branco existem na frase.
//quantas vezes aparecem as vogais a, e, i, o, u.


package com.company;

import java.util.Scanner;

public class Atividade7Lista6 {
    public static void main(String[] args) {


        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String fraseDigitada = myScanner.nextLine();
        String[] fraseSplit = fraseDigitada.split("");

        int vogais = 0,
                emBranco = 0;

        String[] letrasVogais = {"a", "e", "i", "o", "u"};
        for (int i=0; i< fraseSplit.length; i++){
            if (fraseSplit[i].equalsIgnoreCase(" ")){
                emBranco++;
            }
            for (int j=0; j<letrasVogais.length; j++){
                if (fraseSplit[i].equalsIgnoreCase( letrasVogais[j])){
                    vogais++;
                }
            }
        }
        System.out.printf("Espaços em branco existente na frase: %d vezes%n", emBranco);
        System.out.print("Espaços em branco existente na frase: " + emBranco + "vezes\n");
        System.out.printf("vogais existente na frase: %d", vogais);
    }
}

