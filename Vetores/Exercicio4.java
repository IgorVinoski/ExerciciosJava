package Vetores;

public class Exercicio4 {
    public static void main(String[] args) {
        /*
        Faça um programa que leia dois vetores (A e B) com cinco posições.
Cada vetor deverá armazenar números inteiros. O programa deve,
então, subtrair o primeiro elemento de A do último de B, acumulando o
valor; subtrair o segundo elemento de A do penúltimo de B, acumulando
o valor, e assim por diante. Ao final, mostre o resultado de todas as
subtrações realizadas.

         */
        int A[] = new int[5];
        int B[] = new int[5];

        int sub =0;
        for(int i =0; i<5; i++){
            System.out.println("A: Digite o " + (i+1) +"° valor");
            A[i] = Integer.parseInt(System.console().readLine());

            System.out.println("B: Digite o " + (i+1) +"° valor");
            B[i] = Integer.parseInt(System.console().readLine());


        }

        for(int i=0; i<5; i++){
            sub+=A[i]-B[4-i];

        }
        System.out.println(sub);

    }
}
