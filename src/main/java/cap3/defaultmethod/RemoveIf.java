package cap3.defaultmethod;

import java.util.ArrayList;
import java.util.List;

import interfacefuncional.QtdeAlunosMaior160Predicate;
import model.Disciplina;

public class RemoveIf {
	public static void main(String... args) {
        
		List<Disciplina> disciplinas= new ArrayList<Disciplina>(); 
		disciplinas.add(new Disciplina("DISCIPLINA 1", 21, true));
		disciplinas.add(new Disciplina("DISCIPLINA 2", 221, true));
		disciplinas.add(new Disciplina("DISCIPLINA 3", 123, true));
		
		
		disciplinas.removeIf(new QtdeAlunosMaior160Predicate());
		
		disciplinas.forEach(d-> System.out.println(d.getNome()));
		
		System.out.println("\nOPCAO2 - SIMPLIFICADO");
		boolean retorno = disciplinas.removeIf(d-> {return d.getQuantidadeAlunos()>160;});
		System.out.println(retorno); // false pois não existe mais elementos na lista
	}
}


