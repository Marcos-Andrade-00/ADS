package exercicio2;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu salário:");
        int salario = sc.nextInt();
        System.out.println("Digite o numero de pendências:");
        int pen = sc.nextInt();
        
        if (salario > 2500 && pen < 2) {
            System.out.println("Empréstimo aprovado");
        }
        else {
            System.out.println("Empréstimo reprovado");
        }
        
        
    }
    
}
