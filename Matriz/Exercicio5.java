package Matriz;

public class Exercicio5 {
    public static void main(String[] args) {
        /*
        Faça um programa que receba:
             as notas de 15 alunos em cinco provas diferentes e armazene-as
            em uma matriz 15 x 5;
             os nomes dos 15 alunos e armazene-os em um vetor de 15
            posições.
            O programa deverá calcular e mostrar, para cada aluno, o nome, a
            média aritmética das cinco provas e a situação (aprovado, reprovado ou
            exame). Um estudante estará aprovado se atingiu média maior ou igual
            a sete, estará reprovado se atingiu média inferior a dois e em exame se
            atingiu média entre 2 e 7
         */
        int notas[][]= new int[15][5];

        String nomes[] = new String[5];
        int soma=0;
        for(int n = 0; n<15;n++){
            System.out.println("Digite o nome do aluno ");
            nomes[n]= System.console().readLine();
            for(int p=0; p<5;p++){
                System.out.println("Digite a nota do aluno "+ nomes[n] + "na prova " + p);
                notas[n][p]= Integer.parseInt(System.console().readLine());
                soma+=notas[n][p];
            }
            System.out.println("A média do aluno " + nomes[n] + " é de " + (soma/5));
            if(soma/5>7){
                System.out.println(nomes[n] + " está APROVADO.");
            }
        }
    }
}
