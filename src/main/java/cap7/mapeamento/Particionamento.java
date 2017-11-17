package cap7.mapeamento;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.Aluno;

public class Particionamento {

		static List<Aluno> alunos;
		
		
		public static void AgrupandoPelaIdadeComGroupBy() {
			Map<Boolean, List<Aluno>> ativos = alunos
					.stream()
					.collect(Collectors.partitioningBy(Aluno::isSituacao));
			
			ativos.forEach((key,value)->System.out.println(key+" - "+value.stream().count()));
		}
		
		
		public static void getListaDeNomesDoUsuariosPorSituacao() {
			Map<Boolean, List<String>> nomesPorSituacao = alunos
					.stream()
					.collect(
						Collectors.partitioningBy(
						Aluno::isSituacao,
						Collectors.mapping(Aluno::getNome,Collectors.toList())));
			
			System.out.println(nomesPorSituacao);
		}
		
		public static void geSomaDasIdadesPorSituacao() {
			Map<Boolean, Integer> pontuacaoPorTipo = alunos
					.stream()
					.collect(
					Collectors.partitioningBy(
					Aluno::isSituacao,
					Collectors.summingInt(Aluno::getIdade)));
					System.out.println(pontuacaoPorTipo);
		}
		
		public static void concatenarNomes() {
		String nomes = alunos
				.stream()
				.map(Aluno::getNome)
				.collect(Collectors.joining(", "));
		
		System.out.println(nomes);
		}
		public static void main(String[] args) {
			Aluno aluno1 = new Aluno("Fulano1 ", 30, false);
			Aluno aluno2 = new Aluno("Fulano2 ", 15, true);
			Aluno aluno3 = new Aluno("Fulano de Tal3 ", 80, false);
			Aluno aluno4 = new Aluno("Fulana4", 15, false);

			alunos = Arrays.asList(aluno1, aluno2, aluno3, aluno4);
			
			AgrupandoPelaIdadeComGroupBy();
			getListaDeNomesDoUsuariosPorSituacao();
			geSomaDasIdadesPorSituacao();
			concatenarNomes();
		}

}
