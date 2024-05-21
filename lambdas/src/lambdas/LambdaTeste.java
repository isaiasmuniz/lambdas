package lambdas;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class LambdaTeste {
	public static void main(String[] args) {
		BinaryOperator<Double> media = (a,b) -> (a+b)/2;
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("digite os valores: ");
		System.out.println(media.apply(entrada.nextDouble(), entrada.nextDouble()));
		
		
		System.out.println("digite um valor: ");
		int valor1 = entrada.nextInt();
		System.out.println("digite um valor: ");
		int valor2 = entrada.nextInt();
		System.out.println((valor1+valor2)/2);
		
	}

}
