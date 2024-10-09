package exercicio3;
import java.util.Scanner;
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do produto: R$");
        double vlr = sc.nextDouble();
        double desc = (vlr -(vlr*0.1));
        System.out.println("Valor com desconto: R$" +desc);
        
    }
    
}
