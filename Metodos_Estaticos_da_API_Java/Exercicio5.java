package Metodos_Estaticos_da_API_Java;

public class Exercicio5 {
    /*Escreva um programa em Java que leia um número real qualquer e um
número de casas decimais (inteiro) e o arredonde o número real para o
número de casas especificado. Por exemplo, caso o usuário informe o
número 1,1379 e 2 casas decimais, o número seria arredondado para
1,14.
 */
    public static void main(String[] args){

        double n;
        int casas;
        System.out.println("Digite um numero real qualquer" );
        n = Double.parseDouble(System.console().readLine());

        System.out.println("Digite a quantidade de casas decimais" );
        casas = Integer.parseInt(System.console().readLine());
        System.out.println(Math.round(n * Math.pow(10, casas))/Math.pow(10, casas));



    }
}
