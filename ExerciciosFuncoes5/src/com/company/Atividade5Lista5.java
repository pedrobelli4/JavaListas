//Faça um programa com uma função chamada somaImposto. A função possui dois parâmetros formais:
//taxaImposto, que é a quantia de imposto sobre vendas expressa em porcentagem e custo, que é o custo de um item antes do imposto.
//A função “altera” o valor de custo para incluir o imposto sobre vendas.
package com.company;

import java.util.Scanner;

public class Atividade5Lista5 {
    public static void main(String[] args) {
        System.out.println("Digite o valor do produto");
        Scanner sc = new Scanner(System.in);
        float valP = sc.nextFloat();
        System.out.println("Digite a taxa a ser aplicado ao produto (Ex: 3,5 ; 20.%)");
        float taxa = sc.nextFloat();
        float valT = somaImposto(taxa, valP);
        float valF = alterar(valT, valP);
        System.out.println("Valor final do produto R$" + valF);
    }

    static float somaImposto(float taxaI, float custo) {
        return custo * (taxaI / 100);
    }

    static float alterar(float valTp, float custop) {

        return valTp + custop;
    }
}

