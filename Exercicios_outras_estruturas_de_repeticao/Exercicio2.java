package Exercicios_outras_estruturas_de_repeticao;

public class Exercicio2 {
    /*O Detran deseja realizar uma vistoria geral nos veículos do estado. Para
isso, elaborou a seguinte distribuição, a partir do último dígito do número na
placa do automóvel:
 Placas que terminam com 0 devem realizar a vistoria em Janeiro
do próximo ano
 Placas que terminam com 1 devem realizar a vistoria em
Fevereiro do próximo ano
 Placas que terminam com 2 devem realizar a vistoria em Março
do próximo ano
 Placas que terminam com 3 devem realizar a vistoria em Abril do
próximo ano
 Placas que terminam com 4 devem realizar a vistoria em Maio do
próximo ano
 Placas que terminam com 5 devem realizar a vistoria em Junho
do próximo ano
 Placas que terminam com 6 devem realizar a vistoria em
Setembro deste ano
 Placas que terminam com 7 devem realizar a vistoria em Outubro
deste ano
 Placas que terminam com 8 devem realizar a vistoria em
Novembro deste ano
 Placas que terminam com 9 devem realizar a vistoria em
Dezembro deste ano
Escreva um algoritmo (utilizando escolha) e um programa em Java (utilizando
switch) que, a partir do número da placa de um veículo (um inteiro de 4 dígitos),
mostrem em qual mês ele deve realizar a vistoria. DICA: para obter o último
dígito da placa obtenha o resto a divisão dela por 10*/
    public static void main(String[] args) {
        int placa;
        double res;

        System.out.println("Digite os 4 digitos da placa do veículo: ");
        placa = Integer.parseInt(System.console().readLine());
        res = placa % 10;
        switch ((int) res){
            case 0:
                System.out.println("A vistoria deve ser realiada em JANEIRO");
                break;
            case 1:
                System.out.println("A vistoria deve ser realiada em FEVEREIRO");
                break;
            case 2:
                System.out.println("A vistoria deve ser realiada em MARÇO");
                break;
            case 3:
                System.out.println("A vistoria deve ser realiada em ABRIL");
                break;
            case 4:
                System.out.println("A vistoria deve ser realiada em MAIO");
                break;
            case 5:
                System.out.println("A vistoria deve ser realiada em JUNHO");
                break;
            case 6:
                System.out.println("A vistoria deve ser realiada em SETEMBRO");
                break;
            case 7:
                System.out.println("A vistoria deve ser realiada em OUTUBRO");
                break;
            case 8:
                System.out.println("A vistoria deve ser realiada em NOVEMBRO");
                break;
            case 9:
                System.out.println("A vistoria deve ser realiada em DEZEMBRO");
                break;

        }
    }
    }
