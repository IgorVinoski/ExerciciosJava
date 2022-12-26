package Integrando_Estruturas_de_controle;

public class Exercicio4 {

    public static void main(String[] args){
        /*Enunciado:
        A empresa PowerSoftware Ltda. possui 58 funcionários e pretende processar
sua folha de pagamento de forma informatizada. Para isso, é necessário
construir um programa que leia o salário de cada funcionário da empresa e
calcule os descontos de imposto de renda e INSS de acordo com as tabelas
abaixo e também uma porcentagem fixa correspondente ao plano de saúde
que é de 4,5% do valor do salário. O programa também deve:
a. calcular o valor do salário líquido de cada um dos 58 funcionários;
b. calcular o valor total da folha de pagamento (soma dos salários de todos
os funcionários);
c. calcular o valor total do imposto de renda que a empresa deverá
recolher.
De acordo com as informações disponíveis no site da Receita Federal, a tabela
de alíquotas do imposto de renda para o ano de 2018 é:
Tabela: https://prnt.sc/ETaQ1cZUJ7Bb
         */



        double salario, soma_salario=0, recolher=0;




        for (int i =0; i<3; i++){
            System.out.println("Digite o salário ");
            salario = Double.parseDouble(System.console().readLine());
            if(salario<=1903.98){

                if(salario<=1693.72){
                    soma_salario+=(salario*92/100);
                }else if(salario>1693.72 && salario<2882.9){
                    soma_salario+=(salario*(91/100));
                }

            }else if(salario>=1903.98 && salario<=2826.65){
                if(salario<=2822.90) {
                    soma_salario += ((salario*92.5/100) - (salario*9/100));
                }else{
                    soma_salario += ((salario *92.5/100) - salario*11/100);
                }
                recolher+=salario*7.5/100;

            }else if(salario>=2826.65 && salario<=3751.05){
                soma_salario+=(salario*85/100 - salario*11/100 );
                recolher+=salario*15/100;
            }else if(salario>=3751.05 && salario <= 4664.68){
                soma_salario+=(salario*77.5/100 - salario*11/100);
                recolher+=(salario*22.5/100);
            }else {
                soma_salario+=(salario*72.5/100 - salario*11/100);
                recolher+=(salario*27.5/100);
            }




        }




        System.out.println("A soma do salário líquido é de "+ soma_salario );
        System.out.println("A soma de imposto de renda recolhido deverá ser de" + recolher);


    }
}
