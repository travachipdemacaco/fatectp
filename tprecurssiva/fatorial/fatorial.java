package tprecurssiva.fatorial;

public class fatorial {

    public int calcularFatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Não é possível calcular o fatorial de um número negativo.");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calcularFatorial(n - 1); // chamada recursiva
    }
}
