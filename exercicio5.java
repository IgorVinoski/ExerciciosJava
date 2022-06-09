class exercicio5 {
   /* (5) Desenvolva um programa que leia quatro valores numéricos inteiros e
mostre os valores que são divisíveis por 2 e 3.
*/
  public static void main(String[] args) {
    int a, b, c;
  
  System.out.print("Informe o primeiro valor ");
          a = Integer.parseInt(System.console().readLine());
  System.out.print("Informe o segundo valor ");
          b = Integer.parseInt(System.console().readLine());

 if(a/2 == 0){
     System.out.print("É divisível por 2");

 }
if(a/3 == 0){
  System.out.print("É divisível por 3");

 }
     if(b/2 == 0){
     System.out.print("É divisível por 2");

 } if(b/3 == 0){
     System.out.print("É divisível por 3");

 }
    

    
   
  }
}