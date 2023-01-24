package Matriz;

public class Exercicio3 {
    public static void main(String[] args) {
        /*
         Crie um programa que preencha uma matriz 5 x 5 de números reais,
calcule e mostre a soma dos elementos da diagonal secundária.

         */
        int matriz[][] = new int[5][5];

        System.out.println(matriz.length);
        for(int linha=0;linha<matriz.length;linha++) {
            for (int coluna = 0; coluna < matriz[0].length; coluna++) {

                matriz[linha][coluna] = 1;
                System.out.println(coluna);
            }
        }


        int soma =0;
        for(int i= 4;i>=0;i--){

            soma+=matriz[4-i][i];
            System.out.println("A" + i);
        }





        System.out.println("aaaaaaaaaa" + soma);

    }
}