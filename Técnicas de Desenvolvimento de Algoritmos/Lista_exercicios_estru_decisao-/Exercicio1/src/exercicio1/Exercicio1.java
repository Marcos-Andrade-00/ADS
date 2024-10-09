package exercicio1;
import java.util.Scanner;
public class Exercicio1 {
    
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Digite um número de 0 a 9");
       int num = sc.nextInt();
       if (num >= 0 && num < 10){
           System.out.println("valor correto");
           
       }
       else{
           System.out.println("valor incorreto");
       }
    }
    
}
