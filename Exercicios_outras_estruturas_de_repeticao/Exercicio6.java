package Exercicios_outras_estruturas_de_repeticao;

public class Exercicio6 {
    /*Para cada uma das mercadorias com que um armazém trabalha dispõese dos seguintes dados:
− o nome da mercadoria;
− o seu preço unitário;
− a quantidade total vendida no mês.
Elabore um programa para calcular o faturamento total mensal do armazém. O
faturamento total do armazém será calculado somando-se o total faturado por
cada mercadoria, que é igual a quantidade vendida da mercadoria vezes o seu
preço unitário. O número de mercadorias comercializadas pelo armazém deve
ser informado pelo usuário.*/

    public static void main(String[] args){
        int n_mercadorias, quantidade_mercadoria;
        double preco_mercadoria;
        String nome_mercadoria;

        System.out.println("Digite o número de mercadorias vendidas pelo armazém:");
        n_mercadorias = Integer.parseInt(System.console().readLine());

        for(int i=1; i<n_mercadorias; i++){
            System.out.println("Digite o nome da mercadoria " + i );
            nome_mercadoria = System.console().readLine();

            System.out.println("Digite o preço da mercadorai " + nome_mercadoria);
            preco_mercadoria = Double.parseDouble(System.console().readLine());

            System.out.println("Digite a quantidade vendida de " + nome_mercadoria);


        }
    }
}
