package Metodos_Estaticos_da_API_Java;

public class Exercicio4 {
/*Escreva um programa em Java que calcule as raízes de uma equação
de segundo grau utilizando a fórmula de Báskara. A equação de
segundo grau é uma equação no formato Ax2
+ Bx + C. O usuário deve
informar os valores para A, B e C.
*/



    public static void main(String[] args){

        int a, b, c;
        double x1,x2;

        System.out.println("Digite o valor de A: ");
        a = Integer.parseInt(System.console().readLine());
        System.out.println("Digite o valor de B: ");
        b = Integer.parseInt(System.console().readLine());
        System.out.println("Digite o valor de C: ");
        c = Integer.parseInt(System.console().readLine());

        double delta = deltaMath.sqrt(b * b - 4 * a * c);
        x1 = ((-b + delta)/2*a);
        x2 = ((-b - delta)/2*a);
        System.out.println("A raiz x1 é " + x1 + "\n A raiz x2 é " + x2);
    }
}
