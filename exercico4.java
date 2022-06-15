class exercicio4 {
   /* (4) Construa um programa que leia três valores para os lados de um
triângulo (A, B e C). O programa deve verificar se os lados fornecidos
formam realmente um triângulo. Em caso positivo, deve mostrar a
mensagem “Os lados formam um triângulo” e caso contrário “Os valores
informados não podem formar um triângulo”. Para que três valores de
lados formem um triângulo, cada par de lados somados não pode ser
menor ou igual ao terceiro lado..

*/
  public static void main(String[] args) {
    int ladoa, ladob, ladoc;
  
  System.out.print("Informe o primeiro lado:(lado a) ");
          ladoa = Integer.parseInt(System.console().readLine());
  System.out.print("Informe o primeiro lado:(lado b) ");
          ladob = Integer.parseInt(System.console().readLine());
  System.out.print("Informe o primeiro lado:(lado c) ");
          ladoc = Integer.parseInt(System.console().readLine());
  if((ladoa + ladob >= ladoc) && (ladob + ladoc >= ladoa) && (ladoc + ladoa >= ladob)){
    System.out.println("Formam um triangulo");
  }else{
    System.out.println("Não formam um trinagulo"); 
  }

    

    
   
  }
}