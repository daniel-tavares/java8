package lambdas;



import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Lambda {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<String>();
		nomes.add("Danilo");
		nomes.add("Daniele");
		nomes.add("Daniel");

		
		
		
		
		System.out.println("SEM LAMBDA-----------------------------------------------------");
		nomes.forEach(new Consumer<String>() {

			@Override
			public void accept(String nome) {
				System.out.println(nome);
			}

		});
		System.out.println("COM LAMBDA-----------------------------------------------------");

		// Java 8- Usando Lambda
		nomes.forEach((String nome) -> {
			System.out.println(nome);
		});

		System.out.println("COM LAMBDA MAIS SIMPLIFICADO-----------------------------------------------------");
		// Java 8- Usando Lambda - melhorado
		nomes.forEach(nome -> System.out.println(nome));

		
		System.out.println("COM LAMBDA EM OBJETOS-----------------------------------------------------");
		List<Pessoa> pessoas=new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("Nome 3"));
		pessoas.add(new Pessoa("Nome 1"));
		pessoas.add(new Pessoa("Nome 2"));
		
		pessoas.forEach(pessoa->System.out.println(pessoa.getNome()));
		
		
		System.out.println("COM LAMBDA EM SORT-----------------------------------------------------");
	    nomes.sort((anterior, novo)->Integer.compare(anterior.length(), novo.length()));
	    System.out.println(nomes);
	}

}

class Pessoa {
	String nome;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}


