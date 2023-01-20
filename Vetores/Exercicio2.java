package Vetores;

public class Exercicio2 {
    public static void main(String[] args) {
        /* Faça um programa que receba cinco números e mostre a saída a seguir:
Digite o 1º número: 5
Digite o 2º número: 3
Digite o 3º número: 2
Digite o 4º número: 0
Digite o 5º número: 2
Os números digitados foram:
5 + 3 + 2 + 0 + 2 = 12
 */     int soma=0;
        int n[] = new int[5];

        for(int i=0; i<5; i++){
            System.out.println("Digite o " +  (i+1)  + "° número");
            n[i] = Integer.parseInt(System.console().readLine());
            soma+=n[i];



        }
        for(int i=0; i<5;i++)
        System.out.println("Os números digitados foram: "+ n[i]);

        System.out.println("A soma deles é: " + soma);
    }
}
