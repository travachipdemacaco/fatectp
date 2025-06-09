package tprecurssiva.potencia;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        potencia potencia = new potencia();

        System.out.print("Digite a base: ");
        int base = scanner.nextInt();

        System.out.print("Digite o expoente (inteiro não negativo): ");
        int expoente = scanner.nextInt();

        try {
            int resultado = potencia.calcularPotencia(base, expoente);
            System.out.println(base + "^" + expoente + " = " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
