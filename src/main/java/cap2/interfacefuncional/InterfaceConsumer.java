package cap2.interfacefuncional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import interfacefuncional.DisciplinaConsumer;
import model.Aluno;
import model.Disciplina;

public class InterfaceConsumer {
	public static void main(String... args) {
		
		
		Aluno aluno = new Aluno();
		
		List<Disciplina> disciplinas=new ArrayList<Disciplina>();
		Disciplina disciplina1 =new Disciplina();
		disciplina1.setNome("Fisica");
		disciplina1.setQuantidadeAlunos(200);
		
		Disciplina disciplina2 =new Disciplina();
		disciplina2.setNome("Matematica");
		disciplina2.setQuantidadeAlunos(200);
		
		Disciplina disciplina3 =new Disciplina();
		disciplina3.setNome("Informatica");
		disciplina3.setQuantidadeAlunos(200);
		
		disciplinas.add(disciplina1);
		disciplinas.add(disciplina2);
		disciplinas.add(disciplina3);
		
		aluno.setDisciplinas(disciplinas);
		
		
		

		System.out.println("OPCAO 1 - FORMA ANTIGA (ENHANCED FOR)");
		for (Disciplina disciplina : aluno.getDisciplinas()) {
			System.out.println(disciplina.getNome());
		}

		System.out.println("\nOPCAO 2 - FOREACH SEM LAMBDA CHAMANDO CLASSE QUE IMPLEMENTA CONSUMER");
		aluno.getDisciplinas().forEach(new DisciplinaConsumer());   		
		
		System.out.println("\nOPCAO 3 - FOREACH SEM LAMBDA COM CLASSES AN�NIMAS");
		aluno.getDisciplinas().forEach(new Consumer<Disciplina>() {
			@Override
			public void accept(Disciplina c) {
				System.out.println(c.getNome());
			}
		});
		
		
		System.out.println("\nOPCAO 4 - UNSANDO LAMBDA");
		Consumer<Disciplina> mostrador =(Disciplina d) -> {System.out.println(d.getNome());};
		aluno.getDisciplinas().forEach(mostrador);
		
		
		System.out.println("\nOPCAO 5 - USANDO LAMBDA REDUZIDO");
		aluno.getDisciplinas().forEach(c-> System.out.println(c.getNome()));
		

	}
}

