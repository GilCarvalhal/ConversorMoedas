package Program;

import java.util.Scanner;

public class ConversãoDolarReal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double real, dolar, CotDolar;

		System.out.println("Conversor de Dolares (US$) para Reais (R$) " + "\n");

		System.out.println("Digite a cotação do dólar (US$) ");
		CotDolar = sc.nextDouble();
		System.out.println("Digite o valor em dólar (US$) ");
		dolar = sc.nextDouble();

		real = dolar * CotDolar;

		System.out.println("Valor em Reais (R$) " + real + "\n");

		sc.close();
	}

}
