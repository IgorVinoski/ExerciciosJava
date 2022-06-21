class exercicio3 {
   /* (3) Construa um programa que leia três valores numéricos (representados
pelas variáveis A, B e C) e faça o cálculo do delta de uma equação de
segundo grau, segundo a fórmula de Báskara. O programa deve mostrar
quantas raízes reais a equação possui (delta < 0 – mostrar uma
mensagem dizendo que a equação não possui raízes reais, delta > 0 –
mostrar que possui duas raízes reais, delta = 0 – mostrar que possui
uma única raiz real). */
  public static void main(String[] args) {
    int valora, valorb, valorc;
    double delta;
  
  System.out.print("Informe o primeiro valor:(valor a) ");
          valora = Integer.parseInt(System.console().readLine());
  System.out.print("Informe o primeiro valor:(valor b) ");
          valorb = Integer.parseInt(System.console().readLine());
  System.out.print("Informe o primeiro valor:(valor c) ");
          valorc = Integer.parseInt(System.console().readLine());
  delta = (valorb^2)-4*valora*valorc;
    if(delta < 0){
      System.out.println("A equação não possui raízes reais");
    }else if(delta > 0){
      System.out.println("A equação possuí raizes reais");
    }else if(delta == 0){
      System.out.println("A equação possuí uma única raiz:" + delta);
    }

    

    

    
   
  }
}