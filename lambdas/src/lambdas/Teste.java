package lambdas;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Teste {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		BinaryOperator<Integer> soma = (a, b) -> a / b;
		Integer num, n;
		System.out.println("digite o primeiro valor");
		num = entrada.nextInt();
		System.out.println("digite o segundo valor");
		n = entrada.nextInt();
		System.out.println("o resultado eh: " + soma.apply(n, num));
	}

}
