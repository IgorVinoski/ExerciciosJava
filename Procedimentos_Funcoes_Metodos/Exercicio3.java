package Procedimentos_Funcoes_Metodos;

public class Exercicio3 {
    /*
    Crie um programa que gere e mostre os números primos de 1 a 100.
Utilize a função construída no exercício 7.

     */
    public static void main(String[] args) {
        for(int i =0; i<100; i++){
            if(primos(i))
                System.out.println(i);
        }
    }

    static boolean primos{
        for(int i=2;i<100;i++){
            if(i%2==0){
                return false;
            }
            return true;
        }
    }
}
