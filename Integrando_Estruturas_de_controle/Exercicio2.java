package Integrando_Estruturas_de_controle;

import java.util.Locale;

public class Exercicio2 {

    public static void main(String[] args){

/* Faça um programa que receba o tipo de ação, ou seja, uma letra qualquer a ser
comercializada na bolsa de valores, o preço de compra e o preço de venda de
cada ação e que calcule e mostre:
 a quantidade de ações com lucro superior a R$ 1.000,00;
 a quantidade de ações com lucro inferior a R$ 200,00.
Finalize com o tipo de ação ‘F’.


 */

        int  lucro_superior = 0, lucro_inferior=0;
        char tipo;
        double preco_compra, preco_venda;

        System.out.println("Digite o tipo de ação: ");
        tipo = System.console().readLine().charAt(0);
        while (tipo != 'F'){

            System.out.println("Digite o preço de compra: ");
            preco_compra = Double.parseDouble(System.console().readLine());
            System.out.println("Digite o preço de venda: ");
            preco_venda = Double.parseDouble(System.console().readLine());
            System.out.println("Digite o tipo de ação: ");
            tipo = System.console().readLine().toUpperCase(Locale.ROOT).charAt(0);

            if(preco_venda-preco_compra> 1000){
                lucro_superior++;
            }else if(preco_venda-preco_compra < 200){
                lucro_inferior++;
            }


        }
        System.out.println("A quantidade de ações com o lucro superior a 1000 foi de: "+ lucro_superior);
        System.out.println("A quantidade de ações com o lucro inferior a 200 foi de: " + lucro_inferior);





    }
}
