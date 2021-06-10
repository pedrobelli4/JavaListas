//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
////Calcule e mostre o total do seu salário no referido mês.


package com.company;

import java.util.Scanner;

public class Atividade8Lista1 {
    static void meuMetodo(double ganhoPorHora, int horasTrabalhadas) {
        System.out.println("O seu salário é de " + ganhoPorHora*horasTrabalhadas);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu ganho por hora e quantas horas você trabalha no mês");
        meuMetodo(sc.nextDouble(), sc.nextInt());

    }
}
