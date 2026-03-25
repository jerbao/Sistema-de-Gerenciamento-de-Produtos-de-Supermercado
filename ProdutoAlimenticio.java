public class ProdutoAlimenticio extends Produto {

    private int diasValidade;

    /**
     * @param nome         nome do produto
     * @param codigoBarras código de barras
     * @param precoBase    preço base
     * @param fornecedor   fornecedor associado
     * @param diasValidade dias de validade
     */
    public ProdutoAlimenticio(String nome, int codigoBarras, double precoBase,
                              Fornecedor fornecedor, int diasValidade) {
        super(nome, codigoBarras, precoBase, fornecedor);
        this.diasValidade = diasValidade;
    }

    public int getDiasValidade() {
        return diasValidade;
    }

    public void setDiasValidade(int diasValidade) {
        this.diasValidade = diasValidade;
    }

    @Override
    public double calcularPrecoFinal() {
        double valor = getPrecoBase() * 1.20;//20% de lucro
        if (diasValidade <= 5) {
            valor = valor * 0.70;//30% de desconto para queima de estoque
        }
        return valor;
    }
}