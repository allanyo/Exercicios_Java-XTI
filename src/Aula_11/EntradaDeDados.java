package Aula_11;

import java.util.Scanner;


public class EntradaDeDados {
	


	public static void main(String[] args) 
	{
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Seja bem vindo "+ nome);
		
	}

}
