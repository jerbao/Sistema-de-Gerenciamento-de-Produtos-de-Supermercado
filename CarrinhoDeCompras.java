import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Produto> itens;

    public CarrinhoDeCompras() {
        this.itens = new ArrayList<>();
    }

    /**
     * @param produto produto a ser incluído
     */
    public void adicionarItem(Produto produto) {
        itens.add(produto);
    }

    public void processarCompra() {
        double total = 0.0;
        for (Produto p : itens) {
            total += p.calcularPrecoFinal();
        }
        System.out.println("Valor total da compra: R$ " + total);
    }
}