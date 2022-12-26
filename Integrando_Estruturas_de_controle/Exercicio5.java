package Integrando_Estruturas_de_controle;

public class Exercicio5 {
    public static void main(String[] args){
        /* Foi realizada uma pesquisa de algumas características físicas da população de
            certa região, a qual coletou os seguintes dados referentes a cada habitante
            para serem analisados:
             sexo (M ou F);
             cor dos olhos (1 – azuis, 2 – verdes, 3 – castanhos);
             cor dos cabelos (L – louros, C – castanhos, P – pretos, R - ruivos);
             idade;
             altura;
             peso.
            Escreva um programa que leia essas informações para cada pessoa e apresente
            a média da idade dos participantes, a média do peso e da altura de seus habitantes, a
            porcentagem de pessoas do sexo feminino, a porcentagem de pessoas do sexo
            masculino e quantas pessoas possuem olhos azuis e cabelos ruivos. A cada iteração
            deverá ser perguntado ao usuário se deseja continuar ou não. Os resultados deverão
            ser mostrados apenas quando o usuário não desejar mais inserir dados.

         */

        char sexo, continuar;
        int quant_azuis_ruivo = 0, quant_f=0, quant_m = 0, peso, altura, idade, soma_idade = 0, soma_altura = 0, soma_peso = 0, cor_olhos, cor_cabelo;
        int quant_olhos_azuis=0, quant_olhos_verdes=0, quant_olhos_castanhos=0, i=0,  quant_cabelos_louros=0, quant_cabelos_reuivos=0, quant_cabelos_castanhos=0;
        do{
            System.out.println("Digite o sexo. \nF para feminino \nM para masculino");
            sexo= System.console().readLine().charAt(0);
            System.out.println("Digite a cor dos olhos: \n1 azul \n2 verdes \n3 castanhos");
            cor_olhos=Integer.parseInt(System.console().readLine());
            System.out.println("Digite a idade");
            idade = Integer.parseInt(System.console().readLine());
            soma_idade+=idade;
            System.out.println("Digite o peso");
            peso = Integer.parseInt(System.console().readLine());
            soma_peso+=peso;

            System.out.println("Digite a altura");
            altura = Integer.parseInt(System.console().readLine());
            soma_altura+=altura;

            System.out.println("Digite a cor dos cabelos: \nL louro \nC castanho \nR ruivos");
            cor_cabelo=System.console().readLine().charAt(0);
            if(sexo=='M'){
                quant_m++;
            }else if(sexo=='F'){
                quant_f++;
            }
            switch (cor_olhos){
                case 1:
                    quant_olhos_azuis++;
                    if(cor_cabelo=='R')
                        quant_azuis_ruivo++;
                    break;
                case 2:
                    quant_olhos_verdes++;
                    break;
                case 3:
                    quant_olhos_castanhos++;
            }
           if(cor_cabelo=='L'){
               quant_cabelos_louros++;
           }else if(cor_cabelo=='C'){
               quant_cabelos_castanhos++;
           }else if(cor_cabelo =='R'){
               quant_cabelos_reuivos++;


            }
            i++;
            System.out.println("Deseja continuar? \nS para continuar \nN para não continuar");
            continuar = System.console().readLine().charAt(0);
        }while (continuar =='S');
        System.out.println("A média de idade é de: "+ soma_idade/i);
        System.out.println("A média de peso é de: "+ soma_peso/i);
        System.out.println("A média de altura é de: "+ soma_altura/i);


        System.out.println("A porcentagem de mulheres é de " + quant_f/i*100);
        System.out.println("A porcentagem de homens é de " + quant_m/i*100);
        System.out.println("A quantidade de olhos azuis e cabelos ruivos é de " + quant_azuis_ruivo);



    }
}
