package exercicio6;
import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual seria o tipo de diaria: \n 1- Simples \n 2- Duplo \n 3-Triplo");
    int tipo = sc.nextInt();
    System.out.println("Quantas diarias deseja? ");
    int qnt = sc.nextInt();
    if (tipo == 1){
        System.out.println("O valor total será: R$" + (qnt*255.50));
    }
    else if (tipo==2){
        System.out.println("O valor total será: R$" + (qnt*305.50));
    }
    else if(tipo==3){
    System.out.println("O valor total será: R$" + (qnt*360.60));
    }
    else{
    System.out.println("Tipo de diária invalida");
    }
    }
    
}
