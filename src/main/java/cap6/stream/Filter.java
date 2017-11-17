package cap6.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import model.Aluno;

public class Filter {
	
	private static List<Aluno> alunos;
	
	public static void ativarOsAlunosComIdadeMaiorQue30(){
		System.out.println("\nativarOsAlunosComIdadeMaiorQue30");
		alunos.stream()
		      .filter(a -> a.getIdade() > 30)
	          .forEach(Aluno::ativarAluno);
		
		alunos.forEach(System.out::println);
	
		System.out.println("\nativarOsAlunosComIdadeMaiorQue30 - Somente os moderadores");
		alunos.stream().filter(Aluno::isSituacao).forEach(System.out::println);;
		
	}
	
	
	public static void colocarMaiorQue30EmOutraLista(){
		System.out.println("\ncolocarMaiorQue30EmOutraLista");
		List<Aluno> novaListaAlunos= new ArrayList<Aluno>();
	    alunos.stream()
	    	  .filter(a->a.getIdade()>30)
	    	  .forEach(novaListaAlunos::add);
	    novaListaAlunos.forEach(System.out::println);
	}
	
	
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Fulano ", 30,false);
		Aluno aluno2= new Aluno("Fulano ", 15, false);
		Aluno  aluno3= new Aluno("Fulano de Tal ", 80,false);
		Aluno aluno4= new Aluno("Fulana", 15, false);
		
		alunos=Arrays.asList(aluno1,aluno2,aluno3,aluno4);
		ativarOsAlunosComIdadeMaiorQue30();
		colocarMaiorQue30EmOutraLista();
	}
	
}
