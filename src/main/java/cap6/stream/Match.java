package cap6.stream;

import java.util.Arrays;
import java.util.List;

import model.Aluno;

public class Match {
	static List<Aluno> alunos;

	public static void isExisteAlgumAlunoAtivo() {
		boolean ativo = alunos.stream()
				.anyMatch(Aluno::isSituacao); 
        
		System.out.println(ativo);
	}
	
	

	public static void isTodosOsAlunosEstaoAtivo() {
		boolean ativo = alunos.stream()
				.allMatch(Aluno::isSituacao); 
        
		System.out.println(ativo);
	}
	

	public static void isNenhumUsuarioEstaAtivo() {
		boolean ativo = alunos.stream()
				.noneMatch(Aluno::isSituacao); 
        
		System.out.println(ativo);
	}
	
	
	
	
	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Fulano ", 30, false);
		Aluno aluno2 = new Aluno("Fulano ", 15, true);
		Aluno aluno3 = new Aluno("Fulano de Tal ", 80, false);
		Aluno aluno4 = new Aluno("Fulana", 15, false);

		alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4);
	
	
		isExisteAlgumAlunoAtivo();
		isTodosOsAlunosEstaoAtivo();
		isNenhumUsuarioEstaAtivo();
	
	}
}
