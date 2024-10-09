package exercicio5;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite seu peso em (kg): ");
    double peso = sc.nextDouble();
    System.out.println("Informe a sua altura em (metros) \n Ex: 1,82: ");
    double altura = sc.nextDouble();
    double imc= peso/(altura*altura);
    System.out.println("Seu imc é: " + imc);
    
    if (imc < 20){
       System.out.println("Abaixo do peso");
           
       }
          
    else if (imc < 25){
        System.out.println("Peso normal");
    }
    else if (imc < 30){
        System.out.println("Sobrepeso");}
    else if (imc < 40){
        System.out.println("obeso");
    }
     else {
       System.out.println("Obeso mórbido");
       }
}
}
