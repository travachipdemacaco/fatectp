package tprecurssiva.string;

public class string {

    public String inverter(String texto) {
        // Remove tudo que não for letra (A-Z ou a-z)
        String apenasLetras = texto.replaceAll("[^a-zA-Z]", "");

        // Chama a função recursiva
        return inverterRecursivo(apenasLetras);
    }

    private String inverterRecursivo(String texto) {
        if (texto.isEmpty()) {
            return "";
        }
        return inverterRecursivo(texto.substring(1)) + texto.charAt(0);
    }
}
