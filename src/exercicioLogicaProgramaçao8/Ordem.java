package exercicioLogicaProgramaçao8;

import java.util.Arrays;
import java.util.Scanner;

public class Ordem {

		
		public Scanner Leitor = new Scanner(System.in);
		public int[] numeros = new int[10];
		
		public Ordem() {
			for (int i = 0; i < 10; i++) {
				System.out.println("Digite o " + (i + 1) + "º número:");
				numeros[i] = Leitor.nextInt();
			}
			
			Leitor.close();
		}	

		public void ImprimeOrdem() {
			Arrays.sort (numeros);
			for(int numero : numeros)
	            System.out.println(numero);
	        System.out.println();
			}		
		}	
