package lambdas;

public class Teste2 {
public static void main(String[] args) {
	Calculo calc = (a, b) -> {
		return a + b;
	};
	
	System.out.println(calc.executar(2, 3));
	
	calc = (a, b) -> a * b; //unica sentença de codigo que automaticamente retorna um valor
	System.out.println(calc.executar(2, 3));
	System.out.println(Calculo.legal());
	System.out.println(calc.mtLegal());
}
}
