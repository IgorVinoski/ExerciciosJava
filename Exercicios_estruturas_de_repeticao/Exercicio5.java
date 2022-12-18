package Exercicios_estruturas_de_repeticao;
/*Crie um programa para ler a quantidade de litros de combustível e a
        distância percorrida por um carro em várias viagens. O programa deve
        calcular o consumo médio do carro, que é igual a média de quilômetros
        por litro de todas as viagens. O número de viagens realizado deve ser
        informado pelo usuário.*/
public class Exercicio5 {
    public static void main(String[] args){
        int litros=0, distancia=0, cons_Medio=0, media_km=0, media_l=0, viagens, i=0;
        System.out.println("Digite o número de viagens:");
        viagens = Integer.parseInt(System.console().readLine());

        while(i<viagens){
            System.out.println("Digite a quantidade de litros de comubstível consumidos:");
            litros += Integer.parseInt(System.console().readLine());
            System.out.println("Digite a distância percorrida:");
            distancia += Integer.parseInt(System.console().readLine());
            i++;
            media_km += distancia/i;
            media_l += litros/i;
            cons_Medio= media_km/media_l;

        }
        System.out.println("O consumo médio foi de " + cons_Medio + "km/L");



    }
}
