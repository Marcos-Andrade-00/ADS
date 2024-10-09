package cilindro;
import java.util.Scanner;
public class Cilindro {

    public static void main(String[] args) {
        double area, volume;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor da altura do cilindro: ");
        double h = sc.nextDouble();
        System.out.println("Digite o valor do raio do cilindro: ");
        double r = sc.nextDouble();
        area = Math.PI *(r*r);
        System.out.println("A area do cilindro é: " +area);
        volume = area * h;
        System.out.println("O volume do cilindro é: " +volume);
        
    }
    
}
