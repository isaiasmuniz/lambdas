package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperadorBinario {
	public static void main(String[] args) {
		BinaryOperator<Double> media = (n1, n2) -> (n1 + n2)/2;
		System.out.println(media.apply(9.5, 10.0));
		BiFunction<Double, Double, String> res  = (n1, n2) ->{
			double notaFinal =(n1 + n2)/2;
			return notaFinal >= 7 ?"aprovado":"reprovado";
		};
		System.out.println(res.apply(8.5, 9.5));
	}

}
