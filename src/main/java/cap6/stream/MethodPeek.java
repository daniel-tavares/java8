package cap6.stream;

import java.util.Arrays;
import java.util.List;

import model.Aluno;
/*
 * Peek: acompanhar a execucao de uma operacao
 */
public class MethodPeek {
	
	static List<Aluno> alunos;

	public static void separarAsIdadesDosAlunos() {
		alunos.stream().filter(a->a.getIdade()>15)
					   .peek(System.out::println)
					   .findAny();  //Não executa o filtro completamente
									
									 
	}
	
	
	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Fulano ", 30, false);
		Aluno aluno2 = new Aluno("Fulano ", 15, false);
		Aluno aluno3 = new Aluno("Fulano de Tal ", 80, false);
		Aluno aluno4 = new Aluno("Fulana", 15, false);

		alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4);
	
	
		separarAsIdadesDosAlunos();
		
	
	}
}
