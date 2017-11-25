package projeto.exemplo2;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


/**
 * Classe que representa o carrinho de compras de um cliente.
 */
public class CarrinhoCompras {
	
  
	List<Item> itensCarrinho=new ArrayList<Item>();
	 
	
	
    /**
     * Permite a adição de um novo item no carrinho de compras.
     *
     * Caso o item já exista no carrinho para este mesmo produto, as seguintes regras deverão ser seguidas:
     * - A quantidade do item deverá ser a soma da quantidade atual com a quantidade passada como parâmetro.
     * - Se o valor unitário informado for diferente do valor unitário atual do item, o novo valor unitário do item deverá ser
     * o passado como parâmetro.
     *
     * Devem ser lançadas subclasses de RuntimeException caso não seja possível adicionar o item ao carrinho de compras.
     *
     * @param produto
     * @param valorUnitario
     * @param quantidade
     */
    public void adicionarItem(Produto produto, BigDecimal valorUnitario, int quantidade) {
    	try {
	    	List <Item> itens=itensCarrinho.stream().filter(c->c.getProduto().equals(produto)).collect(Collectors.toList());
	    	if(!itens.isEmpty()) {
	    		itensCarrinho.set(itens.indexOf(itens.get(0)),new Item(produto, valorUnitario, (quantidade+itens.get(0).getQuantidade())));
	    	}else {
	    		itensCarrinho.add(new Item(produto, valorUnitario, quantidade));
	    	} 
    	}catch(NullPointerException e) {
    		throw new NullPointerException("Erro ao adicionar item: "+e);
    	}catch(ArrayIndexOutOfBoundsException e) {
    		throw new ArrayIndexOutOfBoundsException("Erro ao adicionar item: "+e);
    	}
    }

    /**
     * Permite a remoção do item que representa este produto do carrinho de compras.
     *
     * @param produto
     * @return Retorna um boolean, tendo o valor true caso o produto exista no carrinho de compras e false
     * caso o produto não exista no carrinho.
     */
    public boolean removerItem(Produto produto) {
      return itensCarrinho.remove(itensCarrinho.stream().filter(i->i.getProduto().equals(produto)).collect(Collectors.toList()).get(0));	   
    }

    /**
     * Permite a remoção do item de acordo com a posição.
     * Essa posição deve ser determinada pela ordem de inclusão do produto na 
     * coleção, em que zero representa o primeiro item.
     *
     * @param posicaoItem
     * @return Retorna um boolean, tendo o valor true caso o produto exista no carrinho de compras e false
     * caso o produto não exista no carrinho.
     */
    public boolean removerItem(int posicaoItem) {
       return itensCarrinho.remove(itensCarrinho.get(posicaoItem));	
    }

    /**
     * Retorna o valor total do carrinho de compras, que deve ser a soma dos valores totais
     * de todos os itens que compõem o carrinho.
     *
     * @return BigDecimal
     */
    public BigDecimal getValorTotal() {
        return  itensCarrinho.stream().map(i->(i.getValorUnitario().multiply(new BigDecimal(i.getQuantidade())))).reduce(BigDecimal::add).orElse(new BigDecimal(0));
    }

    /**
     * Retorna a lista de itens do carrinho de compras.
     *
     * @return itens
     */
    public Collection<Item> getItens() {
        return itensCarrinho;
    }
}