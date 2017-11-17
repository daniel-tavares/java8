package cap1.introducao;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import interfacefuncional.AlunoConsumer;
import model.Aluno;

public class ManeiraNova {

	static List<Aluno> alunos;
	
	public static void comClasseQueImplementaConsumer() {
		System.out.println("\ncomClasseQueImplementaConsumer");
		AlunoConsumer consumidor=new AlunoConsumer();
		alunos.forEach(consumidor);
	}
	
	
	public static void comClasseConsumerAnonima() {
		System.out.println("\ncomClasseConsumerAnonima");
		Consumer<Aluno> consumidor=new Consumer<Aluno>() {
			@Override
			public void accept(Aluno t) {
				System.out.println(t.getNome());
			}
		};
		alunos.forEach(consumidor);
	}
	
	public static void comClasseConsumerDiretamenteNoForEach() {
		System.out.println("\ncomClasseConsumerDiretamenteNoForEach");
		alunos.forEach(new Consumer<Aluno>() {
			@Override
			public void accept(Aluno t) {
				System.out.println(t.getNome());
			}
		});
	}
	
	public static void comClasseConsumerEmFomaDeLambda() {
		System.out.println("\ncomClasseConsumerEmFomaDeLambda");
		Consumer<Aluno> consumidor=(Aluno t)-> {System.out.println(t.getNome());};
		alunos.forEach(consumidor);
			
	}
	
	// Novo Recurso do JAVA 8
	public static void comClasseConsumerEmFomaDeLambdaSimplificado() {
		System.out.println("\ncomClasseConsumerEmFomaDeLambdaSimplificado");
		alunos.forEach(aluno-> System.out.println(aluno.getNome()));
	}
	
	
	
	public static void main(String[] args) {
		
		Aluno aluno= new Aluno("Fulano 1", 15, true);
		Aluno aluno1 = new Aluno("Fulano 2", 30,false);
		Aluno  aluno2= new Aluno("Fulano de Tal 3", 22,true);
		
		alunos=Arrays.asList(aluno,aluno1,aluno2);
		
		comClasseQueImplementaConsumer();
		comClasseConsumerAnonima();
		comClasseConsumerDiretamenteNoForEach();
		comClasseConsumerEmFomaDeLambda();
		comClasseConsumerEmFomaDeLambdaSimplificado();
	}
}


