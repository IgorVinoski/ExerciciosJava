package Procedimentos_Funcoes_Metodos;

public class Exercicio2 {
    /*
    Faça um programa em Java que calcule e mostre o resultado da série:
    https://prnt.sc/rX8XffEHc9oy
    O valor de x deve ser informado pelo usuário. A série deve ser calculada
    até o 15º termo. Utilize o método definido no exercício 6 para o cálculo
    do fatorial.

     */

    public static void main(String[] args) {
        System.out.println("Digite o valor de X");
        int x = Integer.parseInt(System.console().readLine());

    int res =0;
        for (int i =0; i<15; i++){
            res +=  Math.pow(x, i)/f(i);
        }
    }


    public static long f(long x) {
        int k = 1;
        for(int i = 1; i <= x; i++) {
            k *= i;
        }
        return k;
    }
}
