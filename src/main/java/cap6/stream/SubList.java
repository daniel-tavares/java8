package cap6.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import model.Aluno;


public class SubList {

	private static List<Aluno> alunos;
	
	
	public static void ativarOsDoisAlunosComMaioresIdades() {
		System.out.println("\nANTES - ativarOsDoisAlunosComMaioresIdades");
		alunos.forEach(System.out::println);
		
		alunos.sort(Comparator.comparing(Aluno::getIdade).reversed());
		alunos.subList(0, 2).forEach(Aluno::ativarAluno);
		
		System.out.println("\nDEPOIS - ativarOsDoisAlunosComMaioresIdades");
		alunos.forEach(System.out::println);
	}
	
	
	
	
	
	
	

	
	public static void colocarMaiorQue30EmOutraLista(){
		
	}
	
	

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Fulano ", 30,false);
		Aluno aluno2= new Aluno("Fulano ", 15, false);
		Aluno  aluno3= new Aluno("Fulano de Tal ", 80,false);
		Aluno aluno4= new Aluno("Fulana", 15, false);
		
		alunos=Arrays.asList(aluno1,aluno2,aluno3,aluno4);
		ativarOsDoisAlunosComMaioresIdades();
		colocarMaiorQue30EmOutraLista();

	
	}
}
