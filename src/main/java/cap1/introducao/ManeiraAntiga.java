package cap1.introducao;

import java.util.Arrays;
import java.util.List;

import model.Aluno;

public class ManeiraAntiga {

	public static void main(String[] args) {
		Aluno aluno= new Aluno("Fulano 1", 15, true);
		Aluno aluno1 = new Aluno("Fulano 2", 30,false);
		Aluno  aluno2= new Aluno("Fulano de Tal 3", 22,true);
		
		List<Aluno> alunos=Arrays.asList(aluno,aluno1,aluno2);
		
		
		for (Aluno aluno3 : alunos) {
			System.out.println(aluno3.getNome());
		}
	}
}
