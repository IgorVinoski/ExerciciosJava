class exercicio1 {
   /* (1) Faça um programa que leia dois valores numéricos inteiros e apresente
o resultado da diferença do maior valor pelo menor valor. Se os valores
forem iguais, o programa deve mostrar zero. */
  public static void main(String[] args) {
    int valora, valorb, valorc;
    valorc = 0;
   System.out.print("Informe o primeiro valor: ");
          valora = Integer.parseInt(System.console().readLine());
System.out.print("Informe o segundo valor valor: ");
          valorb = Integer.parseInt(System.console().readLine());
    
   if(valora > valorb){
     valorc= valora-valorb;
   }else if(valorb > valora){
     valorc= valorb-valora;
    
     
   }
    System.out.print(valorc);
  }
}