package cap7.mapeamento;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.Aluno;

public class GroupBy {

	static List<Aluno> alunos;
	
	
	public static void AgrupandoPelaIdadeComGroupBy() {
		Map<Integer, List<Aluno>> pontuacao = alunos
				.stream()
				.collect(Collectors.groupingBy(Aluno::getIdade));
		
		pontuacao.forEach((key,value)->System.out.println(key+" - "+value.stream().count()));
	}
	
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Fulano1 ", 30, false);
		Aluno aluno2 = new Aluno("Fulano2 ", 15, false);
		Aluno aluno3 = new Aluno("Fulano de Tal3 ", 80, false);
		Aluno aluno4 = new Aluno("Fulana4", 15, false);

		alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4);
		
		AgrupandoPelaIdadeComGroupBy();
	}
}
