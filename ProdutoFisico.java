// Produto Físico (tem frete)
public class ProdutoFisico extends Produto {
    private double pesoKg;

    public ProdutoFisico(String nome, double preco, double pesoKg) {
        super(nome, preco);
        this.pesoKg = pesoKg;
    }

    @Override
    public double calcularPreco() {
        double frete = pesoKg * 2.5; // Frete calculado pelo peso
        return getPreco() + frete;
    }
}
