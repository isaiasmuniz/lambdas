package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	static void meuImprimir(String nome) {
		System.out.println("oi! meu nome eh: " + nome);
	}
	public static void main(String[] args) {
		List<String> aprovadis = Arrays.asList("ana", "bia", "gui", "lia");
		System.out.println("forma tradicional: ");
		for(String nome: aprovadis) {
			System.out.println(nome);
		}
		
		System.out.println("usando lambda: ");
		aprovadis.forEach(nome -> System.out.println(nome + "!!"));
		System.out.println("usando method reference: ");
		aprovadis.forEach(System.out::println);
		System.out.println("usando lambda02: ");
		aprovadis.forEach(nome -> meuImprimir(nome));
		System.out.println("usando method reference02: ");
		aprovadis.forEach(Foreach::meuImprimir);
	}

}
