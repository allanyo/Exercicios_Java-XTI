package Aula_25;

import java.util.Random;
import java.util.Scanner;

public class Jogo_de_Dados {

	public static void main(String[] args) {
		

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Qual o seu plapite ? ");
		int palpite = entrada.nextInt();
				
		Random n = new Random();
		
		int dado = n.nextInt(6)+1;
		
		System.out.println("Palpite: "+ palpite);
		System.out.println("Dado: "+dado);
		
		if(palpite == dado)
		{
			System.out.println("Vc acertou");
		}
		else 
		{
			System.out.println("Vc Errou !!");
		}

	}

}
