import java.util.Scanner;
import java.util.Locale;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.print("Quantos números deseja digitar? ");
        int tamanho = scanner.nextInt();
        
        double[] numeros = new double[tamanho];
        double soma = 0.0;
        
        System.out.println("Digite " + tamanho + " números reais:");
        
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
            soma += numeros[i];
        }
        
        double media = soma / tamanho;
        
        System.out.println("\nElementos do vetor:");
        for (double numero : numeros) {
            System.out.printf("%.2f ", numero);
        }
        
        System.out.printf("\n\nSoma dos números: %.2f", soma);
        System.out.printf("\nMédia dos números: %.2f", media);
        
        scanner.close();
    }
}