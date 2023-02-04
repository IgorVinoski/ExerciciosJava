package Procedimentos_Funcoes_Metodos;

public class Exercicio4 {
  /*
  Crie um procedimento que receba como parâmetro um vetor A de 25
números inteiros e substitua todos os valores negativos de A por zero.
Faça também um programa que leia um vetor, chame o procedimento
para alterar os valores negativos desse vetor para zero e depois mostre
o vetor resultante
   */

    static void par(int vetA[]){
        for(int i=0;i<25;i++){
            if(vetA[i] < 0 ){
                vetA[i]=0;
            }
        }
    }

    public static void main(String[] args) {
        int vetB[]={1, 2, 3, 4, 5, 6, 7, 8, -1, 2,3,5,6,7,8,9,10,12,14,15, -21, -22, -32, 24, 25};

        par(vetB);

        for (int i =0; i<25; i++){
            System.out.println(vetB[i]);
        }
    }
}
