package projeto.exemplo1;

import java.math.BigDecimal;

import projeto.model.CriaPagamento;
import projeto.model.Product;

public class ReduzindoBigdecimalEmSoma {

	public static void main(String[] args) {
		
		CriaPagamento pagamento=new CriaPagamento();
		
	System.out.println("SOMANDO OS ITENS DE UM PAGAMENTO");	
	BigDecimal soma = pagamento.getListPayment().get(0).getProducts().stream()
		.map(Product::getPrice)
		.reduce(BigDecimal::add).orElse(new BigDecimal(0));
	
	System.out.println(soma);
	
	
	System.out.println("\nSOMANDO ITENS DE TODOS OS PAGAMENTOS");
      BigDecimal somaTotal = pagamento.getListPayment().stream()
	   .map(a->a.getProducts().stream()
			                  .map(Product::getPrice)		
                              .reduce(BigDecimal::add)
                              .orElse(BigDecimal.ZERO))
	   .reduce(BigDecimal::add)
	   .orElse(BigDecimal.ZERO);
	
	System.out.println(somaTotal);
	
	
	System.out.println("\nSOMANDO ITENS DE TODOS OS PAGAMENTOS MELHORADO");
    BigDecimal somaTotal2 = pagamento.getListPayment().stream()
	   .flatMap(a->a.getProducts().stream().map(Product::getPrice))
	   .reduce(BigDecimal.ZERO,BigDecimal::add);
	  
	
	System.out.println(somaTotal2);
	}
	
	
}
