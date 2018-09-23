package Aula_22;

import java.util.ArrayList;

public class Array_List {
	//Aula sobre ArrayList
	// O arraylist é bem mais maleavel que o Array, permintindo add ou remover elementos
	/*NOVIDADES
	 * 
	 * get  -> retorna um elemento em espcial
	 * size - > retorna o tamanho do ArrayList
	 * toString -> Retorna tds os elementos do Array
	 * indexOf - >Retorna o indice de um elemento
	 * remove -> Remove elementos do ArrayList
	 */
	
	public static void main(String[] args)
	{
		ArrayList <String>cores = new ArrayList<String>();
		cores.add("Azul");
		cores.add("Verde");
		
		//System.out.println(cores.toString());
		
		cores.add("Amarelo");
		//System.out.println(cores.toString());
		
		for (int i =0; i < cores.size();i++)
			System.out.println(cores.get(i));
		System.out.println("\nTamanho do ArrayList: "+cores.size());
		
		cores.remove("Azul");
		for (int i =0; i < cores.size();i++)
			System.out.println(cores.get(i));
		
		System.out.println("Qual o indice da cor Amarelo:"+cores.indexOf("Amarelo"));
		
		
	}

}
