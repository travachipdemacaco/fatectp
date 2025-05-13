public abstract class Produto {
    private String nome;
    private double preco;

    // Construtor
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Getters e Setters (Encapsulamento)
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    // Método abstrato (será implementado pelas subclasses)
    public abstract double calcularPreco();
}