package Procedimentos_Funcoes_Metodos;

public class Exercicio1 {
    /*
    Escreva um programa em Java que calcule e escreva a soma dos
    termos da série:
    https://prnt.sc/VnOIFwVb4f0l

    Defina um método para o cálculo do fatorial para ser usado neste
exercício.
     */

    public static int f(int x) {
        int k = 1;
        for(int i = 1; i <= x; i++) {
            k *= i;
        }
        return k;
    }


    public static void main(String[] args) {
        int soma=0;
        for(int i =1; i<100; i++){

            for(int c =100; c>=80;c--){
               soma += c/f(i);
            }
        }
    }
}
