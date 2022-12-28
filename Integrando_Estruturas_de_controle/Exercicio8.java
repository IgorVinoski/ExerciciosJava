package Integrando_Estruturas_de_controle;

public class Exercicio8 {
    public static void main(String[] args) {
        /*
        Em uma eleição presidencial existem quatro candidatos. Os votos são
        informados por meio de um código. Os códigos utilizados são:
            https://prnt.sc/fw5XZ5ONeO1Z

       Faça um programa que calcule e mostre:
         o total de votos para cada candidato;
         o total de votos nulos;
         o total de votos em branco;
         a percentagem de votos nulos sobre o total de votos;
         a percentagem de votos em branco sobre o total de votos.
        Para finalizar o conjunto de votos, tem-se o valor zero e, para códigos inválidos,
        o programa deverá mostrar uma mensagem.

         */

        int voto, quant_um=0, quant_dois=0, quant_tres=0, quant_quatro=0, quant_nulo=0, quant_branco=0;
        do{
            System.out.println("---------------\n" +
                    "ESCOLHA ENTRE OS CANDIDATOS: \n" +
                    "1. O UM \n" +
                    "2. O DOIS \n" +
                    "3. O TRES \n" +
                    "4. O QUATRO\n" +
                    "5. VOTO NULO \n" +
                    "6. VOTO EM BRANCO");

            voto = Integer.parseInt(System.console().readLine());

            switch (voto){
                case 1:
                    quant_um++;
                    System.out.printf("O CANDIDATO ESCOLHIDO FOI O UM. VOTO CONFIRMADO.");
                    break;
                case 2:
                    quant_dois++;
                    System.out.printf("O CANDIDATO ESCOLHIDO FOI O DOIS. VOTO CONFIRMADO.");
                    break;
                case 3:
                    quant_tres++;
                    System.out.printf("O CANDIDATO ESCOLHIDO FOI O TRES. VOTO CONFIRMADO.");
                    break;
                case 4:
                    quant_quatro++;
                    System.out.printf("O CANDIDATO ESCOLHIDO FOI O QUATRO. VOTO CONFIRMADO.");
                    break;
                case 5:
                    quant_nulo++;
                    System.out.printf("VOTO ANULADO.");
                    break;
                case 6:
                    quant_branco++;
                    System.out.printf("VOTO EM BRANCO.");
                    break;
                default:
                    System.out.println("-------ELEIÇOES-------");
                    break;
            }

        }while(voto != 0);
        System.out.println("A QUANTIDADE DE VOTOS NO CANDIDATO 1 "+ quant_um);
        System.out.println("A QUANTIDADE DE VOTOS NO CANDIDATO 2 "+ quant_dois);
        System.out.println("A QUANTIDADE DE VOTOS NO CANDIDATO 3 "+ quant_tres);
        System.out.println("A QUANTIDADE DE VOTOS NO CANDIDATO 4 "+ quant_quatro);
        System.out.println("A QUANTIDADE DE VOTOS NULOS "+ quant_nulo);
        System.out.println("A QUANTIDADE DE VOTOS EM BRANCO "+ quant_branco);

        System.out.println("A PORCENTAGEM DE VOTOS NULOS " + (double) quant_nulo/(quant_nulo+quant_um+quant_dois+quant_tres+quant_quatro+quant_branco)*100);
        System.out.println("A PORCENTAGEM DE VOTOS BRANCOS " + (double) quant_branco/(quant_nulo+quant_um+quant_dois+quant_tres+quant_quatro+quant_branco)*100);



    }
}
