package lambdas;
@FunctionalInterface
public interface Calculo {
	double executar(double a, double b);
	
	static String legal() {
		return "legal";
	}
	default String mtLegal() {
		return "mt lgl";
	}

}
