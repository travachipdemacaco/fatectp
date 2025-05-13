public class Retangulo {

    // Atributos privados
    private double altura;
    private double largura;

    // Construtor
    public Retangulo(double altura, double largura) {
        setAltura(altura);
        setLargura(largura);
    }

    // Getters
    private double getAltura() {
        return altura;
    }

    private double getLargura() {
        return largura;
    }

    // Setters
    private void setAltura(double altura) {
        this.altura = altura;
    }

    private void setLargura(double largura) {
        this.largura = largura;
    }

    // Métodos públicos
    public double area() {
        return largura * altura;
    }

    public double perimetro() {
        return 2 * (largura + altura);
    }

    public double diagonal() {
        return Math.sqrt(largura * largura + altura * altura);
    }

    // toString sobrescrito
    @Override
    public String toString() {
        return String.format(
            "Área: %.2f\nPerímetro: %.2f\nDiagonal: %.2f",
            area(), perimetro(), diagonal()
        );
    }
}
