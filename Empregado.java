public class Empregado {

    // Atributos privados
    private String nome;
    private double salarioBruto;
    private double desconto;

    // Construtor
    public Empregado(String n, double x, double y) {
        setNome(n);
        setSalario(x);
        setDesconto(y);
    }

    // Setters
    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setSalario(double salario) {
        this.salarioBruto = salario;
    }

    private void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    // Getters
    private String getNome() {
        return this.nome;
    }

    private double getSalario() {
        return this.salarioBruto;
    }

    private double getDesconto() {
        return this.desconto;
    }

    // Métodos públicos
    public double salarioLiquido() {
        return salarioBruto - desconto;
    }

    public void aumentarSalario(double x) {
        this.salarioBruto += x;
    }
}
