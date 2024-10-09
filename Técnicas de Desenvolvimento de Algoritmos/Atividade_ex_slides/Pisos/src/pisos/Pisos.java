package pisos;
import java.util.Scanner;
public class Pisos {
    public static void main(String[] args) {
        double area, custo, caixas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a largura da area a ser revestida: ");
        double larg = sc.nextDouble();
        System.out.println("Digite o comprimento da area a ser revestida: ");
        double comp = sc.nextDouble();
        System.out.println("Digite o valor unitário do piso escolhido: ");
        double uni = sc.nextDouble();
        area = larg * comp;
        caixas = (area) / 2.5;
        custo = caixas * uni;
        System.out.println("Serão necessarias: " + caixas + " caixas para cobrir toda a area e isto custara: R$ " + custo);
        
        
    }
    
}
