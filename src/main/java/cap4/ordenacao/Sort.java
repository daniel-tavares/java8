package cap4.ordenacao;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import interfacefuncional.NumeroComparator;
import model.Aluno;

/* sort : ordena os itens
 * Java - sort não existia na interface List, somente na Collection
 * Tanto sort quanto forEach são criadas com metodos default
 */
public class Sort {

	public static void main(String[] args) {

			System.out.println("\nColletions");
			List<Integer> numeros = Arrays.asList(145,34,9);
			Collections.sort(numeros);	
			System.out.println(numeros);
		
			
			System.out.println("\nClasse Comparator");
			List<Integer> numeros2 = Arrays.asList(145,34,9);
			numeros2.sort(new NumeroComparator());
			System.out.println(numeros2);
			
			
			System.out.println("\nComparator com lambda");
			List<Integer> numeros3 = Arrays.asList(145,34,9);
			numeros3.sort((c1, c2) -> c1.compareTo(c2));
			System.out.println(numeros3);
			
			
			System.out.println("\nComparator com metodo estatico crescente e decrescente");
			List<Integer> numeross4 = Arrays.asList(145,34,9);
			numeross4.sort(Comparator.naturalOrder());
			System.out.println(numeross4);
			numeross4.sort(Comparator.reverseOrder());
			System.out.println(numeross4);
				
			
			System.out.println("\nComparator com functions crescente e decrescente");
			List<Integer> numeross6 = Arrays.asList(145,34,9);
			Function<Integer, Integer> ordenarPorValor=valor->valor;
			Comparator<Integer> comparator=Comparator.comparing(ordenarPorValor);
			numeross6.sort(comparator);
			System.out.println(numeross6);
			numeross6.sort(comparator.reversed());
			System.out.println(numeross6);
			
			
			System.out.println("\nOrdena alunos pela idade");
			Aluno aluno1 = new Aluno("Fulano ", 30,false);
			Aluno aluno2= new Aluno("Fulano ", 15, true);
			Aluno  aluno3= new Aluno("Fulano de Tal ", 22,true);
			Aluno aluno4= new Aluno("Fulana", 15, true);
			
			List<Aluno> alunos=Arrays.asList(aluno1,aluno2,aluno3,aluno4);
			
			alunos.sort(Comparator.comparing(a->a.getIdade()));
			alunos.forEach(a-> System.out.println(a.getNome()+" - "+a.getIdade()));
			
			System.out.println("\nDois criterios de ordenacao ");
			List<Aluno> alunos2=Arrays.asList(aluno1,aluno2,aluno3,aluno4);
			alunos2.sort(Comparator.comparingInt(Aluno::getIdade).thenComparing(Aluno::getNome));
			alunos2.forEach(a-> System.out.println(a.getNome()+" - "+a.getIdade()));
			
		
		
		/*
		 * Comparator.nullsLast: coloca os nulos no final
		 * comparator.reversed:  ordem decrescente
		 * 
		 */
	}
}
