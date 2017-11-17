package cap6.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import model.Aluno;


public class CollectorsAPI {
	
	static List<Aluno> alunos;
	
	public static void retornarUmArrayList() {
		System.out.println("\nretornarUmArrayList");
		Supplier<ArrayList<Aluno>> supplier = ArrayList::new; // cria a list
		BiConsumer<ArrayList<Aluno>, Aluno> accumulator =ArrayList::add; //adicionar
		BiConsumer<ArrayList<Aluno>, ArrayList<Aluno>> combiner =ArrayList::addAll;	
		
		List<Aluno> maisQue15 = alunos.stream()
				.filter(u -> u.getIdade() > 15)
				.collect(supplier, accumulator, combiner);
		
		System.out.println(maisQue15);
		
		
	}
	
	public static void retornarUmArrayListSimplificado() {
		System.out.println("\nretornarUmArrayListSimplificado");
		List<Aluno> maisQue15 = alunos.stream()
				.filter(u -> u.getIdade() > 15)
				.collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
		
		System.out.println(maisQue15);
	}
	
	
	public static void retornarUmArrayListToList() {
		System.out.println("\nretornarUmArrayListToList");
		List<Aluno> maisQue15 = alunos.stream()
				.filter(u -> u.getIdade() > 15)
				.collect(Collectors.toList()); // ou somente toList// Set<Usuario> : toSet
		
		System.out.println(maisQue15);
	}
	
	public static void escolhaAImplementacaoDeRetorno() {
		System.out.println("\nescolhaAImplementacaoDeRetorno");
		Set<Aluno> alunosSet = alunos.stream()
				.filter(u -> u.getIdade() > 15)
				.collect(Collectors.toCollection(HashSet::new)); 
		
		System.out.println(alunosSet);
	}
	
	
	public static void retornandoArrayDeObjeto() {
		System.out.println("\nescolhaAImplementacaoDeRetorno");
		Aluno[] alunosArray = alunos.stream()
				.filter(u -> u.getIdade() > 15)
				.toArray(Aluno[]::new); 
		
		System.out.println(alunosArray);
	}
	
	
	public static void main(String[] args) {

		
		Aluno aluno1 = new Aluno("Fulano ", 30,false);
		Aluno aluno2= new Aluno("Fulano ", 15, false);
		Aluno  aluno3= new Aluno("Fulano de Tal ", 80,false);
		Aluno aluno4= new Aluno("Fulana", 15, false);
		
		alunos=Arrays.asList(aluno1,aluno2,aluno3,aluno4);
	
		retornarUmArrayList();
		
		retornarUmArrayListSimplificado();
		
		retornarUmArrayListToList();
	}
}
