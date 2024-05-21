package lambdas;

import java.util.function.BinaryOperator;

public class Teste3 {
	public static void main(String[] args) {
		BinaryOperator<Double> calc = (a, b) -> a*b; //nao aceita tipos primitivos
		System.out.println(calc.apply(2.0, 3.0));
	}

}
