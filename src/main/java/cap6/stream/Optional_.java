package cap6.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/* * Optional é uma importante nova classe do Java 8. 
 * É com ele que poderemos trabalhar de uma maneira mais organizada com possíveis valores null
 *  Se a lista for vazia, não haverá usuário para ser retornado. Por isso, o resultado
é um Optional
 */
import model.Aluno;

public class Optional_ {

	static List<Aluno> alunos;
	
	
	public static void  nomeAlunoComMaximaIdade() {
		Optional<String> nomeAluno=alunos.stream().max(Comparator.comparing(Aluno::getIdade))
					   .map(Aluno::getNome);
					  
		System.out.println(nomeAluno.orElse("Não existem elementos"));
						
	}
	
	
	
	
	
	public static void chamarOutroFuncionalidade() {
		alunos.stream()
			  .mapToInt(Aluno::getIdade)
			  .average()
			  .ifPresent(valor -> imprimeValor(valor));
	}
	
	
	
	public static void imprimeValor(double valor ) {
		System.out.println("MEDIA É IGUAL A: "+valor);
	}
	
	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Fulano ", 30, false);
		Aluno aluno2 = new Aluno("Fulano ", 15, false);
		Aluno aluno3 = new Aluno("Fulano de Tal ", 80, false);
		Aluno aluno4 = new Aluno("Fulana", 15, false);

		alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4);
		
		nomeAlunoComMaximaIdade();
		
		chamarOutroFuncionalidade();
	}
}
