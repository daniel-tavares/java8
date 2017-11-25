package projeto.exemplo2;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Classe responsável pela criação e recuperação dos carrinhos de compras.
 */
public class CarrinhoComprasFactory {
    
	Map<String, CarrinhoCompras> carrinho= new HashMap<String,CarrinhoCompras>();
	 
    /**
     * Cria e retorna um novo carrinho de compras para o cliente passado como parâmetro.
     *
     * Caso já exista um carrinho de compras para o cliente passado como parâmetro, este carrinho deverá ser retornado.
     *
     * @param identificacaoCliente
     * @return CarrinhoCompras
     */
    public CarrinhoCompras criar(String identificacaoCliente) {
        if(carrinho.containsKey(identificacaoCliente))
        	return carrinho.get(identificacaoCliente);
        else {
          CarrinhoCompras novoCarrinho= new CarrinhoCompras();
    	  carrinho.put(identificacaoCliente, novoCarrinho);
    	  return novoCarrinho;
        }
    }

    /**
     * Retorna o valor do ticket médio no momento da chamada ao método.
     * O valor do ticket médio é a soma do valor total de todos os carrinhos de compra dividido
     * pela quantidade de carrinhos de compra.
     * O valor retornado deverá ser arredondado com duas casas decimais, seguindo a regra:
     * 0-4 deve ser arredondado para baixo e 5-9 deve ser arredondado para cima.
     *
     * @return BigDecimal
     */
     public BigDecimal getValorTicketMedio() {
       return carrinho.entrySet().stream().map(m->m.getValue().getValorTotal()).reduce(BigDecimal::add).orElse(new BigDecimal(0)).divide(new BigDecimal(carrinho.size())).setScale(2, BigDecimal.ROUND_HALF_EVEN);
     }

    /**
     * Invalida um carrinho de compras quando o cliente faz um checkout ou sua sessão expirar.
     *
     * @param identificacaoCliente
     * @return Retorna um boolean, tendo o valor true caso o cliente passado como parämetro tenha um carrinho de compras e
     * e false caso o cliente não possua um carrinho.
     */
    public boolean invalidar(String identificacaoCliente) {
       return (carrinho.remove(identificacaoCliente)!=null)?true:false;
    }
    
    
    
}
