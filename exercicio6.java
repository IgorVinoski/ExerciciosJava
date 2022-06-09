class exercicio6 {
   /* (6)Faça um programa que leia quatro valores numéricos inteiros e mostre
os valores que são divisíveis por 2 ou 3.
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