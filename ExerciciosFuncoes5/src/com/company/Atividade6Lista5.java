package com.company;

import java.util.Scanner;

public class Atividade6Lista5 {
    public static void main(String[] args) {
        System.out.println("Digite um horaio, no formato 24 horas (22:12, 06:30)");
        Scanner scanner = new Scanner(System.in);
        String horasDigitada = scanner.next();
        int[] horasInt = comversor(horasDigitada);
        String amPm = ampm(horasInt[2]);
        System.out.println(horasInt[0] + ":" + horasInt[1] + amPm);
    }
    private static String ampm(int amppm) {
        if (amppm == 0) {
            return "AM";
        }else if (amppm == 1){
            return "PM";
        }
        return null;
    }
    static int[] comversor(String horas){
        String horaD[] = horas.split(":");
        int[] valD = new int[3];
        valD[0] = Integer.parseInt(horaD[0]);
        valD[1] = Integer.parseInt(horaD[1]);
        if (valD[0] > 12) {
            valD[0] = valD[0] - 12;
            valD[2] = 1;
        }else if (valD[0] <= 12){
            valD[2] = 0;
        }
        return valD;
    }
}
