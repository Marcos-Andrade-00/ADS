package exercicio4;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        double delta, x, y;
        Scanner sc = new Scanner (System.in);    
        System.out.println("Digite o valor de a: ");
        double a = sc.nextDouble();
        System.out.println("Digite o valor de b: ");
        double b = sc.nextDouble();
        System.out.println("Digite o valor de c: ");
        double c = sc.nextDouble();
        delta = (b*b)- (4*a*c);
        if(delta >= 0 ){
        System.out.println("o valor de delta e: " + delta);
        x = ((-1 * b) + Math.sqrt(delta))/(2 * a);
        y = ((-1 * b) - Math.sqrt(delta))/(2 * a);
        System.out. println("as raizes sao: " + x + " e " + y );
    }
        else{
            System.out.println("O delta tem valor negativo, logo nao sera possivel calcular sua raiz");
        
        }
    }
    
}
