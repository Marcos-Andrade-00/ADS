package exercicio5_;

import java.util.Scanner;

public class Exercicio5_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Selecione o o tipo de passagem:");
        System.out.println("\n 1- Ida \n 2- Ida e volta ");
        int opc = sc.nextInt();
        System.out.println("Infome o o destino desejado:");
        System.out.println("\n 1- Região Norte \n 2 - Região Nordeste \n 3- Região Centro-Oeste \n 4- Região Sul ");
        int dest = sc.nextInt();
        switch (opc) {
            case 1:
                switch(dest){
                    case 1 -> System.out.println(" A passagem de ida custará: R$ 500 ");
                    case 2 -> System.out.println(" A passagem de ida custará: R$ 350 ");
                    case 3 -> System.out.println(" A passagem de ida custará: R$ 350 ");
                    case 4 -> System.out.println(" A passagem de ida custará: R$ 600 ");
                    default -> System.out.println("Opcão invalida ");
                    
                }  
                break;
            case 2:
                switch(dest){
                    case 1 -> System.out.println(" A passagem de ida e volta custará: R$ 900 ");
                    case 2 -> System.out.println(" A passagem de ida e volta custará: R$ 650 ");
                    case 3 -> System.out.println(" A passagem de ida e volta custará: R$ 600 ");
                    case 4 -> System.out.println(" A passagem de ida e volta custará: R$ 550 ");
                    default -> System.out.println("Opcão invalida ");
                  
            
        }
    }
}
}