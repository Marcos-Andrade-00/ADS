package exercicio5;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Informe sua idade: ");
       int idade = sc.nextInt();
       if (idade <16){
       System.out.println("Não eleitor");    
       }
       else if (  16 >= idade && idade <= 18  || idade > 65  ){
       System.out.println("Eleitor facultativo");
       }
       else if (  idade >= 18 && idade <= 65 ){
       System.out.println("Eleitor Obrigatorio");
       }
        else {
       
       
       }
}
}
