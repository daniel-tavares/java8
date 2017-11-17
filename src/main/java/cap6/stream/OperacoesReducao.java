package cap6.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

import model.Aluno;
import model.Usuario;

/*
 * São operações que retornar um valor final
 * 
 */
public class OperacoesReducao {
static List<Aluno> alunos;
	
	public static void retornaValorDaMediaDasIdades() {
		double pontuacaoMedia = alunos.stream()
				.mapToInt(Aluno::getIdade)
				.average()
				.getAsDouble();
		
		System.out.println(pontuacaoMedia);
	}
	
	
	public static void maximaIdade() {
		int max = alunos.stream()
				   .mapToInt(Aluno::getIdade)
				   .max().getAsInt();
	  System.out.println(max);
	}

	
	public static void somarAsIdades() {
		int total = alunos.stream()
				.mapToInt(Aluno::getIdade)
				.sum();
		
		System.out.println(total);
	}
	
	public static void somarAsIdadesComReduce() {
		int total = alunos.stream()
				.mapToInt(Aluno::getIdade)
				.reduce(0, (a, b) -> a + b);
		
		System.out.println(total);
	}
	
	
	public static void somarAsIdadesComReduceSimplificado() {
		int total = alunos.stream()
				.mapToInt(Aluno::getIdade)
				.reduce(0, Integer::sum);
		
		System.out.println(total);
	}
	
	
	public static void somarAsIdadesSemMap() {
		int total = alunos.stream()
				.reduce(0, (atual, u) -> atual + u.getIdade(), Integer::sum);
		
		System.out.println(total);
	}
	
	
	public static void multiplicarIdades() {
		int multiplicacao = alunos.stream()
				.mapToInt(Aluno::getIdade)
				.reduce(1, (a,b) -> a * b);
		System.out.println(multiplicacao);
	}
	
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Fulano ", 30, false);
		Aluno aluno2 = new Aluno("Fulano ", 15, false);
		Aluno aluno3 = new Aluno("Fulano de Tal ", 80, false);
		Aluno aluno4 = new Aluno("Fulana", 15, false);

		alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4);
		
		retornaValorDaMediaDasIdades();
		
		maximaIdade();
		
		
		somarAsIdades();
		
		somarAsIdadesComReduce();
		
		multiplicarIdades();
		
		somarAsIdadesComReduceSimplificado();
		
	}
}
