package exercicio1;
import java.util.Scanner;
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe a operação pretendida \n 1- SOMA \n 2 - SUBTRAÇÃO \n 3 -DIVISÃo \n 4- MULTIPLICAÇÃO  ");
        int op = sc.nextInt();
        switch (op){
            case 1: System.out.println("Voce escolheu soma"); 
            break;
            case 2: System.out.println("Voce escolheu subtração"); 
            break;
            case 3: System.out.println("Voce escolheu divisão") ;
            break;
            case 4: System.out.println("Voce escolheu multiplicação");
            break;
            default: System.out.println("Opcão invalida ");
    }
    
}
}