//Faça um programa que use a função valorPagamento para determinar o valor a ser pago por uma prestação de uma conta.
//O programa deverá solicitar ao usuário o valor da prestação e o número de dias em atraso e passar estes valores para a função valorPagamento, que calculará o valor a ser pago e devolverá este valor ao programa que a chamou
//O programa deverá então exibir o valor a ser pago na tela. Após a execução o programa deverá voltar a pedir outro valor de prestação e assim continuar até que seja informado um valor igual a zero para a prestação.
//Neste momento o programa deverá ser encerrado, exibindo o relatório do dia, que conterá a quantidade e o valor total de prestações pagas no dia.
//O cálculo do valor a ser pago é feito da seguinte forma. Para pagamentos sem atraso, cobrar o valor da prestação. Quando houver atraso, cobrar 3% de multa, mais 0,1% de juros por dia de atraso.

package com.company;

import java.util.Scanner;

public class Atividade7Lista5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prestacoesDoDia = 0;
        float[][] arrayFinal = new float[3][10];
        float[] receberArray;
        boolean finalizarDiaB = false;

        System.out.println("Bem vindo a interface de \"Prestação de conta\"");
        do {//O cogido se passarar sempre dentro desse loop
            if (prestacoesDoDia<10) {
                receberArray = adicionandoPrestacao(prestacoesDoDia);
                //dividir o array e armazenar em seus devidos locais
                for (int i = 0; i < receberArray.length; i++) {
                    arrayFinal[i][prestacoesDoDia] = receberArray[i];
                }
            }else{
                System.err.println("Numero prestaçoes diaria exedida");
            }
            prestacoesDoDia++;

            finalizarDiaB = finalizarDiaFuncao();
        }while (!finalizarDiaB);

        mostrarTodasPrestacoes(arrayFinal);

    }

    public static float[] adicionandoPrestacao(int numeroDaPrestacao) {
        float[] prestacoesTabela = new float[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o valor da prestação de conta?");
        float valorPrestacao = sc.nextFloat();
        System.out.println("Esta prestação esta em atraso? ('S'-Sim, 'N'-Não)");
        char prestacaoEmAtraso = sc.next().charAt(0);
        int diasEmAtraso = 0;
        if (prestacaoEmAtraso == 's') {
            System.out.println("Quantos dias em atraso?");
            diasEmAtraso = sc.nextInt();
        } else {
            diasEmAtraso = 0;
        }
        prestacoesTabela[0] = valorPrestacao;
        prestacoesTabela[1] = diasEmAtraso;
        prestacoesTabela[2] = (float) (valorPrestacao + (valorPrestacao * (0.01 * diasEmAtraso)));

        return prestacoesTabela;

    }

    public static boolean finalizarDiaFuncao(){
        Scanner sc = new Scanner(System.in);
        System.out.println("'F' - Finalizar o dia\n'A' - Adicionar outra prestação");
        char finalizarDia = sc.next().charAt(0);
        if (finalizarDia == 'f') {
            return true;
        } else {
            return false;
        }
    }

    public static float[][] mostrarTodasPrestacoes(float[][] tabelaMae){
        System.out.println("Fim do dia, segue todas as Prestação de conta\n| Valor da Prestação | Dias em atraso | Valor + juros |");
        for (int i=0; i<10; i++){
            System.out.print("| ");
            for (int j=0; j<3; j++) {
                System.out.print(tabelaMae[j][i] + " | ");
            }
            System.out.println();
        }
        return null;
    }
}