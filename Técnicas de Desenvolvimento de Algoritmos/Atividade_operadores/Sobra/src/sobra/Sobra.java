package sobra;
import java.util.Scanner;
public class Sobra {

    public static void main(String[] args) {
       int c;
       Scanner sc = new Scanner (System.in);    
       System.out.println("Digite o valor do lado A: ");
       int a = sc.nextInt();
       System.out.println("Digite o valor do lado B: ");
       int b = sc.nextInt();
       c = a % b;
       System.out.println("O resto da divisão é: " + c);
              

    }
    
}
