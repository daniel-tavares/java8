package interfacefuncional;

import java.util.Comparator;

public class NumeroComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer valor, Integer novoValor) {
		return valor.compareTo(novoValor);
	}

}
