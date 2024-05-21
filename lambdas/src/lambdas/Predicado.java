package lambdas;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		Predicate<Produto> isExpensive = prod -> (prod.preco * (1 - prod.desconto)) >= 750;
		Produto produto = new Produto("caderno", 1000.0, 0.1);
		System.out.println(isExpensive.test(produto));
	}

}
