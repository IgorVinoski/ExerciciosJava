package Exercicios_estruturas_de_repeticao;
//Faça um programa que calcule a soma de dez números quaisquer
//fornecidos pelo usuário
public class Exercicio1 {
    public static void main(String[] args) {
        int numbers = 0, soma, i;

        i=0;
        soma=0;
        while(i<4){
            System.out.println("Digite o número:");
            numbers = Integer.parseInt(System.console().readLine());
            soma += numbers;
            i++;
        }
        System.out.println(soma);
    }

}
