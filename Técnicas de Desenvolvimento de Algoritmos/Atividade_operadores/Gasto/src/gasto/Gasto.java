package gasto;
import java.util.Scanner;
public class Gasto {

    public static void main(String[] args) {
        double pagar;
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o gasto do cliente: ");
        double gasto = sc.nextDouble();
        pagar = gasto + (gasto * 0.10);
        System.out.println("O total a ser pago é: R$ " + pagar);
        
        
                

    }
    
}
