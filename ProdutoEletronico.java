public class ProdutoEletronico extends Produto {

    private int mesesGarantia;

    /**
     * @param nome           nome do produto
     * @param codigoBarras   código de barras
     * @param precoBase      preço base
     * @param fornecedor     fornecedor associado
     * @param mesesGarantia  meses de garantia
     */
    public ProdutoEletronico(String nome, int codigoBarras, double precoBase,
                             Fornecedor fornecedor, int mesesGarantia) {
        super(nome, codigoBarras, precoBase, fornecedor);
        this.mesesGarantia = mesesGarantia;
    }

    public int getMesesGarantia() {
        return mesesGarantia;
    }

    public void setMesesGarantia(int mesesGarantia) {
        this.mesesGarantia = mesesGarantia;
    }

    @Override
    public double calcularPrecoFinal() {
        double valor = getPrecoBase() * 1.50;//50% de margem
        if (mesesGarantia > 12) {
            valor = valor * 1.15;//taxa extra de 15% para garantia estendida
        }
        return valor;
    }
}