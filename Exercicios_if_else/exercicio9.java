class exercicio9 {
   /* (9)Uma empresa decide dar um aumento de 30% aos funcionários cujo
salário é inferior a 5000. Escreva um programa que possa ser utilizado
para efetuar o cálculo do salário reajustado de um funcionário, a partir
do valor do salário informado pelo usuário.
*/
public static void main(String[] args) {
 double salario;
    System.out.println("Informe o valor do salário");
     salario = Integer.parseInt(System.console().readLine());

    
if(salario < 5000){
  salario = salario*1.3;
}
    System.out.println("O novo salário é de:" +salario);
}
    
   
  }
