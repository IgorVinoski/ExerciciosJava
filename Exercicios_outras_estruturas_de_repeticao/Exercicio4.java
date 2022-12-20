package Exercicios_outras_estruturas_de_repeticao;

public class Exercicio4 {
    /*Faça um programa que calcule o somatório, a soma dos quadrados e a
    média entre os n primeiros números inteiros positivos.*/
    public static void main(String[] args){
        int n,number, somatorio=0, quadrados=0,media=0, i=1;
        System.out.println("Digite o número ");
        n = Integer.parseInt(System.console().readLine());

        for( ; n > 0; i++){
            somatorio += n;
            quadrados += n*n;
            media = somatorio/i;
            System.out.println("Digite o número ");
            n = Integer.parseInt(System.console().readLine());

        }
        System.out.println(somatorio);
        System.out.println(quadrados);
        System.out.println(media);


    }
}
