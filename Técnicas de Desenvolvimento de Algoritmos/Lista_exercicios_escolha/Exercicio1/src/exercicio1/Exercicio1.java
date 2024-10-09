package exercicio1;
import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Infome o cargo do funcionário: ");
        System.out.println("\n 1- Escriturario \n 2 - Secretario \n 3- Caixa \n 4- Gerente \n 5 - Diretor ");
        int cargo = sc.nextInt();
        System.out.println("Infome o salario atual do funcionário: ");
        double salario = sc.nextDouble();
        switch(cargo){
            case 1: System.out.println(" O novo salario desse Escriturario sera de: R$ " + (salario + (salario*0.50)));
            break;
            case 2: System.out.println(" O novo salario desse Secretario sera de: R$ " + (salario + (salario*0.35)));
            break;
            case 3: System.out.println(" O novo salario desse Caixa sera de: R$ " + (salario + (salario*0.20)));
            break;
            case 4: System.out.println(" O novo salario desse Gerente sera de: R$ " + (salario + (salario*0.10)));
            break;
            case 5: System.out.println(" O Diretor não recebera aumento " );
            break;
            default: System.out.println("Opcão invalida ");
            
        }
        
        
    }
    
}
