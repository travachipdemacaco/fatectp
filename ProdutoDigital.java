// Produto Digital (sem frete, mas com taxa de licença)
public class ProdutoDigital extends Produto {
    public ProdutoDigital(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularPreco() {
        return getPreco() * 1.1; // Acrescenta 10% de taxa digital
    }
}
