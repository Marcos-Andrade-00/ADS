package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Informe o valor da bolsa em reais");
       int bolsa = sc.nextInt();
       System.out.println("Informe o tempo de estagio em anos");
       int tempo = sc.nextInt();
       if (bolsa >= 750 && bolsa<950 && tempo >= 2 ){
           System.out.println("Participara do treinamento");
           
       }
       else{
           System.out.println("Nao participara");
       }
    }
    
}
  
        
    
    

