package media_quatro_valores;
import java.util.Scanner;
public class Media_quatro_valores {

    public static void main(String[] args) {
    double media;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o 1º valor: ");
    double n1 = sc.nextDouble();
    System.out.println("Digite o 2º valor: ");
    double n2 = sc.nextDouble();
    System.out.println("Digite o 3º valor: ");
    double n3 = sc.nextDouble();
    System.out.println("Digite o 4º valor: ");
    double n4 = sc.nextDouble();
    media = (n1+n2+n3+n4)/4;
    System.out.println("A média dos valores é: " + media);
    
    
    }
    
}
