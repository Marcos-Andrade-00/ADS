package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
       System.out.println("Informe a primeira nota: ");
       double n1 = sc.nextDouble();
       System.out.println("Informe a segunda nota: ");
       double n2 = sc.nextDouble();
       double media = (n1+n2)/2;
       if (media>= 6){
       System.out.println("Aprovado");
           
       }
          
    
    else {
       System.out.println("Reprovado");
       }
}
}
  
