package mediaponderada;
import java.util.Scanner;
public class Mediaponderada {

    public static void main(String[] args) {
    double ponderada;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite o 1º valor: ");
    double n1 = sc.nextDouble();
    System.out.println("Digite o 2º valor: ");
    double n2 = sc.nextDouble();
    System.out.println("Digite o 3º valor: ");
    double n3 = sc.nextDouble();
    ponderada = ((n1*1) + (n2*2) + (n3*4)) / (1+2+4);
    System.out.println("A média ponderada das notas é: " + ponderada);
    }
    
}
