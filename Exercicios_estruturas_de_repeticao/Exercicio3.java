package Exercicios_estruturas_de_repeticao;
/*Crie um programa Java para exibir os quadrados de números digitados
pelo usuário, até que ele digite um número negativo.*/
public class Exercicio3 {
    public static void main(String[] args){
        int number, quad=0;
        System.out.println("Digite o número");
        number = Integer.parseInt(System.console().readLine());

        while(number>0){
            quad = number*number;
            System.out.println("O quadrado do número é:" + quad);
            System.out.println("Digite o número");
            number = Integer.parseInt(System.console().readLine());
        }
        System.out.println("O quadrado do número é:" + quad);

    }
}
