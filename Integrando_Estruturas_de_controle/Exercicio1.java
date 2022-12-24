package Integrando_Estruturas_de_controle;

public class Exercicio1 {
    public static void main(String[] args) {
        /*Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados os
dados de idade, sexo (M ou F), e salário. Faça um programa que leia essas
informações para cada habitante, calcule e mostre:
 a média dos salários do grupo;
 a maior e a menor idade do grupo;
 a quantidade de mulheres com salário até R$ 1500,00;
 a idade e o sexo da pessoa que possui o menor salário.
Finalize a entrada de dados ao ser digitada uma idade negativa.
*/
        char sexo, sexo_menor_salario = 0;
        int masculino = 0, feminino = 0, Msalario_milequinenhtos = 0, menor_idade = -1, maior_idade = -1, idade_menor_salario = -1;
        double salario = 0, soma_salario = 0, menor_salario = -1;
             int i=0, idade;

        System.out.println("Digite a idade: ");
        idade = Integer.parseInt(System.console().readLine());
        menor_idade = idade;
        System.out.println("Digite o salário: ");
        salario = Double.parseDouble(System.console().readLine());
        soma_salario += salario;
        menor_salario = salario;
        while (idade>0){
            System.out.println("Digite o salário: ");
            salario = Double.parseDouble(System.console().readLine());
            soma_salario += salario;
            System.out.println("Digite o sexo: M para masculino ou F para feminino ");
            sexo = System.console().readLine().charAt(0);

            if (sexo == 'M') {
                masculino++;
                if (salario <= 1500) {
                    Msalario_milequinenhtos++;
                }
            } else if (sexo == 'F') {
                feminino++;
            }


            if (idade > maior_idade) {
                maior_idade = idade;
            }

            if (menor_idade > idade) {
                menor_idade = idade;
            }


            if (menor_salario > salario) {
                menor_salario = salario;
                idade_menor_salario = idade;
                sexo_menor_salario = sexo;
            }

            i++;


            System.out.println("Digite a idade: ");
            idade = Integer.parseInt(System.console().readLine());
        }

        System.out.println("A média dos salários é de:" + (soma_salario / i));
        System.out.println("A menor idade é de" + menor_idade + "\n "+ "A maior idade é de: " + maior_idade);
        System.out.println("A quantidade de mulheres com salário menor que 1500 é de " + Msalario_milequinenhtos);
        System.out.println("A idade da pessoa que possuí o menor salário é de: " + idade_menor_salario + "\n " + "E o sexo é: " + sexo_menor_salario);






    }
}