package Vetores;

public class Exercicio3 {
    public static void main(String[] args) {
        /*
        Faça um programa que receba o nome de oito clientes de uma
videolocadora e armazene-os em um vetor. Em um segundo vetor,
armazene a quantidade de DVDs locados em 2017 por cada um dos oito
clientes. Sabe-se que, para cada dez locações, o cliente tem direito a
uma locação grátis. Faça um programa que mostre o nome de todos os
clientes, com a quantidade de locações grátis a que ele tem direito.


         */
        String nome[]= new String[8];
        int quantidade[]= new int[8];
        for(int i=0; i<nome.length; i++){
            System.out.println("Digite o nome " + (i+1) + "° cliente" );
            nome[i]= System.console().readLine();
            System.out.println("Digite a quantidade de DVDs locados pelo cliente " + (i+1));
            quantidade[i]= Integer.parseInt(System.console().readLine());

            if(quantidade[i]>10){
                System.out.println("O cliente: "+ nome[i] +  " tem direito a: "+  (quantidade[i]/10) + " locações grátis" );
            }
        }

    }
}
