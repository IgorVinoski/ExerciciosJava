package Exercicios_estruturas_de_repeticao;

public class Exercicio4 {
    /*Faça um programa que receba várias idades, calcule e mostre a média
    das idades digitadas. Finalize digitando idade igual a zero.*/
    public static void main(String[] args){
        int idade, media=0, i=1, soma=0;

        System.out.println("Digite a idade:");
        idade = Integer.parseInt(System.console().readLine());

        while(idade > 0 && idade != 0 ){

            soma += idade;
            media = idade/i;
            System.out.println("Digite a idade:");
            idade = Integer.parseInt(System.console().readLine());
            i++;
        }
        System.out.println(media);

    }
}
