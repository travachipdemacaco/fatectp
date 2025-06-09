package tprecurssiva.somanatural;

public class somanatural {

    public int calcularSoma(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O número deve ser natural (0 ou positivo).");
        }
        if (n == 0) {
            return 0;
        }
        return n + calcularSoma(n - 1); // chamada recursiva
    }
}
