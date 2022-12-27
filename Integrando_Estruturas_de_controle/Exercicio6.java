package Integrando_Estruturas_de_controle;
/*
Faça um programa que mostre os conceitos finais dos alunos de uma turma de
75 pessoas, considerando a tabela a seguir. Para isso, a nota final e o código do
aluno deverão ser fornecidos pelo usuário. Ao final do programa, apresente a
quantidade de alunos e a média de nota alcançada para cada conceito.
tabela: https://prnt.sc/z-v4WgNhauyN






 */
public class Exercicio6 {
    public static void main(String[] args) {

        int nota, conceitoe = 0, quant_conceitoe = 0, conceitod = 0, quant_conceitod = 0, conceitoc = 0, quant_conceitoc = 0;
        int conceitob = 0, quant_conceitob = 0, conceitoa = 0, quant_conceitoa = 0;
        for (int i = 1; i <= 2; i++) {
            System.out.println("Digite a nota do aluno");
            nota = Integer.parseInt(System.console().readLine());


            if (nota <= 2.9) {
                conceitoe += nota;
                quant_conceitoe++;
            } else if (nota <= 4.9) {
                conceitod += nota;
                quant_conceitod++;
            } else if (nota <= 6.9) {
                conceitoc += nota;
                quant_conceitoc++;
            } else if (nota <= 8.9) {
                conceitob += nota;
                quant_conceitob++;
            } else {
                conceitoa += nota;
                quant_conceitoa++;
            }


        }




        System.out.println("A quantidade de alunos no conceito E: " + quant_conceitoe + "\n A média de notas no conceito E é de " + (quant_conceitoe != 0 ? (conceitoe / quant_conceitoe) : " Não tiveram alunos com essa nota"  ));
        System.out.println( "A quantidade de alunos no conceito D: " + quant_conceitod + " \n " +
        "A média de notas no conceito D é de " +( quant_conceitod != 0 ? (conceitod / quant_conceitod) : " Não tiveram alunos com essa nota"  ) );
        System.out.println("A quantidade de alunos no conceito C " + quant_conceitoc + " \n" +
        "A média de notas no conceito C é de " + ( quant_conceitoc != 0 ? (conceitoc / quant_conceitoc) : " Não tiveram alunos com essa nota"  ));
        System.out.println("A quantidade de alunos no conceito B " + quant_conceitob + " \n" +
        "A média de notas no conceito B " + ( quant_conceitob != 0 ? (conceitob / quant_conceitob) : " Não tiveram alunos com essa nota"  ));
        System.out.println( "A quantidade de alunos no conceito A: " + quant_conceitoa +" \n" +
        "A média de notas no conceito A " + ( quant_conceitoa != 0 ? (conceitoa / quant_conceitoa) : " Não tiveram alunos com essa nota"  ));




    }
}