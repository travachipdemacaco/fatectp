package tprecurssiva.fibonacci;

import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        fibonacci fibonacci = new fibonacci();

        System.out.print("Digite a posição (n) da sequência de Fibonacci: ");
        int n = scanner.nextInt();

        try {
            int resultado = fibonacci.calcularFibonacci(n);
            System.out.println("Fibonacci na posição " + n + " é: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
