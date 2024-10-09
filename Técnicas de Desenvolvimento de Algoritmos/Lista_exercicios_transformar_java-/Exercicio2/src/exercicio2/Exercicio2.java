package exercicio2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Informe o dia da semana \n 1- Domingo \n 2 - segunda \n 3 -terça \n 4- quarta \n 5-quinta \n 6-sexta \n 7-sabado  ");
        int dia = sc.nextInt();
        System.out.println("Informe a quantidade de horas extras trabalhadas  ");
        int horas = sc.nextInt();
        int valor = 30;
        switch (dia){
            case 1,7: System.out.println("Esse funcionario ira receber R$ " + ((valor+(valor*0.5))*horas) + "de horas extras"); 
            break;
            case 2,3,4,5,6: System.out.println("Esse funcionario ira receber R$ " + (valor*horas) + "de horas extras"); 
            break;
            default: System.out.println("Opcão invalida ");
    }
    
}
}
