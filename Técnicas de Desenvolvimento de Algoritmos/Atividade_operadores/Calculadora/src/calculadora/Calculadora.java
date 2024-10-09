package calculadora;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
    double soma,sub, multi,div, resto;
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite um numero inteiro: ");
    double num1 = sc.nextDouble();
    System.out.println("Digite outro numero inteiro: ");
    double num2 = sc.nextDouble();
    soma = num1+num2;
    System.out.println("A soma dos numeros é: " + soma);
    sub = num1-num2;
    System.out.println("A subtração entre os numeros é: " + sub);
    multi = num1*num2;
    System.out.println("A multiplicação entre os numeros é: " + multi);
    div = num1/num2;
    System.out.println("A divisão entre os numeros é: " + div);
    resto = num1%num2;
    System.out.println("O resto da divisão entre os numeros é: " + resto);
    }
    
}
