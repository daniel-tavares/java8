package cap7.javanio;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Nio {

	public static void listarTodosOsArquivosDeUmDiretorio() throws IOException {
		System.out.println("\nlistarTodosOsArquivosDeUmDiretorio");
		Files.list(Paths.get("src/main/java/interfacefuncional"))
		.forEach(System.out::println);
	}
	
	public static void listarTodosOsArquivosComExtensãoProperties() throws IOException {
		System.out.println("\nlistarTodosOsArquivosComExtensãoProperties");
		Files.list(Paths.get("src/main/java/interfacefuncional"))
		.filter(a->a.toString().endsWith(".properties"))
		.forEach(System.out::println);
	}
	
	
	
	public static void recuperaOConteudoDosArquivos() throws Exception {
		 System.out.println("\nrecuperaOConteudoDosArquivos");
		 Files.list(Paths.get("src/main/java/interfacefuncional/"))
		.filter(a->a.toString().endsWith(".java"))
		.flatMap(p->lines(p)) //achatar Stream<Stream<String>> para Stream<String>
		.forEach(System.out::println);
	}
	
	
	
	public static void recuperarTodosOsCarecteres() throws IOException {
		 System.out.println("\nrecuperarTodosOsCarecteres");
		IntStream chars =
				Files.list(Paths.get("src/main/java/interfacefuncional/"))
				.filter(p -> p.toString().endsWith(".java"))
				.flatMap(p -> lines(p))
				.flatMapToInt((String s) -> s.chars());
		
		chars.forEach(System.out::println);
	}
	
	static Stream<String> lines(Path p){
		try {
			return Files.lines(p);
		} catch (IOException e) {
			e.printStackTrace();
			throw new UncheckedIOException(e);
		}
	}
	
	
	
	
	public static void quantidadeLinhasArquivo() throws IOException {
		 System.out.println("\nquantidadeLinhasArquivo");
		 LongStream lines =
				 Files.list(Paths.get("src/main/java/interfacefuncional/"))
				 .filter(p -> p.toString().endsWith(".java"))
				 .mapToLong(p -> lines(p).count());
		
		 lines.forEach(System.out::println); 
		 
		 // ou
		 //.forEach(p -> linesPerFile.put(p, lines(p).count()));
	}
	
	
	
	public static void main(String[] args) {
		try {
			listarTodosOsArquivosDeUmDiretorio();
			listarTodosOsArquivosComExtensãoProperties();
			recuperaOConteudoDosArquivos();
			recuperarTodosOsCarecteres();
			quantidadeLinhasArquivo();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
