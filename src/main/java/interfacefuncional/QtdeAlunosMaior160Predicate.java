package interfacefuncional;

import java.util.function.Predicate;

import model.Disciplina;

public class QtdeAlunosMaior160Predicate implements Predicate<Disciplina>{

	@Override
	public boolean test(Disciplina d) {
		return d.getQuantidadeAlunos() > 160;
	}
	
}