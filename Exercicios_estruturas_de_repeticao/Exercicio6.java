package Exercicios_estruturas_de_repeticao;
/*      Para cada uma das mercadorias com que um armazém trabalha dispõese dos seguintes dados:
        − o nome da mercadoria;
        − o seu preço unitário;
        − a quantidade total vendida no mês.
        Elabore um programa para calcular o faturamento total mensal do armazém. O
        faturamento total do armazém será calculado somando-se o total faturado por
        cada mercadoria, que é igual a quantidade vendida da mercadoria vezes o seu
        preço unitário. O número de mercadorias comercializadas pelo armazém deve
        ser informado pelo usuário.*/
public class Exercicio6 {
    public static void main(String[] args) {
        int mercadorias_comercializadas, preco, quantidade, faturamento=0, i=0;
        String mercadorias;

        System.out.println("Digite o número de mercadorias comercializadas pelo armazém:");
        mercadorias_comercializadas = Integer.parseInt(System.console().readLine());

        while(i<mercadorias_comercializadas){
            i++;
            System.out.println("Digite o nome da mercadoria ");
            mercadorias =  System.console().readLine();
            System.out.println("Digite o preço da " + mercadorias);
            preco = Integer.parseInt(System.console().readLine());
            System.out.println("Digite a quantidade da " + mercadorias);
            quantidade = Integer.parseInt(System.console().readLine());
            faturamento += quantidade*preco;

        }
        System.out.println("O faturamento mensal das " + i + " mercadorias foi de " + faturamento );

    }
    }
