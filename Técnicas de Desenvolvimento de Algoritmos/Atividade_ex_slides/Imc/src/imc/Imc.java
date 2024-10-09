package imc;
import java.util.Scanner;
public class Imc {
    public static void main(String[] args) {
        double imc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o peso da pessoa (em Kg): ");
        double peso = sc.nextDouble();
        System.out.println("Digite a altua da pessoa (em metros): ");
        double altura = sc.nextDouble();
        imc = peso / (altura*altura);
        System.out.println(" IMC da pessoa é:" + imc + "(Kg/m²)");
        
    }
    
}
