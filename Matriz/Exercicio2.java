package Matriz;

public class Exercicio2 {
    public static void main(String[] args) {
        /*
        . Faça um programa que preencha e mostre a média dos elementos da
diagonal principal de uma matriz 10 x 10.

         */

        int matriz[][]= new int[10][10];


        for(int i=0;i<matriz.length;i++){

            for(int c=0;c<matriz.length; c++){
                System.out.println("Digite o valor da linha " + i +" ° e coluna " + i);
                matriz[i][i]= Integer.parseInt(System.console().readLine());
            }




        }
        int media=0;
        for(int i=0;i<matriz.length;i++){
            media+=matriz[i][i];



        }
        System.out.println("A média dos elementos da diagonal principal é de: " + (media/matriz.length));

    }
}
