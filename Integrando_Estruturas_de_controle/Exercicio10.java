package Integrando_Estruturas_de_controle;

public class Exercicio10 {
    public static void main(String[] args) {
        /*
            Faça um programa que receba um número inteiro maior que 1, verifique se o
            número fornecido é primo ou não. Um número é primo quando é divisível
            apenas por 1 e por ele mesmo.


         */

int number;

        System.out.println("Digite um número: ");
        number=Integer.parseInt(System.console().readLine());


        for(int i = 2; number>=i; i++ ){
            if(number % i == 0 ){
                System.out.println("O número não é primo primo");
            }else
                System.out.println("O numero é rpimo.");


        }


    }
}
