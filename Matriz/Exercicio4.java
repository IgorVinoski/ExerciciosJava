package Matriz;

public class Exercicio4 {
    public static void main(String[] args) {
        /*
        A prefeitura da cidade A realizou um concurso para seleção de técnicos
em informática. O concurso consistiu em uma prova contendo dez
questões objetivas com cinco alternativas cada (A, B, C, D ou E). Ao
todo, dez candidatos fizeram as provas.
Faça um programa em Java que leia uma matriz 10x10 contendo as
respostas de todos os candidatos. Cada linha da matriz conterá as
respostas de um candidato à cada uma das questões. O programa
também deve ler um vetor de 10 posições contendo o gabarito da prova.
Ao final, o programa deve mostrar o total de pontos obtidos por cada
candidato.
         */
        char respostas[][]= new char[10][10];
        for(int c=0;c<respostas.length;c++){
            for(int r=0;r<respostas.length;r++){
                respostas[c][r]= 'B';
            }
        }

        char gabarito[] = new char[10];

        for(int g=0;g<gabarito.length;g++){
            gabarito[g]= 'B';
        }


        for(int i=0; i<10;i++){
            int res =0;
            for(int k=0;k<10;k++){
                if(respostas[i][k] == gabarito[k]){
                    res++;

                }

            }
            System.out.println("O candidato " + i + " acertou " + res + " respsotas");
        }



    }
}
