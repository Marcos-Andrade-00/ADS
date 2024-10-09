package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Informe a quantidade de horas"
               + " trabalhadas");
       double horas = sc.nextDouble();
       System.out.println("Informe o seu turno de seriço: \n 1- Diurno \n 2- Noturno");
       int turno = sc.nextInt();
       if (turno == 2 ){
           System.out.println("Sua diaria sera de R$ " + (horas * 45));
           
       }
       else{
           System.out.println("Sua diaria sera de R$ " + (horas*37.50));
       }
    }
    
}
    


