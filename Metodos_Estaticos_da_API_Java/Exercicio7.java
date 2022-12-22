package Metodos_Estaticos_da_API_Java;

public class Exercicio7 {
    /* Faça um programa que recebe dois números e execute uma das
    operações listadas a seguir, de acordo com a escolha do usuário. Se for
    digitada uma opção inválida, mostre uma mensagem avisando sobre
    isso e termine a execução do programa. As opções são:
            1. O primeiro número elevado ao segundo número.
2. Raiz quadrada de cada um dos números.
3. Raiz cúbica de cada um dos números
    */


    public static void main(String[] args){
        int n1, n2, escolha;

        System.out.println("Digite o primeiro número: ");
        n1 = Integer.parseInt(System.console().readLine());
        System.out.println("Digite o segundo número: ");
        n2 = Integer.parseInt(System.console().readLine());


        System.out.println("Escolha uma das opções: \n" +
                "1. O primeiro número elevado ao segundo número. \n" +
                "2. Raiz quadrada de cada um dos números.\n" +
                "3. Raiz cúbica de cada um os números.");
        escolha = Integer.parseInt(System.console().readLine());

        switch (escolha){
            case 1:
                System.out.println(Math.pow(n1, n2));
                break;
            case 2:
                System.out.println(Math.sqrt(n1) + " e "+ Math.sqrt(n2));
                break;
            case 3:
                System.out.println(Math.cbrt(n1) + " e "+ Math.cbrt(n2));
                break;
            default:
                System.out.println("Opção inválida.");
        }



    }
}
