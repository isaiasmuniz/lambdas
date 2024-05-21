package lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	public static void main(String[] args) {
		UnaryOperator<Integer> maisDois = n -> n + 2;
		UnaryOperator<Integer> vezesDois = n -> n * 2;
		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		int res = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(2);
		System.out.println(res);
		
		int rest = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);
		System.out.println(rest);
	}

}
