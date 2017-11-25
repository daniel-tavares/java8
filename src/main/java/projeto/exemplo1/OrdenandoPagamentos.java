package projeto.exemplo1;

import java.util.Comparator;

import projeto.model.CriaPagamento;
import projeto.model.Payment;

public class OrdenandoPagamentos {

	public static void main(String[] args) {
		CriaPagamento pagamento=new CriaPagamento();
		
		pagamento.getListPayment().stream()
		.sorted(Comparator.comparing(Payment::getDate))
		.forEach(System.out::println);
	}
}
