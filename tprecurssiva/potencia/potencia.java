package tprecurssiva.potencia;

public class potencia {

    public int calcularPotencia(int base, int expoente) {
        if (expoente < 0) {
            throw new IllegalArgumentException("Este método aceita apenas expoentes inteiros não negativos.");
        }
        if (expoente == 0) {
            return 1;
        }
        return base * calcularPotencia(base, expoente - 1);
    }
}
