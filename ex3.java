import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int n = scanner.nextInt();
        
        int[] numeros = new int[n];
        
        System.out.println("Digite os " + n + " números inteiros:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        int qtdPares = 0;
        System.out.println("\nNúmeros pares digitados:");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.print(numero + " ");
                qtdPares++;
            }
        }
        
        System.out.println("\n\nQuantidade de números pares: " + qtdPares);
        
        scanner.close();
    }
}