//Palíndromo. Um palíndromo é uma seqüência de caracteres cuja leitura é idêntica se feita da direita para esquerda ou vice−versa. Por exemplo: OSSO e OVO são palíndromos. Em textos mais complexos os espaços e pontuação são ignorados. A frase SUBI NO ONIBUS é o exemplo de uma frase palíndroma onde os espaços foram ignorados. Faça um programa que leia uma seqüência de caracteres, mostre−a e diga se é um palíndromo ou não.


package com.company;

import java.util.Scanner;

public class Atividade8Lista6 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Digite uma frase");
        String frase = myScanner.nextLine();

        frase = frase.replaceAll("[ .]","");//Removo os espaços em branco (caso haja algum)

        StringBuilder fraseReversaB = new StringBuilder();//é necessario invocar 'StringBuilder' para costruir a frase invertida
        fraseReversaB.append(frase).reverse();//adiciono a String original
        fraseReversaB.reverse();//inverto a orden dentro a string
        String fraseReversa = String.valueOf(fraseReversaB);//associo o valor de 'StringBuilder' para uma String, para poder fazer comparaçoes

        System.out.println(frase);
        System.out.println(fraseReversaB);

        if (frase.length() == fraseReversa.length()) {//verifico sem oque foi digitado é uma frase (contem espaço) ou palavra (nao contem espaço)
            System.out.print("Palavra ");
        } else {
            System.out.print("Frase ");
        }

        if (frase.equals(fraseReversa)) {//comparo se a frase reversa é igual a frae original
            //nesse if que a associação da linha 16 se faz util
            System.out.print("digitada é um palindromo");
        }else{
            System.out.print("digitada NÂO é um palindromo");
        }
    }
}

