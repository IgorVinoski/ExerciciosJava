package Integrando_Estruturas_de_controle;

public class Exercicio9 {
    public static void main(String[] args) {
        /*

        Faça um programa que apresente o menu de opções a seguir, que permita ao
        usuário escolher a opção desejada, receba os dados necessários para executar
        a operação e mostre o resultado. Verifique a possibilidade de opção inválida.
        Menu de opções:
        1. Novo salário
        2. Férias
        3. Décimo terceiro
        4. Sair
        Na opção 1, receber o salário de um funcionário, calcular e mostrar o novo
        salário usando as regras a seguir:
        https://prnt.sc/G2nS3W-A8ZKJ
        Na opção 2, receber o salário de um funcionário, calcular e mostrar o valor de
        suas férias. Sabe-se que as férias equivalem ao seu salário acrescido de um
        terço do salário.
        Na opção 3, receber o salário de um funcionário e o número de meses de
        trabalho na empresa, no máximo doze, calcular e mostrar o valor do décimo
        terceiro salário. Sabe-se que o décimo terceiro salário equivale ao seu salário
        multiplicado pelo número de meses de trabalho dividido por 12.
        Na opção 4, sair do programa.

         */

        int opcao;

        System.out.println("ESCOLHA ENTRE AS OPÇÕES: \n" +
                "1. NOVO SALÁRIO \n" +
                "2. FÉRIAS \n" +
                "3. DÉCIMO TERCEIRO \n" +
                "4. SAIR");

        opcao=Integer.parseInt(System.console().readLine());


        switch (opcao){
            case 1:
                System.out.println("Digite seu salário");
                int salario = Integer.parseInt(System.console().readLine());
                if(salario<=1000){
                    System.out.println("O novo salário é de: " +  salario * 115/100);
                }else if(salario<=3000){
                    System.out.printf("O novo salário é de: " + salario*110/100);
                }else{
                    System.out.println("O novo salário é de " + salario*105/100);
                }
                break;
            case 2:
                System.out.println("Digite seu salário");
                salario = Integer.parseInt(System.console().readLine());
                System.out.println("O novo salário é de " + salario*4/3);
                break;
            case 3:
                System.out.println("Digite seu salário");
                salario = Integer.parseInt(System.console().readLine());
                System.out.println("Digite a quantidade de meses trabalhados");
                int meses = Integer.parseInt(System.console().readLine());

                System.out.println("O valor do seu décime terceiro é de " + salario*meses/12);
                break;
            case 4:
                System.out.println("SAINDO DO PROGRAMA");
                break;
        }
    }
}
