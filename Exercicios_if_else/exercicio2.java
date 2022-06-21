class exercicio2 {
   /* (2) Faça um programa que leia um valor numérico inteiro. O programa deve
apresentar a mensagem “O valor está na faixa permitida”, caso o valor
informado esteja entre 1 e 9. Se o valor estiver fora da faixa, o programa
deve apresentar a mensagem “O valor está fora da faixa permitida”. */
  public static void main(String[] args) {
    int valora;
  
   System.out.print("Informe um número inteiro ");
          valora = Integer.parseInt(System.console().readLine());

    
   
   if(valora >=1 || valora <= 9){
     System.out.println("O valor está dentro da faixa permitda");
   }else{
   System.out.println("O valor está fora da faixa permitida."); 
   
   }
   
  }
}