package Exercicios_outras_estruturas_de_repeticao;

public class Exercicio3 {
    /*Faça um programa que calcule a soma de dez números quaisquer
fornecidos pelo usuário
*/

    public static void main(String[] args){
        int number, soma=0;
        for(int i=0; i<10; i++){
            System.out.println("Digite o número: ");
            number = Integer.parseInt(System.console().readLine());
            soma += number;
        }
        System.out.println("A soma dos 10 números é: " + soma);
    }
}
