package Variaveis;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		float n1,n2,n3,n4,diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro valor: ");
		n1 = leia.nextFloat();
		System.out.println("Entre com o segundo valor: ");
		n2 = leia.nextFloat();
		System.out.println("Entre com o terceiro valor: ");
		n3 = leia.nextFloat();
		System.out.println("Entre com o quarto valor: ");
		n4 = leia.nextFloat();
		
		diferenca = (n1*n2) - (n3*n4);
		
		System.out.println("\nDiferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4: "+diferenca);
						
	}

}