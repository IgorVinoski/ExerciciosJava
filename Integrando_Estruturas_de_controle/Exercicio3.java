package Integrando_Estruturas_de_controle;

import java.util.Locale;

public class Exercicio3 {
    /*
   Enunciado: A empresa JS Recrutamento e Seleção Ltda. faz recrutamento e seleção de
    funcionários para várias empresas em diversos ramos de atuação. Para facilitar
    o trabalho de identificação do perfil dos candidatos que se inscrevem para as
    vagas, resolveu fazer um programa para registrar alguns dados para obter as
    informações a seguir:
    a. número de candidatos do sexo feminino;
    b. número de candidatos do sexo masculino;
    c. idade média dos homens;
    d. idade média das mulheres com experiência
    Faça um programa para calcular as informações solicitadas anteriormente,
    sabendo que para cada candidato devem ser informados sexo (M ou F), idade e
    tempo de experiência profissional (em anos). Também considere que a cada
    iteração deverá ser perguntado ao usuário se deseja cadastrar outro candidato
    ou não. Quando a resposta for negativa, os resultados deverão ser
    apresentados.




        ENTRADA:
        SEXO
        IDADE
        EXPERIENCIA - EM ANOS -

        DESEJA CADASTRAR OUTRO CANDIDATO?


        SAIDA:
        NUMERO DE CANDIDATOS FEM
        NUMERO DE --         MAS
        IDADE MEDIA MAS
        IDADE MEDIA FEM COM EX
     */


    public static void main(String[] args){


        char sexo, novo_candidato;
        int idade, experiencia, candidatas=0,candidatos=0, soma_idadeM=0, soma_idadeFexperiencia=0, quantidade_fexperiencia=0;

        do{
            System.out.println("-------------------- CADASTRO CANDIDATO -------------------- \n REGISTRE AS INFORMAÇÕES DOS CANDIDATOS NOS PASSOS SEGUINTES:");
            System.out.println("Digite o sexo do candidato: \n F para Feminino e M para Masculino.");
            sexo = System.console().readLine().charAt(0);
            System.out.println("Digite a idade do candidato: ");
            idade = Integer.parseInt(System.console().readLine());
            System.out.println("Digite o tempo de experiência do candidato, em anos. ");
            experiencia = Integer.parseInt(System.console().readLine());

            if(sexo == 'F'){
                candidatas++;
                if(experiencia>0){
                    soma_idadeFexperiencia+=idade;
                    quantidade_fexperiencia++;
                }
            }else if(sexo =='M'){
                candidatos++;
                soma_idadeM+=idade;
            }


            System.out.println("Você deseja cadastrar um novo candidato?\n S para SIM \n N para NÃO");
            novo_candidato = System.console().readLine().toUpperCase(Locale.ROOT).charAt(0);
        }while (novo_candidato == 'S');
        System.out.println("O número de candidatos é de " + candidatos + "\n " + "O número de candidatas é de " + candidatas);
        System.out.println("A idade média dos homens é de " +  (soma_idadeM/candidatos));
        System.out.println("A média de idade das mulhers com experiência é de " + (soma_idadeFexperiencia/quantidade_fexperiencia));


    }
}
