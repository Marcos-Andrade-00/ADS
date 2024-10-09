package exercicio4;

import java.util.Scanner;

public class Exercicio4 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Informe a primeira nota do aluno:");
        double n1 = sc.nextDouble();
        System.out.println("Informe a segunda nota do aluno");
        double n2 =sc.nextDouble();
        System.out.println("Informe o tipo de média \n 1- Aritmética \n 2-Ponderada");
        int tipo =sc.nextInt();
        switch (tipo){
            case 1 -> System.out.println("A media aritmetica deste aluno sera:" + (n1+n2)/2);
            case 2 -> System.out.println("A media ponderada deste aluno sera" + ((n1*3)+(n2*7))/10);
            default ->System.out.println("Opcção invalida" );
        
        
        
        
        }
        
        
        
        
    }
    
}
