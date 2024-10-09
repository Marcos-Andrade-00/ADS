package exercicio4;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe a media do aluno: ");
    double media = sc.nextDouble();
    System.out.println("Informe o percentual de frequencia: ");
    int freq = sc.nextInt();
    
    if (media < 6){
       System.out.println("Reprovado por nota");
           
       }
          
    else if (freq < 75){
        System.out.println("Reprovado por frequencia");
    }
    else {
       System.out.println("Aprovado");
       }
}
}
    
    

