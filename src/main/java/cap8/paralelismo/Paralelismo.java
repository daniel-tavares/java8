package cap8.paralelismo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import model.Aluno;
import model.Usuario;

/*
 *  Ao usar um stream paralelo, ele vai decidir quantas threads deve utilizar, como
 *  deve quebrar o processamento dos dados e qual será a forma de unir o resultado fi-
 *  nal em um só. Tudo isso sem você ter de configurar nada. Basta apenas invocar	
 *  parallelStream em vez de Stream
 *  
 *  -> Filtrar, ordenar e coletar dá bastante trabalho
 *  Seu código vai rodar mais rápido? Não sabemos. Se a coleção for pequena, o
 * overhead de utilizar essa abordagem certamente tornará a execução bem mais lenta.
 * É necessário tomar cuidado com o uso dos streams paralelos. Eles são uma forma
simples de realizar operações com a API de Fork/Join: o tamanho do input precisa
ser grande.
 */

public class Paralelismo {

	static List<Aluno> alunos;
	
	public static void processamentoParalelo() {
		List<Aluno> filtradosOrdenados = alunos.parallelStream()
				.filter(u -> u.getIdade() > 15)
				.sorted(Comparator.comparing(Aluno::getNome))
				.collect(Collectors.toList());
		
		System.out.println(filtradosOrdenados);
	}
	
	public static void processamentoParaleloOutraForma() {
		List<Aluno> filtradosOrdenados = alunos.stream()
				.parallel()
				.filter(a ->a.getIdade()> 15)
				.sorted(Comparator.comparing(Aluno::getNome))
				.collect(Collectors.toList());
		
		System.out.println(filtradosOrdenados);
	}
	
	
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Fulano1 ", 30, false);
		Aluno aluno2 = new Aluno("Fulano2 ", 15, true);
		Aluno aluno3 = new Aluno("Fulano3 ", 80, false);
		Aluno aluno4 = new Aluno("Fulana4", 15, false);

		alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4);
		processamentoParalelo();
		processamentoParaleloOutraForma();
	}
}
