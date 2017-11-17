package cap6.stream;

import java.util.Arrays;
import java.util.List;

import model.Aluno;

public class FindFirst {
	
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Fulano ", 30,false);
		Aluno aluno2= new Aluno("Fulano ", 15, false);
		Aluno  aluno3= new Aluno("Fulano de Tal ", 80,false);
		Aluno aluno4= new Aluno("Fulana", 15, false);
		
		List<Aluno> alunos=Arrays.asList(aluno1,aluno2,aluno3,aluno4);
		
		alunos.stream().filter(a->a.getIdade()>10).findFirst();
		
		alunos.forEach(System.out::println);
	
	}
}
