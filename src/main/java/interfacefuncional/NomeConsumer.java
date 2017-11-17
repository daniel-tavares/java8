package interfacefuncional;

import java.util.function.Consumer;

public class NomeConsumer implements Consumer<String> {

	@Override
	public void accept(String nome) {
		System.out.println(nome);
		
	}
}
