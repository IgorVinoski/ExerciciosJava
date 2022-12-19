package Exercicios_outras_estruturas_de_repeticao;

public class Exercicio1 {
    /*Escreva um algoritmo (utilizando escolha) e um programa em Java
(utilizando switch) que leiam três números inteiros que representam uma data
    com dia, mês e ano respectivamente. O programa deve escrever esta data da
    seguinte forma:
    dia de nome do mês de ano*/
    public static void main(String[] args){
        int n1,n2,n3;
        String mes = null;

        System.out.println("Digite primeiro número: ");
        n1 = Integer.parseInt(System.console().readLine());
        System.out.println("Digite o mes: ");
        n2 = Integer.parseInt(System.console().readLine());
        System.out.println("Digite terceiro número: ");
        n3 = Integer.parseInt(System.console().readLine());

        switch (n2){
            case 1:
                mes = "Janeiro";
                break;
            case 2:
                mes = "Fevereiro";
                break;
            case 3:
                mes = "Março";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Maio";
                break;
            case 6:
                mes = "Junho";
                break;
            case 7:
                mes = "Julho";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Setembro";
                break;
            case 10:
                mes = "Outubro";
                break;
            case 11:
                mes = "Novembro";
                break;
            case 12:
                mes = "Dezembro";
                break;
            default:
                System.out.println("O valor informado" + n2 + "não é um mês.");
        }
        System.out.println("Dia " + n1 + "de " + mes + "de " + n3);


    }

    }
