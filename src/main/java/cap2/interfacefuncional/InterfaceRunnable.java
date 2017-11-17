package cap2.interfacefuncional;
/* INTERFACES FUNCIONAIS 
 * - Apresentam apenas um unico metodo abstrato, os outros metodos só podem ser default
 * - Portanto podem ser escritas com lambdas
 * - Interfaces funcionais: Runnable, Consumer, Predicate
 */
public class InterfaceRunnable{

	public static void main(String[] args) {
		
		System.out.println("OPCAO 1 - SEM LAMBDA");
		Runnable r = new Runnable() {
			public void run() {
				for (int i = 0; i <= 1000; i++) {
					System.out.println(i);
				}
			}
		};
		
		new Thread(r).start();
		
		
		System.out.println("OPCAO 2 - COM O USO DE LAMBDA");
		new Thread(()->{for (int i = 0; i <= 1000; i++) { System.out.println(i);}}) .start();
		
	}
}
