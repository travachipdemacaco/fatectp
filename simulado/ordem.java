package simulado;

import java.util.*;

public class ordem {

    // Subrotina para verificar se a lista está ordenada de forma crescente
    public static boolean estaOrdenada(List<Integer> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            if (lista.get(i) > lista.get(i + 1)) {
                return false; // se um número for maior que o próximo, não está crescente
            }
        }
        return true;
    }

    // Subrotina para imprimir o resultado
    public static void imprimirResultado(boolean ordenada) {
        if (ordenada) {
            System.out.println("A lista está em ordem crescente.");
        } else {
            System.out.println("A lista NÃO está em ordem crescente.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma lista de números inteiros separados por espaço:");
        String entrada = scanner.nextLine();
        String[] partes = entrada.split(" ");

        List<Integer> numeros = new ArrayList<>();

        for (String p : partes) {
            try {
                numeros.add(Integer.parseInt(p));
            } catch (NumberFormatException e) {
                System.out.println("Valor inválido ignorado: " + p);
            }
        }

        boolean ordenada = estaOrdenada(numeros);
        imprimirResultado(ordenada);

        scanner.close();
    }
}
