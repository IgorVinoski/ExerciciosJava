package Metodos_Estaticos_da_API_Java;

public class Exercicio3 {
    /*Escreva um programa em Java que leia um string contendo um número
em binário e o mostre em decimal na tela.*/
    public static void main(String[] args){
        System.out.println("Digite um número em binário");
        int n = Integer.parseInt(System.console().readLine());


        System.out.println(Integer.parseInt(String.valueOf(n), 2));
    }
}
