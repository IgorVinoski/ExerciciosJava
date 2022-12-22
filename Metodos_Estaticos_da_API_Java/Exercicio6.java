package Metodos_Estaticos_da_API_Java;

public class Exercicio6 {
    /*Escreva um programa em Java que simule o lançamento de um dado,
ou seja, sorteie um número entre 1 e 6.*/

    public static void main(String[] args){

        System.out.println("A face do dado sorteada foi a "+ (int)(1 + Math.random()*6 ) );
    }
}
