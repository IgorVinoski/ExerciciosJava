package Matriz;

public class Exercicio1 {
    public static void main(String[] args) {
        /*
        Elabore um programa que preencha uma matriz 6 x 4, calcule e
armazene o maior elemento de cada linha e multiplique cada linha por
seu respectivo maior elemento. Mostre a matriz resultante.
         */

        int matriz[][] = new int[6][4];

       for(int linha=0; linha<6;linha++){
           for(int coluna=0;coluna<4;coluna++){
               System.out.println("Informe o valor da linha " + linha + " coluna " + coluna);
               matriz[linha][coluna]=Integer.parseInt(System.console().readLine());
           }
        }

       int maior =0;
       for(int linha=0; linha<6;linha++){

           for(int coluna=0; coluna<4;coluna++) {
               if (maior < matriz[linha][coluna]) {
                   maior = matriz[linha][coluna];
               }

               matriz[linha][coluna]*=maior;
           }


       }

        for(int linha=0; linha<6;linha++){
            for(int coluna=0;coluna<4;coluna++){
                System.out.println(matriz[linha][coluna]);
            }
        }

    }
}
