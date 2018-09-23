package Aula_12;

import javax.swing.JOptionPane;

public class entradaGrafica {

	public static void main(String[] args) {
		//pequenas janelas graficas atraves de JOptionPane
		
		String nome = JOptionPane.showInputDialog("Qual o seu nome: ");

		JOptionPane.showMessageDialog(null, "Seja bem vindo " +nome);

	}

}
