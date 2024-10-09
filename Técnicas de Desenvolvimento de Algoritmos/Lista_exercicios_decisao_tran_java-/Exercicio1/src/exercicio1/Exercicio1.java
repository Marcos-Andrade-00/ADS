package exercicio1;

import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Digite um número inteiro: ");
       int num = sc.nextInt();
       if (num%2==0){
       System.out.println("O numero: " + num + " é par ");
           
       }
          
    
    else {
       System.out.println("Este numero não é par");
       }
}
}