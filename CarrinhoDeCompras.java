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
        System.out.println("--- Talão de Compras ---");
        for (Produto p : itens) {
            double precoFinal = p.calcularPrecoFinal();
            total += precoFinal;
            System.out.printf("%s: R$ %.2f%n", p.getNome(), precoFinal);
        }
        System.out.printf("Total: R$ %.2f%n", total);
    }
}