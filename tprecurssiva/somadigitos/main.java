package tprecurssiva.somadigitos;

import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        soma soma = new soma ();

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        int resultado = soma.somarDigitos(numero);
        System.out.println("Soma dos dígitos: " + resultado);

        scanner.close();
    }
}
