package JavaTech;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		float salario, abono, novosalario;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o salario: ");
		salario = leia.nextFloat();
		System.out.println("Entre com o abono: ");
		abono = leia.nextFloat();
		
		novosalario = salario+abono;
		
		System.out.printf("\nNovo salário: %.2f",novosalario);
		
		salario = (float) Math.sqrt(abono);
				
	}

}