package Aula_20;



public class ArraySimples {

	public static void main(String[] args)
	{
		//tipo + [] nomeDoArray
		String [] paises = {"Brasil","Agentina","Uruguai","Peru"};
		int [] numeros = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i = 0; i < paises.length; i++)
			System.out.println(paises[i]);
		System.out.println();
		for (int i = 0; i < numeros.length; i++)
			System.out.print(" "+ numeros[i]);
			
	}

}
