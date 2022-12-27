package Integrando_Estruturas_de_controle;

public class Exercicio7 {
    public static void main(String[] args){
        /*
        Faça um programa que apresente o menu de opções a seguir:
            Menu de opções:
            1. Média Aritmética
            2. Média ponderada
            3. Sair
            Na opção 1, receber duas notas, calcular e mostrar a média aritmética deles.
            Na opção 2, receber três notas e seus respectivos pesos, calcular e mostrar a
            média ponderada.
            Na opção 3, sair do programa.
            Verifique a possibilidade de opção inválida, Neste caso, o programa deverá
            mostrar uma mensagem
         */




        int opcao, media_a = 0, media_p=0, peso=0, nota_p=0, peso_p=0;


        System.out.println("Escolhe entre as opções: \n1. Média Aritimética \n2. Média Ponderada \n3. Sair");
        opcao = Integer.parseInt(System.console().readLine());

        switch (opcao){
            case 1:
                for(int i = 0; i<2; i++){
                    System.out.println("Digite a nota");
                    media_a+=Integer.parseInt(System.console().readLine());


                }
                System.out.println("A MÉDIA DAS NOTAS FOI DE: " + (media_a/2));
                break;
            case 2:

                for(int i =0; i<3; i++){
                    System.out.println("Digite a nota");
                    int nota= Integer.parseInt(System.console().readLine());
                    System.out.println("Digite o peso da nota ");
                    peso= Integer.parseInt(System.console().readLine());
                    peso_p+= peso;


                    nota_p += nota*peso;
                    System.out.println(peso_p);
                    System.out.println(nota_p);

                }
                double res = nota_p/peso_p;
                System.out.print("A média das notas foi de " + res );
                break;
            case 3:
                System.out.println("SAINDO DO PROGRAMA");
                break;
            default:
                System.out.println("NENHUMA OPÇÃO SELECIONADA, SAINDO DO PROGRAMA");
                break;
        }


    }
}
