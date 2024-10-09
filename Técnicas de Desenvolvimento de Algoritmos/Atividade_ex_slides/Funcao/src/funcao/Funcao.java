package funcao;
import java.util.Scanner;
public class Funcao {

    public static void main(String[] args) {
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o valor de x: ");
        int x = sc.nextInt();
        y= 3 + 2*x;
        System.out.println("Y=" + y );
    }
    
}
