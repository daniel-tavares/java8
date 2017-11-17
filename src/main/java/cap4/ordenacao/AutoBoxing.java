package cap4.ordenacao;
/*
 *  AutoBoxing - conversão de tipo primitivo ara objeto.
 *  Evitando autoboxing através de comparingInt, comparingLong, etc
 */

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

public class AutoBoxing {

	public static void main(String[] args) {
		List<Integer> numeros = Arrays.asList(145,34,9);
		numeros.sort(Comparator.comparingInt(numero->numero));
		System.out.println(numeros);
		
		ToIntFunction<Integer> porNumero=numero->numero;
		numeros.sort(Comparator.comparingInt(porNumero));
		System.out.println(numeros);
		
	}
}
