package Exercicios_outras_estruturas_de_repeticao;

public class Exercicio9 {
    public static void main(String[] args){
        /*A série de Fibonacci é formada pela seguinte sequência: 1, 1, 2, 3, 5, 8, 13,
21, 34, 55, ... etc, onde o próximo número é igual a soma dos dois anteriores.
Escreva um programa que gere os dez primeiros números da série de
Fibonacci, utilizando estruturas repita e do...while.
*/
            int number=0, ultimo=1, penultimo=1, fibonacci;
        do{
            fibonacci = ultimo + penultimo;
            penultimo = ultimo;
            ultimo=  fibonacci;
            System.out.println(fibonacci);
            number++;

        }while(number< 10);




    }
}
