package area;
import java.util.Scanner;
public class Area {

    public static void main(String[] args) {
        double c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da altura: ");
        double a = sc.nextDouble();
        System.out.println("Digite o valor da base: ");
        double b = sc.nextDouble();
        c = (a + b) / 2;
        System.out.println("A area do triangulo é: " + c + "cm²");
    }
    
}
