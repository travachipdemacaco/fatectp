import java.util.Scanner;
import java.util.Locale;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Digite a quantidade de números: ");
        int n = scanner.nextInt();
        
        double[] numeros = new double[n];
        
        System.out.println("Digite os " + n + " números reais:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }
        
        double maior = numeros[0];
        int posicao = 0;
        
        for (int i = 1; i < n; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                posicao = i;
            }
        }
        
        System.out.printf("\nO maior número é: %.2f", maior);
        System.out.println("\nPosição no vetor: " + (posicao + 1));
        
        scanner.close();
    }
}