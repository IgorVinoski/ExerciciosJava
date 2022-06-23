class exercicio10 {
   /* (10).A nota final de um estudante é calculada a partir de três notas
atribuídas, respectivamente, a um trabalho de laboratório, a uma
avaliação semestral e a um exame final. A média das três notas
mencionadas obedece aos pesos a seguir:
*/
public static void main(String[] args) {
 int nota1, nota2, nota3, notafinal;
    System.out.println("Informe a primeira nota");
     nota1 = Integer.parseInt(System.console().readLine());

  System.out.println("Informe a segunda nota");
     nota2 = Integer.parseInt(System.console().readLine());

  System.out.println("Informe a terceira nota");
     nota3 = Integer.parseInt(System.console().readLine());

    
  nota1 = nota1 *2;
  nota2 = nota2*3 ;
  nota3 = nota3*5;

  notafinal = (nota1+nota2+nota3)/(2+3+5);

  System.out.println("A nota final é: " + notafinal);


  if(notafinal >= 8){
    System.out.println("Conceito A");
    
  }else if(notafinal < 8 &&  notafinal >= 7){
    System.out.println("Conceito B");
  }else if(notafinal < 7 && notafinal >= 6){
    System.out.println("Conceito C");
  }else if(notafinal < 6 && notafinal >= 5){
    System.out.println("Conceito D");
  }else if(notafinal < 5 && notafinal >= 0){
    System.out.println("Conceito E");
  }
   
  }
}
