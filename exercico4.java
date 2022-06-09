class exercicio4 {
   /* (4) Construa um programa que leia três valores para os lados de um
triângulo (A, B e C). O programa deve verificar se os lados fornecidos
formam realmente um triângulo. Em caso positivo, deve mostrar a
mensagem “Os lados formam um triângulo” e caso contrário “Os valores
informados não podem formar um triângulo”. Para que três valores de
lados formem um triângulo, cada par de lados somados não pode ser
menor ou igual ao terceiro lado..

 um de seus lados deve ser maior que o valor absoluto (módulo) da diferença dos outros dois lados e menor que a soma dos outros dois lados.





Só irá existir um triângulo se, somente se, os seus lados obedeceram à seguinte regra: um de seus lados deve ser maior que o valor absoluto (módulo) da diferença dos outros dois lados e menor que a soma dos outros dois lados. Veja o resumo da regra abaixo: Não pare agora.
*/
  public static void main(String[] args) {
    int ladoa, ladob, ladoc;
  
  System.out.print("Informe o primeiro lado:(lado a) ");
          ladoa = Integer.parseInt(System.console().readLine());
  System.out.print("Informe o primeiro lado:(lado b) ");
          ladob = Integer.parseInt(System.console().readLine());
  System.out.print("Informe o primeiro lado:(lado c) ");
          ladoc = Integer.parseInt(System.console().readLine());
  if(ladoa + ladob >= ladoc){
    System.out.println("Formam um triangulo");
  }else{
    System.out.println("Não formam um trinagulo"); 
  }

    

    
   
  }
}