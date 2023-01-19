package Vetores;

public class Exercicio1 {
    public static void main(String[] args) {
        /*
        Faça um programa que preencha três vetores com dez posições cada
um: o primeiro vetor, com os nomes de dez produtos; o segundo vetor,
com os códigos dos dez produtos; e o terceiro vetor, com os preços dos
produtos. Mostre um relatório apenas com o nome, o código, o preço e o
novo preço dos produtos que sofrerão aumento. Sabe-se que os
produtos que sofrerão aumento são aqueles que possuem código par ou
preço superior a R$ 1.000,00. Sabe-se ainda que, para os produtos que
satisfizerem às duas condições anteriores, código e preço, o aumento
será de 20%; para aqueles que satisfizerem apenas à condição do
código, o aumento será de 15%; e para aqueles que satisfizerem apenas
à condição de preço, o aumento será de 10%.
         */

        String nomes[] = new String[10];
        int codigos[] = new int[10];
        double precos[] = new double[10];

        for(int i=0;i < 2; i++){
            System.out.println("Digite o nome do produto: ");
            nomes[i] = System.console().readLine();
            System.out.println("Digite o codigo do produto: ");
            codigos[i] = Integer.parseInt(System.console().readLine());
            System.out.println("Digite o preço do produto ");
            precos[i] = Integer.parseInt(System.console().readLine());


            if(codigos[i]%2==0 && precos[i]>1000){
               // precos[i]*=120/100;
                precos[i] = precos[i]*120/100;
            }else if(codigos[i]%2==0){
                precos[i]= precos[i]*115/100;
               // precos[i]*=115/100;
            }else if(precos[i]>1000){
               // precos[i]*=110/100;
                precos[i]= precos[i]*110/100;
            }
        }
        for(int i=0; i< nomes.length; i++){
            System.out.println(nomes[i] + " " + precos[i] + " " + codigos[i]);

        }


    }
}
