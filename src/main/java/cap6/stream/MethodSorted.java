package cap6.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import model.Aluno;

public class MethodSorted {

	static List<Aluno> alunos;
	
	public static void filtrarAlunosComIdadeMaiorQue15EDepoisOrdenarPorNome() {
		List<Aluno>novosAlunos= alunos.stream()
									  .filter(a->a.getIdade()>15)
									  .sorted(Comparator.comparing(Aluno::getNome))
									  .collect(Collectors.toList());
		System.out.println(novosAlunos);
	}
	
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Fulano ", 30, false);
		Aluno aluno2 = new Aluno("Fulano ", 15, false);
		Aluno aluno3 = new Aluno("Fulano de Tal ", 80, false);
		Aluno aluno4 = new Aluno("Fulana", 15, false);

		alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4);
		
		filtrarAlunosComIdadeMaiorQue15EDepoisOrdenarPorNome();
	}
}
