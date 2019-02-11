package Condicionales;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		int operando1,operando2,suma,resta,mul,div;
		char operacion;
		
		operando1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer numero"));
		operando2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo numero"));
		
		operacion = JOptionPane.showInputDialog("Digite la operaion que desea realizar").charAt(0);
		
		
		switch (operacion) {
		case 'S':
		case 's':
			suma = operando1+operando2;
			JOptionPane.showMessageDialog(null, "La suma es " + suma);
			break;

		case 'r':
		case 'R':
			resta = operando1-operando2;
			JOptionPane.showMessageDialog(null, "La resta es" + resta);
			break;
			
		case 'd':
		case 'D':
			div = operando1/operando2;
			JOptionPane.showMessageDialog(null, "La division es " + div );
			break;
			
		case 'm':
		case 'M':
			mul = operando1*operando2;
			JOptionPane.showMessageDialog(null, "La multiplicaion es " + mul);
			break;
		
		default:
			break;
		}
		
			
	}
}
