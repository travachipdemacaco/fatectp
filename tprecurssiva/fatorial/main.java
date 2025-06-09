package tprecurssiva.fatorial;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        fatorial fatorial = new fatorial();

        System.out.print("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        try {
            int resultado = fatorial.calcularFatorial(numero);
            System.out.println("Fatorial de " + numero + " é: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
