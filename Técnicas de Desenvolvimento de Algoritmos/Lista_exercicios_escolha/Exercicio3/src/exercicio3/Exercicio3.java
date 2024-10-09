package exercicio3;

import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número:  ");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número:  ");
        int num2 = sc.nextInt();
        System.out.println("Informe a operação pretendida \n 1- SOMA \n 2 - SUBTRAÇÃO \n 3 -DIVISÃo \n 4- MULTIPLICAÇÃO  ");
        int op = sc.nextInt();
        switch (op){
            case 1: System.out.println("A soma dos números é: " + (num1+num2));
            break;
            case 2: System.out.println("A subtração dos números é: " + (num1-num2));
            break;
            case 3: System.out.println("A divisão dos números é: " + (num1/num2));
            break;
            case 4: System.out.println("A multiplicação dos números é: " + (num1*num2));
            break;
            default: System.out.println("Opcão invalida ");

    }
    
}
}
