package JavaTech;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		float SalarioBruto,AdicionalNoturno,HorasExtras,Descontos,SalarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o valor do salário bruto: ");
		SalarioBruto = leia.nextFloat();
		System.out.println("Entre com o adicional noturno: ");
		AdicionalNoturno = leia.nextFloat();
		System.out.println("Entre com as horas extras: ");
		HorasExtras = leia.nextFloat();
		System.out.println("Entre com o valor dos descontos: ");
		Descontos = leia.nextFloat();
		
		SalarioLiquido = SalarioBruto + AdicionalNoturno + (HorasExtras * 5) - Descontos;
		
		System.out.printf("\nValor do salário líquido: %.2f",SalarioLiquido);
				
	}

}