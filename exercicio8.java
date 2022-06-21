class exercicio8 {
   /* (8)Faça um programa que leia três valores numéricos inteiros, identifique e
apresente o menor valor informado.
*/
  public static void main(String[] args) {
 int a, b, c;
    System.out.println("Informe o primeiro valor");
     a = Integer.parseInt(System.console().readLine());
 System.out.println("Informe o segundo valor");
     b = Integer.parseInt(System.console().readLine());
     System.out.println("Informe o terceiro valor");
     c = Integer.parseInt(System.console().readLine());
    
if(a < b &&  a<c){
  System.out.println("o primeiro número "+ a + " é menor");
}else if(b < a && b < c){
    System.out.println("o primeiro número "+ b + " é menor");

}else if(c<a && c<b){
    System.out.println("o primeiro número "+ c + " é menor");

}
    
   
  }
}