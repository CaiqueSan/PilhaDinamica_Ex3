package view;

import javax.swing.JOptionPane;
import controller.ConverteController;

public class Principal {
	
	public static void main(String[] args) throws Exception {
		int a = 0;
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número de 0 a 1000:"));
		while (a > 1000) {
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número de 0 a 1000:"));
		}
		
		ConverteController b = new ConverteController();
		
		System.out.println(b.decToBin(a));
		
			
	}

}
