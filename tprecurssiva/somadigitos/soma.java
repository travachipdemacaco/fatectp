package tprecurssiva.somadigitos;

public class soma {

    public int somarDigitos(int numero) {
        numero = Math.abs(numero); // Garante que seja positivo

        if (numero < 10) {
            return numero;
        }

        return (numero % 10) + somarDigitos(numero / 10);
    }
}
