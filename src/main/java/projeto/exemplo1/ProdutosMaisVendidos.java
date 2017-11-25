package projeto.exemplo1;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import projeto.model.CriaPagamento;
import projeto.model.Product;

public class ProdutosMaisVendidos {

	public static void main(String[] args) {
		CriaPagamento pagamento=new CriaPagamento();
		
		Map<Product, Long> topProducts =pagamento.getListPayment().stream()
		.flatMap(p -> p.getProducts().stream())
		.collect(Collectors.groupingBy(Function.identity(),
		Collectors.counting()));
		
		System.out.println("\nMaisVendido");
		topProducts.forEach((k,i)->System.out.println(k.getName()+" - "+i));

		topProducts.entrySet().stream().forEach(System.out::println);
		
		System.out.println("\nMAX");
		topProducts.entrySet().stream()
		.max(Comparator.comparing(Map.Entry::getValue))
		.ifPresent(System.out::println);
	}
}
