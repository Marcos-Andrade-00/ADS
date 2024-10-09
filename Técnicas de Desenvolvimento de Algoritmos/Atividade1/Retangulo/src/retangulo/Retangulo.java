
package retangulo;
import javax.swing.JOptionPane;

//Autor: Marcos Celio de Andrade 1B//
public class Retangulo {
    //Definição da classe//
    public static void main(String[] args) {
        double perim, area;
		double ladoA = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o lado A:"));

		double ladoB = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o lado B:"));

		perim = 2*ladoA + 2*ladoB;
		JOptionPane.showMessageDialog(null, "O perimetro do triângulo é: " + perim + "cm");

		area = ladoA * ladoB;
		JOptionPane.showMessageDialog(null, "A area do triângulo é: " + area + "cm²");
    }
    
}
