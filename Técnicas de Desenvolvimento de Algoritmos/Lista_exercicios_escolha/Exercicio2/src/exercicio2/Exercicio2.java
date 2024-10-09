package exercicio2;
import java.util.Scanner;
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Infome a placa do seu carro:  ");
        String placa = sc.nextLine();
        if(placa.length()==7){int ultimo = Character.getNumericValue(placa.charAt(6));
       /* Foi ultilizado o metodo "length()" para determinar o tamanho da String e o 
        metodo "Character.getNumericValue()" para determinar o caractere a ser lido  */
        switch (ultimo){
            case 1,2: System.out.println("O rodizio do seu veículo sera toda segunda-feira ");
            break;
            case 3,4: System.out.println("O rodizio do seu veículo sera toda terça-feira ");
            break;
            case 5,6: System.out.println("O rodizio do seu veículo sera toda quarta-feira");
            break;
            case 7,8: System.out.println("O rodizio do seu veículo sera toda quinta-feira ");
            break;
            case 9,0: System.out.println("O rodizio do seu veículo sera toda sexta-feira " );
            break;
            default: System.out.println("Opcão invalida ");
    }
    
}
}
}