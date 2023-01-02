package Integrando_Estruturas_de_controle;

public class Exercicio11 {
    public static void main(String[] args) {
        /*
        Construa um programa em Java que seja capaz de concluir qual dentre os
        seguintes animais foi escolhido, através de perguntas e respostas. Animais
        possíveis: leão, cavalo, homem, macaco, morcego, baleia, avestruz pingüim,
        pato, águia, tartaruga, crocodilo e cobra.
    Exemplo:
    É mamífero? Sim.
    É quadrúpede? Sim.
    É carnívoro? Não.
    É herbívoro? Sim.
    Então o animal escolhido foi o cavalo
         */







        System.out.println("Opção: \n1. Mamífero \n2. Aves \n3. Répteis");

        int opcao = Integer.parseInt(System.console().readLine());

        switch (opcao){
            case 1:
                //Mamífero
                System.out.println("Opção Mamífero: \n1. Quadrúpedes \n2. Bípedes \n3. Voadores \n4. Aquáticos");
                int opcao_mam = Integer.parseInt(System.console().readLine());
                switch (opcao_mam){
                    case 1:

                        //Quadruptes
                        System.out.println("Opção Quadruptes: \n1. Carnivoros \n2. Herbívoros");
                        int opcao_quad = Integer.parseInt(System.console().readLine());
                        switch (opcao_quad){
                            case 1:
                                //carnivoros
                                System.out.println("LEÃO");
                                break;
                            case 2:
                                //herbivoros
                                System.out.println("CAVALO");
                                break;
                        }
                     break;
                    case 2:
                        //bipedes
                        System.out.println("Opção Bípedes: \n1. Onivaros \n2. Frutivaros");
                        int opcao_bipe = Integer.parseInt(System.console().readLine());
                        switch (opcao_bipe){
                            case 1:
                                //Onivaro
                                System.out.println("HOMEM");
                                break;
                            case 2:
                                //Frutivoros
                                System.out.println("MACACO");
                                break;
                        }
                        break;
                    case 3:
                        //voadores
                        System.out.println("MORCEGO");
                        break;
                    case 4:
                        //aquáticos
                        System.out.println("baleia");
                        break;

                }
            break;
            case 2:

                //Aves
                System.out.println("Opção Aves: \n1. Não-voadoras \n2. Nadadoras \n3. De rapina");
                int opcao_aves = Integer.parseInt(System.console().readLine());
                switch (opcao_aves){
                    case 1:
                        //Não voadoras
                        System.out.println("Opção Aves Não voadoras: \n 1. Tropicais \n2. Polares");
                        int opcao_aves_n_voo = Integer.parseInt(System.console().readLine());
                        switch (opcao_aves_n_voo){
                            case 1:
                                System.out.println("Avestrus");
                                break;
                            case 2:
                                System.out.println("Pinguim");
                                break;
                        }
                        break;
                    case 2:
                        //Nadadoras
                        System.out.println("PATO");
                        break;
                    case 3:
                        //de rapina
                        System.out.println("ÁGIA");
                        break;
                }
            break;
            case 3:
                System.out.println("Opção Répteis: \n1. Com casco \n2. Carnívoros \n3. Sem patas");
                int opcao_rep = Integer.parseInt(System.console().readLine());

                switch (opcao_rep){
                    case 1:
                        //com casco
                        System.out.println("TARTARUGA");
                        break;
                    case 2:
                        //carnivoros
                        System.out.println("CROCODILO");
                        break;
                    case 3:
                        //sem patas
                        System.out.println("COBRA");
                        break;
                }
            break;

        }
    }
}
