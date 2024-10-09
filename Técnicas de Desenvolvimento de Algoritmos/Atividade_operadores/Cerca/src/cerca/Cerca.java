package cerca;
import java.util.Scanner;
public class Cerca {

    public static void main(String[] args) {
        double cerca, catetos;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do lado a:");
        double a = sc.nextDouble();
        System.out.println("Digite o valor do lado b:");
        double b = sc.nextDouble();
        cerca = Math.sqrt((a*a)+(b*b));
        System.out.println("A cerca presisará ter: " + cerca + " metros");
    }
    
}
