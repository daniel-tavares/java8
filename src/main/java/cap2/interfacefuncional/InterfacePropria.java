package cap2.interfacefuncional;

public class InterfacePropria {
	public static void main(String[] args) {

		Validador<String> validadorCEP = new Validador<String>() {
			public boolean valida(String valor) {
				return valor.matches("[0-9]{5}-[0-9]{3}");
			}
		};
		
		System.out.println("\nOPCAO 1 - SEM LAMBDA");
		System.out.println(validadorCEP.valida("66035367")); // false
		System.out.println(validadorCEP.valida("66035-367")); // true

		
		System.out.println("\nOPCAO 2 - COM LAMBDA");
		Validador<String> validadorCEP2=s -> {return s.matches("[0-9]{5}-[0-9]{3}");};
		System.out.println(validadorCEP2.valida("66035367")); // false
		System.out.println(validadorCEP2.valida("66035-367")); // true
		
	}
}

@FunctionalInterface  // opcional, mas importante para que ninguem torne aquela interface em nao funcional.
interface Validador<T> {
	boolean valida(T t);
}
