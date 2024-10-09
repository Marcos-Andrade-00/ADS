package radianos;
import java.util.Scanner;
public class Radianos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do angulo em graus: ");
        double angulo = Math.toRadians(sc.nextDouble());
        System.out.println("O valor do seno é: " + Math.sin(angulo) + "O valor do cosseno é: " +
        Math.cos(angulo) + "O valor da tangente é: " + Math.tan(angulo));
 
 
}
 
}


    
    

