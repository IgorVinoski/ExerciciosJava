package Integrando_Estruturas_de_controle;

public class Exercicio13 {
    public static void main(String[] args) {
        /*
        As Ilhas Weblands formam um reino independente nos mares do Pacífico.
            Como é um reino recente, a sociedade é muito influenciada pela informática. A
            moeda oficial é o Bit; existem notas de B$ 50,00, B$10,00, B$5,00 e B$1,00.
            Você foi contratado(a) para ajudar na programação dos caixas automáticos de
            um grande banco das Ilhas Weblands.
            Os caixas eletrônicos das Ilhas Weblands operam com todos os tipos de
            notas disponíveis, mantendo um estoque de cédulas para cada valor (B$ 50,00,
            B$10,00, B$5,00 e B$1,00). Os clientes do banco utilizam os caixas eletrônicos para
            efetuar retiradas de um certo número inteiro de Bits.
            Sua tarefa é escrever um algoritmo e um programa que, dado o valor de
            Bits desejado pelo cliente, determinem o número de cada uma das notas
            necessário para totalizar esse valor, de modo a minimizar a quantidade de cédulas
            entregues. Por exemplo, se o cliente deseja retirar B$50,00, basta entregar uma
            única nota de cinquenta Bits. Se o cliente deseja retirar B$72,00, é necessário
            entregar uma nota de B$50,00, duas de B$10,00 e duas de B$1,00. Notas cuja
            quantidade for zero não devem ser mostradas.
            Todos os caixas iniciam sua operação com um número de 100 notas de cada
            valor. O programa não deve permitir saques que utilizam mais notas do que o
            contido no caixa. Além disso, o valor máximo que pode ser sacado a cada retirada é
            de B$ 1000,00.
            O programa deve permitir que o usuário entre com diversos valores, até
            que ele digite um número negativo ou atinja o número limite de saques, que é de
            100. A cada saque, o número de notas no caixa de cada valor deve ser
            decrementado de acordo com o valor retirado.
            Ao final, o algoritmo/programa deve mostrar o total de cada nota que resta
            no caixa. Como exemplo, consideremos um caso em que três saques foram feitos,
            no valor de 100, 20 e 7 bits. O relatório deveria mostrar:
            Restam 98 notas de B$ 50, 98 notas de B$ 10, 99 notas
            de R$ 5 e 98 notas de B$ 1
         */

        int caixa_50 = 100, caixa_10 = 100, caixa_5 = 100, caixa_1 = 100;

        int valor_saque;
        int quant_caixa;
        do {
            System.out.println("Digite o valor que você quer sacar: ");
            valor_saque = Integer.parseInt(System.console().readLine());

            if (valor_saque > 1000) {
                System.out.println("O valor máximo para saque é 1000 bits");
            }

            if (valor_saque >= 50) {
                caixa_50--;
                valor_saque -= 50;
            }
            if (valor_saque > 10) {
                caixa_10--;
                valor_saque -= 10;
            }
            if (valor_saque > 5) {
                caixa_5--;
                valor_saque -= 5;

            }
            quant_caixa = caixa_1 + caixa_10 + caixa_50 + caixa_5;
        } while ((quant_caixa > 0 && valor_saque >= 0));
        System.out.println(caixa_50);
        System.out.println(valor_saque);

    }
}
