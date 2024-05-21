package lambdas;

import java.util.Scanner;
import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		Function<Integer, String> parOUimpar =
				n -> n % 2 == 0 ? "par" : "impar";
				System.out.println("digite uma valor: ");
				System.out.println(parOUimpar.apply(t.nextInt()));
		Function<String, String> res =
				valor -> "o resultado eh: " + valor;
				System.out.println("digite um valor: ");
		String resultado = parOUimpar.andThen(res).apply(t.nextInt());
		System.out.println(resultado);
		t.close();
	}

}
