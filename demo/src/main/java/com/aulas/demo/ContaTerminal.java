package com.aulas.demo;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da Agencia: ");
        String agencia = scanner.nextLine();

        System.out.print("Conta bancaria: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Please, say your name: ");
        String nomeCliente = scanner.nextLine();
        if (nomeCliente.matches("[a-zA-ZÀ-ÿ ]+")){

        } else {
            System.out.println("Apenas letras seu tonto");
            System.exit(0);
        }

        System.out.print("Pf, fala o saldo bixo: ");
        int saldo = scanner.nextInt();
        DecimalFormat df = new DecimalFormat("#,##0.00");
        System.out.println("\nOlá "+ nomeCliente+", vlw ta criado a conta."+ " A agencia é "+ agencia+ ", conta "+ numero+ " e o seu saldo é R$" +df.format(saldo)+ " disponivel para saque.");

        scanner.close();

    }
}