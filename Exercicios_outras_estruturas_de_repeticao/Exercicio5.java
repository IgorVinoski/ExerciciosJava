package Exercicios_outras_estruturas_de_repeticao;

public class Exercicio5 {
    /*Crie um programa para ler a quantidade de litros de combustível e a
distância percorrida por um carro em várias viagens. O programa deve
calcular o consumo médio do carro, que é igual a média de quilômetros
por litro de todas as viagens. O número de viagens realizado deve ser
informado pelo usuário.
*/
    public static void main(String[] args){
        int litros, distancia, cons_medio=0, quil_medio, lit_medio, viagens;
        System.out.println("Digite o número de viagens");
        viagens = Integer.parseInt(System.console().readLine());

        for(int i=1; viagens >=i; i++){
            System.out.println("Informa a quantidade de litros na viagem " + i);
            litros = Integer.parseInt(System.console().readLine());
            System.out.println("Informa a distância na viagem " + i);
            distancia = Integer.parseInt(System.console().readLine());
            lit_medio = litros/i;
            quil_medio = distancia/i;
            cons_medio = quil_medio/lit_medio;
        }

        System.out.println("O consumo médio foi de: " + cons_medio + " quilometros por litro.");


    }
}
