package cap6.stream;

import java.util.Arrays;
import java.util.List;

import model.Grupo;
import model.Usuario;

public class FlatMap {

	public static void main(String[] args) {
		Usuario user1=new Usuario("Felipe", true);
		Usuario user2=new Usuario("Bianca", false);
		Usuario user3=new Usuario("Samia", true);
		Usuario user4=new Usuario("Patricia", false);
		
		Grupo englishSpeakers = new Grupo();
		englishSpeakers.add(user1);
		englishSpeakers.add(user2);
		
		Grupo spanishSpeakers = new Grupo();
		spanishSpeakers.add(user3);
		spanishSpeakers.add(user4);
		
		
		List<Grupo> groups = Arrays.asList(englishSpeakers, spanishSpeakers);
		
		groups.stream()
		.flatMap(g -> g.getUsuarios().stream()) // atacha Stream<Stream<Usuario>> para Stream<Usuario>
	    .forEach(System.out::println);
	}
}
