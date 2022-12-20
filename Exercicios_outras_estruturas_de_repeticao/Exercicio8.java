package Exercicios_outras_estruturas_de_repeticao;

public class Exercicio8 {
    /*Faça um algoritmo e um programa, utilizando as estruturas repita e do..while
que repita a leitura de uma senha até que o usuário digite o número 1234. Após
isso, mostrar a mensagem “Senha correta, acesso liberado.”
*/
    public static void main(String[] args){
         int senha;
        do{
            System.out.println("Digite a senha: ");
            senha = Integer.parseInt(System.console().readLine());
        }while(senha != 1234);

    }


}
