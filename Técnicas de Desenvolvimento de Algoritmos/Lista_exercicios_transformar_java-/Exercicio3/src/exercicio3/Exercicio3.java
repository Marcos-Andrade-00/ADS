package exercicio3;
import java.util.Scanner;
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor total da compra");
        double preco = sc.nextDouble();
        System.out.println("Informe a quantidade de parcelas");
        int parcela =sc.nextInt();
        switch (parcela){
            case 2 -> System.out.println("Cada parcela sairá a R$" + (preco+(preco*0.03)));
            case 4 -> System.out.println("Cada parcela sairá a R$" + (preco+(preco*0.07)));
            case 6 -> System.out.println("Cada parcela sairá a R$" + (preco+(preco*0.09)));
            case 8 -> System.out.println("Cada parcela sairá a R$" + (preco+(preco*0.12)));
            default ->System.out.println("Opcção invalida" );
        
        
        
        
        }
        
        
        
        
    }
    
}
