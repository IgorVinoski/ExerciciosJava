package Exercicios_outras_estruturas_de_repeticao;

public class Exercicio10 {
    /* Faça um programa que mostre o menu de opções a seguir, receba a opção
digitada pelo usuário e os dados necessários para executar cada operação.
Note que dependendo da opção escolhida pelo usuário, um conjunto de
instruções diferente será executado. DICA: utilize as estruturas escolha e
switch para executar conjuntos de instruções diferentes, dependendo da opção
escolhida pelo usuário.
Menu de opções:
1. Somar dois números.
2. Número ao quadrado.
Digite a opção desejad */

    public static void main(String[] args){
        int escolha, n1, n2;
        System.out.println("Escolha entre: \n 1. Somar dois números. \n 2. Número ao quadrado.");
        escolha = Integer.parseInt(System.console().readLine());
        switch (escolha){
            case 1:
                System.out.println("Digite o primeiro numero a ser somado: ");
                n1= Integer.parseInt(System.console().readLine());
                System.out.println("Digite o primeiro numero a ser somado: ");
                n2= Integer.parseInt(System.console().readLine());
                System.out.println("Resultado: "+  (n1+n2));
                break;
            case 2:
                System.out.println("Digite numero a ser elevado ao quadrado: ");
                n1= Integer.parseInt(System.console().readLine());
                System.out.println("Resultado: "+  (n1*n1));
                break;
        }
    }
}
