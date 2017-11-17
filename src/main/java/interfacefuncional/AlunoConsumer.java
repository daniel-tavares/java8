package interfacefuncional;

import java.util.function.Consumer;

import model.Aluno;

public class AlunoConsumer implements Consumer<Aluno>{
	@Override
	public void accept(Aluno t) {
		System.out.println(t.getNome());
	}
}