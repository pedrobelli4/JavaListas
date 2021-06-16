//Verificação de CPF. Desenvolva um programa que solicite a digitação de um número de CPF no formato xxx.xxx.xxx-xx e indique se é um número válido ou inválido através da validação dos dígitos verificadores edos caracteres de formatação.


package com.company;

import java.util.Scanner;

public class Atividade9lista6 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        String cpfDigitado;
        do {
            System.out.println("Digite seu CPF (no formato: 123.456.789-10)");
            cpfDigitado = myScanner.nextLine();
            if (formatacaoCPFVerificacao(cpfDigitado)) {
                System.out.println("Formatação do CPF valida\n");
                break;
            } else {
                System.out.println("formatação do CPF esta incorreta\n");
            }
        } while (!formatacaoCPFVerificacao(cpfDigitado));

        if (formatacaoCPFVerificacao(cpfDigitado)
                && primeiroDigitoVerificacao(cpfDigitado)
                && segundoDigitoVerificacao(cpfDigitado)){
            System.out.println("CPF Valido");
        }else  {
            System.out.println("CPF Invalido");
        }
    }

    public static Boolean formatacaoCPFVerificacao(String cpfDigitado) {
        String[] cpfDSplit = cpfDigitado.split("");
        if (cpfDSplit[3].equals(".") && cpfDSplit[7].equals(".") && cpfDSplit[11].equals("-")){
            return true;
        }
        return  false;
    }

    public static Boolean primeiroDigitoVerificacao(String cpfDigitado) {
        String[] cpfDSplit = cpfDigitado.split("");
        String[] cpfSemUntimo2Digitos = cpfDigitado.split("-");

        String[] cpfFormatadoSplit = (cpfSemUntimo2Digitos[0].replaceAll("[.]", "")).split("");

        int validacaoCPF = 10;
        int validacao1Digito = 0;
        for (int i = 0; i < cpfFormatadoSplit.length; i++) {
            validacao1Digito += Integer.parseInt(cpfFormatadoSplit[i]) * validacaoCPF;
            validacaoCPF--;
        }
        System.out.println(validacao1Digito);
        System.out.println((validacao1Digito * 10) % 11);
        System.out.println(cpfDSplit[12]);

        if ((validacao1Digito * 10) % 11 == Integer.parseInt(cpfDSplit[12])){
            System.out.println((validacao1Digito * 10) % 11);
            System.out.println(Integer.parseInt(cpfDSplit[12]));
            return true;
        }
        return false;
    }

    public static Boolean segundoDigitoVerificacao(String cpfDigitado) {
        String cpfSoNumero = cpfDigitado.replaceAll("[.-]", "");
        String[] cpfSNSplit = cpfSoNumero.split("");

        int[] cpfDSplit = new int[cpfSNSplit.length];
        for (int i = 0; i < cpfSNSplit.length; i++){
            cpfDSplit[i] = Integer.parseInt(cpfSNSplit[i]);
        }

        int validacaoCPF = 11;
        int validacao2Digito = 0;
        for (int i = 0; i < cpfDSplit.length; i++) {
            System.out.print(cpfDSplit[i]);
            validacao2Digito += cpfDSplit[i] * validacaoCPF;
            validacaoCPF--;
            System.out.println("|" + cpfDSplit);
        }
        System.out.println((validacao2Digito * 10) % 11);
        System.out.println(cpfDSplit[13]);

        if ((validacao2Digito * 10) % 11 == cpfDSplit[11]){
            System.out.println((validacao2Digito * 10) % 11);
            System.out.println(cpfDSplit[12]);
            return true;
        }
        return false;
    }
}

