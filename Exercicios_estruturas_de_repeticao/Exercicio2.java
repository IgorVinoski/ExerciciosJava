package Exercicios_estruturas_de_repeticao;
/*Faça um programa que calcule o somatório, a soma dos quadrados e a
média entre os n primeiros números inteiros positivos.*/
public class Exercicio2 {
    public static void main(String[] args) {
     int soma=0, quadrados=0, media=0, n, i=0;

        System.out.println("Digite o numero");
        n = Integer.parseInt(System.console().readLine());
     while (n>0){

         soma += n;
         quadrados =+ n*n;
         i++;
         System.out.println("Digite o numero");
         n = Integer.parseInt(System.console().readLine());
     }
     System.out.println(soma);
        System.out.println(quadrados);
        System.out.println((double) soma/i);

    }
}
