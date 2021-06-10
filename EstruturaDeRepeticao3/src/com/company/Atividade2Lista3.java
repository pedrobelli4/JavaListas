//Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.


package com.company;

import java.util.Scanner;

public class Atividade2Lista3 {
    static void myMethod(String usuario, String senha) {

        Scanner sc = new Scanner(System.in);
        while (usuario .equalsIgnoreCase(senha)) {
            System.out.println("Seu usuário não pode ser igual a senha!");

            System.out.println("Digite seu usuário");
            usuario = sc.next();
            System.out.println("Digite sua senha");
            senha = sc.next();
        }
        System.out.println("Cadastro concluido!");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu usuário e senha");
        myMethod(sc.next(), sc.next());

    }
}
