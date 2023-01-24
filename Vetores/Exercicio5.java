package Vetores;

public class Exercicio5 {
    public static void main(String[] args) {
        /*
        Faça um programa que leia um vetor com 20 posições contendo
        números inteiros. Logo após, divida todos os seus elementos pelo maior
        valor do vetor e os armazene em outro vetor. Mostre, ao final, os valores
        armazenados em todas as posições do vetor após os cálculos
         */


        int numeros[]=new int[3];
        double divididos[]= new double[3];
        int maior =0;
        for(int i=0; i<3; i++){
            System.out.println("A: Digite o " + (i+1) +"° valor");
            numeros[i]= Integer.parseInt(System.console().readLine());

            if(numeros[i]>maior || numeros[i]>numeros[i-1]){
                maior=numeros[i];
            }



        }
        System.out.println("O maior valor é: " + maior);
        for(int i=0; i<3;i++){

            divididos[i] = numeros[i]/maior;
            System.out.println(divididos[i]);
            System.out.println(numeros[0]);
        }



    }

}
