public class Main {
    public static void main(String[] args) {
        //Instanciando fornecedores
        Fornecedor fazendaLocal = new Fornecedor("Fazenda Local", "123456789", "Brasil");
        Fornecedor techGlobal = new Fornecedor("TechGlobal", "987654321", "China");

        //Criando produtos
        ProdutoAlimenticio arroz = new ProdutoAlimenticio(
                "Arroz", 1111, 10.0, fazendaLocal, 3);
        ProdutoEletronico smartphone = new ProdutoEletronico(
                "Smartphone", 2222, 1000.0, techGlobal, 24);

        //Exibindo cálculo do preço final de cada item
        System.out.println("Preço final do " + arroz.getNome() + ": R$ " + arroz.calcularPrecoFinal());
        System.out.println("Preço final do " + smartphone.getNome() + ": R$ " + smartphone.calcularPrecoFinal());

        //Carrinho de compras
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem(arroz);
        carrinho.adicionarItem(smartphone);

        //Processando compra (exibe total)
        carrinho.processarCompra();
    }
}
