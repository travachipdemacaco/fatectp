package tprecurssiva.string;

import java.util.Scanner;

public class main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        string inversor = new string();

        System.out.print("Digite uma string para inverter: ");
        String entrada = scanner.nextLine();

        String resultado = inversor.inverter(entrada);
        System.out.println("String invertida (somente letras): " + resultado);

        scanner.close();
    }
}
