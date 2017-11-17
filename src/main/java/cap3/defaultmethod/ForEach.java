

package cap3.defaultmethod;

import java.util.ArrayList;
import java.util.List;

import interfacefuncional.NomeConsumer;
/*
 * forEach - default method da classe list
 */
public class ForEach {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<String>();
		nomes.add("Daniel");
		nomes.add("Danilo");
		nomes.add("Daniele");

		
		nomes.forEach(new NomeConsumer());
		
		nomes.forEach(nome->System.out.println(nome));

	}

}

