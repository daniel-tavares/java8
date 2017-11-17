package cap7.mapeamento;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import model.Aluno;

public class Mapeamento {
	
	static List<Aluno> alunos;
	
	static Stream<String> lines(Path p){
		try {
			return Files.lines(p);
		} catch (IOException e) {
			e.printStackTrace();
			throw new UncheckedIOException(e);
		}
	}
	
	public static void retornandoUmMap() throws IOException {
		Map<Path, Long> lines =
				Files.list(Paths.get("src/main/java/interfacefuncional/"))
				.filter(p -> p.toString().endsWith(".java"))
				.collect(Collectors.toMap(p -> p,p -> lines(p).count()));	
		System.out.println(lines);
	}
	
	public static void RetornandoUmMapDeLista() throws IOException {
		Map<Path, List<String>> content =
				Files.list(Paths.get("src/main/java/interfacefuncional/"))
				.filter(p -> p.toString().endsWith(".java"))
				.collect(Collectors.toMap(
				Function.identity(),
				p -> lines(p).collect(Collectors.toList())));
		System.out.println(content);
	}
	
	public static void RetornaUmMapDeAlunosComNomeComoChave() {
		  Map<String, Aluno> nameToAluno = alunos.stream()
					   .collect(Collectors.toMap(Aluno::getNome,Function.identity()));
		  
		  System.out.println(nameToAluno.values());

	}
	
	
	public static void main(String[] args) throws IOException {
		
		
		
		  Aluno aluno1 = new Aluno("Fulano1 ", 30, false);
		  Aluno aluno2 = new Aluno("Fulano2 ", 15, false);
		  Aluno aluno3 = new Aluno("Fulano de Tal3 ", 80, false);
		  Aluno aluno4 = new Aluno("Fulana4", 15, false);

		  alunos= Arrays.asList(aluno1, aluno2, aluno3, aluno4);
		  
		  retornandoUmMap();
		  RetornandoUmMapDeLista();
		  RetornaUmMapDeAlunosComNomeComoChave();
		  
	}
}
