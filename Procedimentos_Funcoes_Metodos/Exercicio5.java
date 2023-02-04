package Procedimentos_Funcoes_Metodos;

public class Exercicio5 {
   /*
        Escreva uma função que receba dois números inteiros e retorne o MMC
deles. Faça um programa que calcule a soma de duas frações. Para
isso, o programa deve pedir ao usuário que informe o valor do
numerador e do denominador de cada fração. Considerando que n1 é o
numerador da primeira fração, d1 é o denominador da primeira fração,
n2 é o numerador da segunda fração e d2 é o denominador da segunda
fração, o resultado da soma será:
https://prnt.sc/NEvh4xTY16bf
onde dr é o denominador do resultado e nr é o numerador do resultado.

    */
   static int mmc(int a, int b) {
       int result = Math.max(a,b);
       while(result % a != 0 || result % b != 0) {
           result += Math.max(a,b);
       }
       return result;
   }


    public static void main(String[] args) {
        System.out.println("Informe primeiro denominador: ");
        int d1 = Integer.parseInt(System.console().readLine());
        System.out.println("Informe o primeiro numerador: ");
        int n1 = Integer.parseInt(System.console().readLine());



        System.out.println("Informe segundo denominador: ");
        int d2 = Integer.parseInt(System.console().readLine());
        System.out.println("Informe o segundo numerador: ");
        int n2 = Integer.parseInt(System.console().readLine());

        int dr = mmc(d1,d2);

        int res = ((dr/d1)*n1)+((dr/d2)*n2);

        System.out.println(res + "/ " + dr);
    }
}
