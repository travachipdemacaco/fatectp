import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        while (true) {
            System.out.print("Digite a quantidade de números (1 a 10): ");
            n = scanner.nextInt();
            
            if (n >= 1 && n <= 10) {
                break; 
            }
            System.out.println("Valor inválido! Digite um número entre 1 e 10.");
        }
        
        int[] numeros = new int[n];
        
        System.out.println("Digite " + n + " números inteiros:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("\nNúmeros negativos digitados:");
        boolean encontrouNegativo = false;
        
        for (int num : numeros) {
            if (num < 0) {
                System.out.println(num);
                encontrouNegativo = true;
            }
        }
        
        if (!encontrouNegativo) {
            System.out.println("Nenhum número negativo foi digitado.");
        }
        
        scanner.close();
    }
}