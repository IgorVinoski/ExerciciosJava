class exercicio7 {
   /* (7)Desenvolva um programa que leia três valores numéricos inteiros,
identifique e apresente o maior valor informado.
*/
  public static void main(String[] args) {
 int a, b, c;
    System.out.println("Informe o primeiro valor");
     a = Integer.parseInt(System.console().readLine());
 System.out.println("Informe o segundo valor");
     b = Integer.parseInt(System.console().readLine());
     System.out.println("Informe o terceiro valor");
     c = Integer.parseInt(System.console().readLine());
    
if(a > b &&  a>c){
  System.out.println("o primeiro número "+ a + " é maior");
}else if(b > a && b > c){
    System.out.println("o primeiro número "+ b + " é maior");

}else if(c>a && c>b){
    System.out.println("o primeiro número "+ c + " é maior");

}
    
   
  }
}