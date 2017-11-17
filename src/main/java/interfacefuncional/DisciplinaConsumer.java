package interfacefuncional;

import java.util.function.Consumer;

import model.Disciplina;

public class DisciplinaConsumer implements Consumer<Disciplina> {
	public void accept(Disciplina c) {
		System.out.println(c.getNome());
	}
}