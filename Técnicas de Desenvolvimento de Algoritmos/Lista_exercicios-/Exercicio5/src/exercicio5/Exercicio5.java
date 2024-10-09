package exercicio5;
import java.util.Scanner;
public class Exercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu salário:");
        int salario = sc.nextInt();
        System.out.println("Digite o numero de pendências:");
        int pen = sc.nextInt();
        
        if (salario > 2500 && pen < 2) {
            System.out.println("Empréstimo aprovado");
            System.out.println("Digite aqui o valor do empréstimo:");
            double vlr_emp = sc.nextDouble();
            System.out.println("E agora, a quantidade de parcelas que deseja: ");
            int qnt_parc = sc.nextInt();
            double vlr_parc = (vlr_emp + (vlr_emp * 0.9))/qnt_parc;
            double fin = (vlr_parc * qnt_parc);
            System.out.println("As parcelas irão ficar a: R$" + vlr_parc + "totalizando R$" + fin );
            
        }
        else {
            System.out.println("Empréstimo reprovado");
        }
    }
    
}
