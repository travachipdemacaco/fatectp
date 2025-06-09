package tprecurssiva.somanatural;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        somanatural somaNatural = new somanatural();

        System.out.print("Digite um número natural para calcular a soma até ele: ");
        int numero = scanner.nextInt();

        try {
            int resultado = somaNatural.calcularSoma(numero);
            System.out.println("Soma dos " + numero + " primeiros números naturais: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
