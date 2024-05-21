package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio2 {
	public static void main(String[] args) {
		Function<Produto, Double> produtoComDesconto = prod -> prod.preco * (1 - prod.desconto);
		UnaryOperator<Double> imposto = preco -> preco >= 2500 ? preco * 1.085 : preco; 
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		UnaryOperator<Double> arrendondar = preco -> Double.parseDouble(String.format("%.2f", preco));
		Function<Double, String> formatar = preco -> ("r$" + preco).replace(".", ",");
		Produto p = new Produto("cell", 3235.89, 0.13);
		String preco = produtoComDesconto.andThen(imposto).andThen(frete).andThen(arrendondar).andThen(formatar).apply(p);
		System.out.println(preco);
	}

}
