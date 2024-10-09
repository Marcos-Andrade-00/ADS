package exercicio1;
import java.util.Scanner;
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a distância percorrida (em km):");
        double km = sc.nextDouble();
        System.out.println("Digite a quantidade de combustível consumido (em litros):");
        double cons = sc.nextDouble();
        double med = km/cons;
        System.out.println("O consumo médio é: "+ med + " km/l");
        
        
    }
    
}
