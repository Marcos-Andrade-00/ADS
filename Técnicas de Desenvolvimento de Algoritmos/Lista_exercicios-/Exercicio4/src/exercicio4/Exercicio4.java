package exercicio4;
import java.util.Scanner;
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu \n ESCOLHA O NÚMERO DO SEU LANCHE \n [1] - Hamburguer \n [2] - Cachorro-quente\n [3] - Batata Frita");
        int pedido = sc.nextInt();
        switch(pedido){
            case 1-> System.out.println("Voce escolheu Hamburguer \n Valor a pagar: R$ 10,00");
            case 2-> System.out.println("Voce escolheu Cachorro-quente \n Valor a pagar: R$ 7,00");
            case 3-> System.out.println("Voce escolheu Batata frita \n Valor a pagar: R$ 5,00");
            default->System.out.println("Opção invalida");
        }
    }
    
}
