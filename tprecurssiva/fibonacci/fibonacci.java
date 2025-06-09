package tprecurssiva.fibonacci;

public class fibonacci {

    public int calcularFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Índice da sequência deve ser 0 ou maior.");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return calcularFibonacci(n - 1) + calcularFibonacci(n - 2); // chamada recursiva
    }
}
