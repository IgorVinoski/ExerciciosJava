package Metodos_Estaticos_da_API_Java;

public class Exercicio2 {
    /*Escreva um programa em Java que mostre os números os números de 0
a 100 e seus correspondentes em binário.*/
    public static void main(String[] args){
        for(int i = 0; i <= 100; i++){
            System.out.println("O número é: " + i + "\n e seu valor em binário é: " + Integer.toBinaryString(i));
        }
    }
}
