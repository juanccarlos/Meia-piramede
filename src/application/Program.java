package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		List<Integer> lista = new ArrayList<Integer>();
		List<Integer> listaValores = new ArrayList<Integer>();

		String quantidade;

		System.out.print("digite quantos valores vão ser gerados: ");
		quantidade = sc.nextLine();
		int quantidade2 = Integer.parseInt(quantidade);

		for (int i = 0; i < quantidade2; i++) {
			int valores = (int) (Math.random() * 100);
			lista.add(valores);
		}

		System.out.println("lista de valores: " + lista);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

		int aux = 0, soma = 0;

		for (int i = 0; i < lista.size(); aux++) {	
			
			int numaux = lista.get(i);
			
			for (int j = 0; j < aux; j++, i++) {

				try {
					System.out.print(lista.get(i) + " ");

					if (lista.get(i) < numaux) {
						numaux = lista.get(i);
						
					}
			
				
				}
				catch (IndexOutOfBoundsException e) {

				}
			}
			listaValores.add(numaux);
			soma += numaux;
			System.out.println(" ");
		}
		
		if (listaValores.get(0) == listaValores.get(1)) {
			listaValores.remove(0);
			soma -= listaValores.get(0);
		}
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("menores valores: \n" + listaValores);
		System.out.println("a soma é " + soma);
		
		
		sc.close();
	}

}